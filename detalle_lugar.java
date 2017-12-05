package com.example.quimbayo.happycucuta;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quimbayo.happycucuta.funciones.Funciones;
import com.example.quimbayo.happycucuta.variables.Lugares;

public class detalle_lugar extends AppCompatActivity {

    TextView campoId, campoNombre, campoTelefono, campoDireccion, campoHorario, campoLatitud, campoLongitud, campoIMAGE;
    ImageView campoImg;
    Button btnmodificar,btneliminar;
    Button btnllegar;
    ConexionSQLiteHelper conn;
    ImageView imageVer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_lugar);

        btnllegar=(Button) findViewById(R.id.btnLlegar);

       /* btnllegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openMain= new Intent(detalle_lugar.this, map_sitios.class);
                startActivity(openMain);


            }
        });*/

        conn=new ConexionSQLiteHelper(getApplicationContext(),"bd_personas",null,1);

        campoId = (TextView) findViewById(R.id.campoId);
        campoNombre = (TextView) findViewById(R.id.campoNombre);
        campoTelefono = (TextView) findViewById(R.id.campoTelefono);
        campoDireccion = (TextView) findViewById(R.id.campoDireccion);
        campoHorario = (TextView) findViewById(R.id.campoHorario);
        campoLatitud = (TextView) findViewById(R.id.campoLatitud);
        campoLongitud = (TextView) findViewById(R.id.campoLongitud);
        campoIMAGE = (TextView) findViewById(R.id.campoImg);
        imageVer =  (ImageView)findViewById(R.id.imgSitio);
        btneliminar = (Button) findViewById(R.id.btnEliminar);


        Bundle objetoEnviado=getIntent().getExtras();
        Lugares user=null;

        if(objetoEnviado!=null){
            user= (Lugares) objetoEnviado.getSerializable("lugares");
            campoId.setText(user.getId().toString());
            campoNombre.setText(user.getLugar().toString());
            campoTelefono.setText(user.getTelefono().toString());
            campoDireccion.setText(user.getDireccion().toString());
            campoHorario.setText(user.getHorario().toString());
            campoLatitud.setText(user.getLatitud().toString());
            campoLongitud.setText(user.getLongitud().toString());
            campoIMAGE.setText(user.getImg().toString());
            String valorimg=user.getImg().toString();

            //mostrar imagen
            String uri = "@drawable/";
            String ruta=uri+valorimg;
            int imageResource = getResources().getIdentifier(ruta, null, getPackageName());
            Drawable imagen = ContextCompat.getDrawable(getApplicationContext(), imageResource);
            imageVer.setImageDrawable(imagen);
        }


        btneliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db=conn.getWritableDatabase();
                String[] parametros={campoId.getText().toString()};

                db.delete(Funciones.TABLA_LUGAR,Funciones.CAMPO_ID+"=?",parametros);
                Toast.makeText(getApplicationContext(),"Ya se Eliminó la persona",Toast.LENGTH_LONG).show();
                campoId.setText("");
                db.close();
                Intent openMain= new Intent(detalle_lugar.this, MainActivity.class);
                startActivity(openMain);

            }
        });

    }
}
