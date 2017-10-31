package com.desafiolatam.casitaapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.desafiolatam.casitaapp.R;
import com.desafiolatam.casitaapp.models.Pending;
import com.desafiolatam.casitaapp.nodes.Nodes;
import com.firebase.ui.database.FirebaseRecyclerAdapter;

/**
 * Created by Samuel on 27-10-2017.
 */

public class PendingAdapter extends FirebaseRecyclerAdapter <Pending, PendingAdapter.PendingHolder>{


    public PendingAdapter() {
        super(Pending.class, R.layout.list_item_pending, PendingHolder.class, new Nodes().query());
    }

    @Override
    protected void populateViewHolder(PendingHolder viewHolder, Pending model, int position) {
        viewHolder.name.setText(model.getName());
        viewHolder.description.setText(model.getDescription());

    }

    public static class PendingHolder extends RecyclerView.ViewHolder {

        TextView name, description;

        public PendingHolder(View itemView){
            super(itemView);
            name = itemView.findViewById(R.id.nameTV);
            description = itemView.findViewById(R.id.DescriptionTV);

        }


    }

}
