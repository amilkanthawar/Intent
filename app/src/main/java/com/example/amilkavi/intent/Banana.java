package com.example.amilkavi.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Banana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana);
        Bundle applesData = getIntent().getExtras();

        if (applesData==null){
            return;
        }

        final TextView messageForBanana = (TextView) findViewById(R.id.messageForBanana);
        messageForBanana.setText(applesData.getString("messageFromApple"));
    }

    public void onClick(View view){

        Intent intent = new Intent(this, Apple.class);
        startActivity(intent);
    }
}
