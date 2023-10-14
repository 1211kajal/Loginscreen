package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class register extends AppCompatActivity {
    Button submit;
    Button back;
    EditText username ;
    EditText name ;
    EditText address ;
    EditText area ;
    EditText phone ;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        submit=findViewById(R.id.submit);
        name=findViewById(R.id.name);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        address = findViewById(R.id.address);
        area = findViewById(R.id.area);
        phone = findViewById(R.id.phone);
        back=findViewById(R.id.back);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")&&name.getText().toString().equals("Rat") && area.getText().toString().equals("Kilpauk")&&address.getText().toString().equals("coromandel towers") && phone.getText().toString().equals("1234567890")) {
                    Toast.makeText(register.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(register.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(register.this, "Fill completely!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(register.this, MainActivity.class);
                    startActivity(intent);
            }
        });
    }
}