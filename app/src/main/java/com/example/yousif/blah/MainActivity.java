package com.example.yousif.blah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.nm);
        Password = (EditText) findViewById(R.id.pss);
        Login = (Button) findViewById(R.id.lgn);

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            });
        }
    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("Hello")) && (userPassword.equals("World"))) {
            Intent intent = new Intent(MainActivity.this, Page1.class);
            startActivity(intent);
        }
        
}
