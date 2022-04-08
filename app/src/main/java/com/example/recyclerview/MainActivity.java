package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.recyclerview.databinding.ActivityDetailActiviyBinding;
import com.example.recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<LandMark> landList;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        LandMark pisa=new LandMark("pisa","italya",R.drawable.pisa);
        LandMark eifel=new LandMark("eifel","paris",R.drawable.eifel);
        LandMark ozgur=new LandMark("özgürlük","amerika",R.drawable.ozgurluk);
        LandMark istanbul=new LandMark("köprü","turkiye",R.drawable.fsm);
        landList=new ArrayList<>();


        landList.add(pisa);
        landList.add(eifel);
        landList.add(ozgur);
        landList.add(istanbul);

        binding.recView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landList);
        binding.recView.setAdapter(landmarkAdapter);
    }
}