package com.example.maylet.ap1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class P2 extends Activity {

    private Button bNext;
    private EditText tNombre;
    private EditText tPaterno;
    private EditText tMaterno;

    private String datos[] = {null,null,null};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);

        /*se realiza un vinculo con los objetos contenidos
         * dentro del fichero activity_p2.xml*/
        bNext = (Button)findViewById(R.id.buttonNext);
        tNombre = (EditText)findViewById(R.id.editTextNombre);
        tPaterno = (EditText)findViewById(R.id.editTextPaterno);
        tMaterno = (EditText)findViewById(R.id.editTextMaterno);

        /*el metodo setOnClickListener recibe como parametro
         * un evento OnClick*/
        bNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /*Aqui se escriben las acciones que se realizan
                 * al pulsar sobre el boton.
                 */
                datos[0] =tNombre.getText().toString().toUpperCase();
                datos[1] =tPaterno.getText().toString().toUpperCase();
                datos[2] =tMaterno.getText().toString().toUpperCase();

                /*se evalua que el contenido del Array datos sea igual
                 * a null*/
                if((datos[0].equals("")) || (datos[1].equals(""))
                        || (datos[2].equals(""))){

                    /*el objeto Toast es un mensaje emergente de
                     * corta duracion en pantalla.*/
                    Toast.makeText(getApplicationContext(),
                            "Faltaron campos por llenar",
                            1).show();
                    /*los parametros del metodo makeText,
                     * corresponden al contexto, al texto
                     * y al tiempo que dura el texto en
                     * pantalla cuando se llama al metodo
                     * show()*/
                }else{
                    /*si el contenido del Array datos no es
                     * igual a null se crea un Intent y
                     * se envian los datos al siguente
                     * Activity*/
                    Intent miIntent2 = new Intent(P2.this,P3.class);
                    /*el metodo putExtra sirve para enviar datos
                     * a otro Activity,recibe dos parametros, el
                     * primero es de tipo String y es una llave
                     * o nombre con el cual identificar al Intent
                     * que envio los datos; el segundo parametro
                     * corresponde a los datos que seran enviados,
                     * pueden ser cadenas, enteros,
                     * flotantes o booleanos.
                     */
                    miIntent2.putExtra("datosP2",datos);
                    startActivity(miIntent2);
                }
            }
        });
    }
}

