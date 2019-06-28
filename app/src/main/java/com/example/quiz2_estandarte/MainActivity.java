package com.example.quiz2_estandarte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("message", "onStart() has executed.. ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("message", "onResume() has executed.. ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("message", "onPause() has executed.. ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("message", "onStop() has executed.. ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message", "onDestroy() has executed.. ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message", "onRestart() has executed.. ");
    }

    public void cancelbtn(View v){
        Toast toast = Toast.makeText(this, "Cancel button was clicked...", Toast.LENGTH_LONG);
        toast.show();
    }

    public void proceedbtn(View v){
        Snackbar sbar = Snackbar.make(v, "Proceed button was clicked...", Snackbar.LENGTH_LONG);
        sbar.show();
    }
}
