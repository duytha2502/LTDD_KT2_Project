package com.example.ltdd_kt1_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.storage.FirebaseStorage;

import java.util.HashMap;

public class LoginActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView email = findViewById(R.id.txtName);
        TextView password = findViewById(R.id.txtPassword);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(email.getText().toString().equals("duy") && password.getText().toString().equals("123")){
                    Toast.makeText(LoginActivity.this,"Login successful",Toast.LENGTH_SHORT).show();
                    Intent ListScreen = new Intent(LoginActivity.this,ListActivity.class);
                    startActivity(ListScreen);
                }else
                    Toast.makeText(LoginActivity.this,"Login failed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
