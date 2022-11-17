package com.example.infomanga2_0;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CardView extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("#FF0000","Berserk","Kentaro Miura"));
        elements.add(new ListElement("#FFF000","One Punch Man","Yusuke Murata"));
        elements.add(new ListElement("#0FFF00","Vagabond","Takehiko Inoue"));
        elements.add(new ListElement("#00FFF0","Dragon Ball Super","Akira Toriyama"));
        elements.add(new ListElement("#0000FF","Rikudo","Matsubara Toshimitsu"));
        elements.add(new ListElement("#FF00FF","Kengan Ashura","Daromeon"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}