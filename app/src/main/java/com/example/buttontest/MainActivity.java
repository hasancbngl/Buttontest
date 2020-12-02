package com.example.buttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
   public void clickFunction(View view) {
       EditText editText= (EditText) findViewById(R.id.editText);
       Toast.makeText(MainActivity.this, "Hello " + editText.getText().toString() + "!!" , Toast.LENGTH_SHORT).show();
       Log.i("Congratulations.", editText.getText().toString());

   }


                         @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
