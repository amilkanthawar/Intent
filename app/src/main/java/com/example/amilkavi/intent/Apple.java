package com.example.amilkavi.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Apple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);
    }

    public void onClick(View view){

        Intent intent = new Intent(this, Banana.class);

        final EditText applesMessage = (EditText)findViewById(R.id.applesMessage);
        intent.putExtra("messageFromApple",applesMessage.getText().toString());
        startActivity(intent);
    }
}
