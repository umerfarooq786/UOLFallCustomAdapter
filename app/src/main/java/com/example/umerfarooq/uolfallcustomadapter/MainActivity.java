package com.example.umerfarooq.uolfallcustomadapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.umerfarooq.uolfallcustomadapter.adapters.UserAdapter;
import com.example.umerfarooq.uolfallcustomadapter.models.User;
import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView= (ListView) findViewById(R.id.list1);
        ArrayList<User> arrayList=new ArrayList<>();
        //arrayList.add(new User(1,"u1","r1","n1","f1"));
        for(int i=1;i<=1000;i++)
        {
            arrayList.add(new User(i+1," user "+i," password "+i," roll number "+i," fullname "+i));
        }
        UserAdapter userAdapter=new UserAdapter(this,arrayList);
        listView.setAdapter(userAdapter);
    }

}
