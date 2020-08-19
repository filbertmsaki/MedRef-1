package com.stekdigital.medref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Diet extends AppCompatActivity implements View.OnClickListener{
    private Button homeBtn;
    private Button profileBtn;
    private Intent home_btn;
    private Intent profile_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
        homeBtn = findViewById(R.id.home_btn);
        profileBtn = findViewById(R.id.profilebtn);

        homeBtn.setOnClickListener(this);
        profileBtn.setOnClickListener(this);

        home_btn = new Intent(this, MainActivity.class);
        profile_btn = new Intent(this, Profile.class);

    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.home_btn)
        {
            startActivity(home_btn);
        }
        if(v.getId() == R.id.profilebtn)
        {
            startActivity(profile_btn);
        }
    }
}