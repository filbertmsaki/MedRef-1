package com.stekdigital.medref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bmi extends AppCompatActivity implements View.OnClickListener{
    EditText weight, height;
    TextView result_text;
    String calculation, BMIresult;

    private Intent home_btn;
    private Intent diet_btn;
    private Intent fitness_btn;
    private Intent profile_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button homeBtn;
        Button dietBtn;
        Button fitnessBtn;
        Button profileBtn;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        weight = findViewById(R.id.weightData);
        height = findViewById(R.id.heightData);
        result_text = findViewById(R.id.results);

        homeBtn = findViewById(R.id.home_btn);
        dietBtn = findViewById(R.id.dietbtn);
        fitnessBtn = findViewById(R.id.fitnessbtn);
        profileBtn = findViewById(R.id.profilebtn);

        homeBtn.setOnClickListener(this);
        dietBtn.setOnClickListener(this);
        fitnessBtn.setOnClickListener(this);
        profileBtn.setOnClickListener(this);

        home_btn = new Intent(this, MainActivity.class);
        diet_btn = new Intent(this, Diet.class);
        fitness_btn = new Intent(this, Fitness.class);
        profile_btn = new Intent(this, Profile.class);
    }

    public void calculateBMI(View v2){
        String s1 = weight.getText().toString();
        String s2 = height.getText().toString();

        float weightValue = Float.parseFloat(s1);
        float heightValue = Float.parseFloat(s2) / 100;
        float bmi = weightValue / (heightValue * heightValue);

        if(bmi < 16){
          BMIresult = "Severely under weight";
        }
        else if(bmi >= 16 && bmi < 18.5){
            BMIresult = "Under weight";
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            BMIresult = "Normal weight";
        }
        else if(bmi >= 25 && bmi <= 29.9){
            BMIresult = "Over weight";
        }
        else{
            BMIresult = "Obese";
        }
        calculation = " Your BMI result is: " + bmi + "\n\n Status: " + BMIresult;
        result_text.setText(calculation);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.home_btn)
        {
            //onBackPressed();
            startActivity(home_btn);
        }
        if(v.getId() == R.id.dietbtn)
        {
            startActivity(diet_btn);
        }
        if(v.getId() == R.id.fitnessbtn)
        {
            startActivity(fitness_btn);
        }
        if(v.getId() == R.id.profilebtn)
        {
            startActivity(profile_btn);
        }
    }
}