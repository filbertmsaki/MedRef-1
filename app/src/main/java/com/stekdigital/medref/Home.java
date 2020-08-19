package com.stekdigital.medref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener{
    private Button bmiBtn;
    private Button dietBtn;
    private Button fitnessBtn;
    private Button profileBtn;
    private Intent bmi_btn;
    private Intent diet_btn;
    private Intent fitness_btn;
    private Intent profile_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bmiBtn = (Button)findViewById(R.id.bmi_btn);
        dietBtn = (Button)findViewById(R.id.diet_btn);
        fitnessBtn = (Button)findViewById(R.id.fitness_btn);
        profileBtn = (Button)findViewById(R.id.profile_btn);

        bmiBtn.setOnClickListener(this);
        fitnessBtn.setOnClickListener(this);
        profileBtn.setOnClickListener(this);
        dietBtn.setOnClickListener(this);

        bmi_btn = new Intent(this, Bmi.class);
        diet_btn = new Intent(this, Diet.class);
        fitness_btn = new Intent(this, Fitness.class);
        profile_btn = new Intent(this, Profile.class);

    }
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.bmi_btn)
        {
            startActivity(bmi_btn);
        }
        if(v.getId() == R.id.diet_btn)
        {
            startActivity(diet_btn);
        }
        if(v.getId() == R.id.fitness_btn)
        {
            startActivity(fitness_btn);
        }
        if(v.getId() == R.id.profile_btn)
        {
            startActivity(profile_btn);
        }

    }


}