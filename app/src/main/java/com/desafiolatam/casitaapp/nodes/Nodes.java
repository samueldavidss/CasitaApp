package com.desafiolatam.casitaapp.nodes;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

/**
 * Created by Samuel on 27-10-2017.
 */

public class Nodes {

    private DatabaseReference root = FirebaseDatabase.getInstance().getReference();

    public DatabaseReference pendings(){
        return root.child("Tarea");
    }
    public Query query(){

        return root.child("Tarea").orderByValue();
    }


}
