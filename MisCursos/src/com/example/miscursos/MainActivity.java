package com.example.miscursos;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }
    public void c1(View View) {
		// TODO Auto-generated method stub
    	Toast.makeText(getApplicationContext(), "DOS(2)Horas a la semana", Toast.LENGTH_LONG).show();
	}
    public void c2(View View) {
		// TODO Auto-generated method stub
    	Toast.makeText(getApplicationContext(), "DOS(2)Horas a la semana", Toast.LENGTH_LONG).show();
	}
    public void c3(View View) {
		// TODO Auto-generated method stub
    	Toast.makeText(getApplicationContext(), "DOS(2)Horas a la semana", Toast.LENGTH_LONG).show();
	}
    public void c4(View View) {
		// TODO Auto-generated method stub
    	Toast.makeText(getApplicationContext(), "OCHO(8)Horas a la semana", Toast.LENGTH_LONG).show();
	}
    public void c5(View View) {
		// TODO Auto-generated method stub
    	Toast.makeText(getApplicationContext(), "DOS(2)Horas a la semana", Toast.LENGTH_LONG).show();
	}
    public void c6(View View) {
		// TODO Auto-generated method stub
    	Toast.makeText(getApplicationContext(), "CUATRO(4)Horas a la semana", Toast.LENGTH_LONG).show();
	}
    public void c7(View View) {
		// TODO Auto-generated method stub
    	Toast.makeText(getApplicationContext(), "CINCO(5)Horas a la semana", Toast.LENGTH_LONG).show();
	}
    
}
