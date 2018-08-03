package com.example.maylet.ap1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class P1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_p1, menu);
        return true;
    }

    //metodo que llama a otro Activity
    public boolean onOptionsItemSelected(MenuItem mi){
        //evalua la opcion elejida al presionar la tecla menu
        switch(mi.getItemId()){
            case R.id.menu_settings:
                /*si la opcion seleccionada corresponde al parametro
                 * R.id.menu_settings , entonces crea un nuevo
                 * Intent el cual recibe dos parametros de entrada,
                 * el primero corresponde a la clase actual P1.this , y
                 * el segundo a la clase a la que se desea acceder
                 * P2.class, la cual es un Activity*/
                Intent miIntent1 = new Intent(P1.this,P2.class);
                /*este metodo inicia la ejecucion del Activity, y
                 * recibe como parametro de entrada un Intent*/
                startActivity(miIntent1);
                break;
        }
        return true;
    }

}
