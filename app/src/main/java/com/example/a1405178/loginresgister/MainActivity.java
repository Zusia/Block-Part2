package com.example.a1405178.loginresgister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etUsername= (EditText) findViewById(R.id.etUsername);
        final EditText etPassword= (EditText) findViewById(R.id.etPassword);
        final Button bLogin=(Button) findViewById(R.id.etlogin);
        final TextView RegisterLink=(TextView)findViewById(R.id.tvRegisterHere);

        RegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent =new Intent(MainActivity.this,RegisterActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });

    }
}
