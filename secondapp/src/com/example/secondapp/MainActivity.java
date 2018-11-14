package com.example.secondapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart(){
    	super.onStart();
    	Toast.makeText(this, "Hola el ciclo del activity es Start", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	Toast.makeText(this, "Hola estamos perdidos en esta clase", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    	Toast.makeText(this, "Hola quien soy", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	Toast.makeText(this, "Hola quien es la analy", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	Toast.makeText(this, "Hola Iluminatis", Toast.LENGTH_SHORT).show();
    }
    
}
