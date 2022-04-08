package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.recyclerview.databinding.ActivityDetailActiviyBinding;

public class DetailActiviy extends AppCompatActivity {

    private ActivityDetailActiviyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailActiviyBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent=getIntent();

        LandMark selected= (LandMark) intent.getSerializableExtra("landmark");
        binding.textView.setText(selected.name);
        binding.textView2.setText(selected.country);
        binding.imageView.setImageResource(selected.draw);


    }
}