package com.example.demoapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final EditText editTextInput = findViewById(R.id.editText);
        final TextView hintTextView = findViewById(R.id.hintTexView);
        final ImageView imageView = findViewById(R.id.image);

        Button clickMeBtn = findViewById(R.id.clickMeBtn);
        clickMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //short message
//              Toast.makeText(getApplicationContext(),"Ai apasat", Toast.LENGTH_LONG).show(); //or *class.this* for context
                String textFromInput = editTextInput.getText().toString();
                hintTextView.setText(textFromInput);
                imageView.setVisibility(View.GONE);

            }
        });



    }
}