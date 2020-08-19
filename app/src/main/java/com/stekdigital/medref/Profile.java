package com.stekdigital.medref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity implements View.OnClickListener{
    private Button logoutBtn;
    private Intent logout_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        logoutBtn = findViewById(R.id.logoutbtn);

        logoutBtn.setOnClickListener(this);

        logout_btn = new Intent(this, MainActivity.class);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.logoutbtn)
        {
            startActivity(logout_btn);
        }
    }
}