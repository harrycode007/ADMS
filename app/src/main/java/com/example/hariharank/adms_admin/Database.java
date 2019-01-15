package com.example.hariharank.adms_admin;

import android.support.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private DatabaseReference mDatabase;
    DatabaseReference use;
    ArrayList<User> l;

    public Database(){
        mDatabase=FirebaseDatabase.getInstance().getReference();
         use=mDatabase.getDatabase().getReference("users");

    }

    public void insert(String name,String rollno,String phone,String date,String frndrn,String frnddt,int is){
        String r=rollno.substring(11,rollno.length());
        User user= new User(name,rollno,phone,date,frndrn,frnddt,is);
        use.child(r).setValue(user);
    }

    public ArrayList<User> read(){

        use.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);
                l=new ArrayList<User>();
                l.add(new User(user.name,user.rollno,user.phone_no,user.delivery_date,user.friend_roll_no,user.friend_phone_no,user.isDelivered));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        return l;
    }

    public void status(String rollno){
        int i=1;
        use.child(rollno).child("isDelivered").setValue(i);

    }


}
