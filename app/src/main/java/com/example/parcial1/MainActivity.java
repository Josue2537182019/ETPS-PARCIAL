package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     EditText etUsern;
     EditText etPasw;
     Button blog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etUsern = findViewById(R.id.eusername);
        etPasw = findViewById(R.id.epassword);
        blog = findViewById(R.id.blogin);


        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsern.getText().toString();
                String password = etPasw.getText().toString();

                if (username.equals("parcialETps1") && password.equals("p4rC14l#tp$")) {

                    Intent intent = new Intent(MainActivity.this, NextActivity.class);
                    startActivity(intent);
                } else {

                    Toast.makeText(MainActivity.this, "Contraseña y usuario no son correctos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
