package com.example.vansapp;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	//heredando un sub hijo de las clase ListView
	private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //llamando al id de la lista de layou.
      listView=(ListView) findViewById(R.id.lista_de_contactos);
      //Creando un variable del tipo de lista con arralist "nombres"
      final List<String> nombres=new ArrayList<String>();
      // agregando registro a nuestra lista "nombres"
      nombres.add("David Ramirez Lopez");
      nombres.add("Jose Maldonado Perez");
      nombres.add("Rosa de la Cruz Salcedo");
      nombres.add("Maria Fernandez Quispe");
      nombres.add("Josue Fernandez Quispe");
      nombres.add("Franklin Miranda Ramirez");
      nombres.add("David Espinoza Huanca");
      nombres.add("Elva Huaman Catunta");
      nombres.add("Edith Cutire Chura");
      //creamos un adaptador para ingresar nuestor listdo "nombres"
      ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nombres);
      // llamamos al adapter en nuestro is "listView" del layout
      listView.setAdapter(adapter);
      //mensajes en la lista
      listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
    	  @Override
    	  public void onItemClick(AdapterView<?> AdapterView, View view, int position, long id){
    		  //Todo auto-generated method stup
    		 
    		  //mensaje
    			Toast.makeText(MainActivity.this, "Hola profe Segundo somos de Computacion en Informatica ", Toast.LENGTH_LONG).show(); 
    	  }

      });
      
    }

 
}
