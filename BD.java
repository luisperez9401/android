package com.example.quimbayo.happycucuta;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.quimbayo.happycucuta.funciones.Funciones;

public class MainActivity extends AppCompatActivity {

    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingresar=(Button) findViewById(R.id.btnIngresar);

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openMain= new Intent(MainActivity.this, listado_sitios.class);
                registrarLugares();
                startActivity(openMain);


            }
        });
    }

    private void registrarLugares() {
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd_lugares",null,1);

        SQLiteDatabase db=conn.getWritableDatabase();

        String id="1";
        String sitio="CITY PARK";
        String tel="5948381";
        String dir="C.C Ventura Plaza Local 312, Calle 11 # 0E -137, Cúcuta, Norte de Santander";
        String hor="10 am hasta las 10 pm.";
        String lat="7.888261";
        String lon="-72.496341";
        String img="citypark";

        String id2="2";
        String sitio2="ECOPARQUE SAN RAFAEL";
        String tel2="320 3335256";
        String dir2="Av. 5A #6-66, Los Patios, Cúcuta, Norte de Santander";
        String hor2="09 am hasta las 5 pm";
        String lat2="7.862105";
        String lon2="-72.501404";
        String img2="ecoparque";

        String id3="3";
        String sitio3="PISCILAGOS";
        String tel3="578 92 38";
        String dir3="Parcela Los Delirios, Zulia";
        String hor3="08 am hasta las 7 pm";
        String lat3="7.928313";
        String lon3="-72.599236";
        String img3="piscilagos";

        String id4="4";
        String sitio4="HAPPY CITY";
        String tel4="581 83 64";
        String dir4="Centro Comercial Unicentro Local 1-51, Av. Libertadores con Canal Bogotá, Prados Norte";
        String hor4="11 am hasta las 10 pm";
        String lat4="7.916412";
        String lon4="-72.493542";
        String img4="happycity";

        String id5="5";
        String sitio5="MEGALAND";
        String tel5="323 206 22 61";
        String dir5="Av. libertadores con Av. 0a  Barrio Blanco";
        String hor5="4 pm hasta las 9:45 pm";
        String lat5="7.876134";
        String lon5="-72.496745";
        String img5="megaland";

        String id6="6";
        String sitio6="CIRCUS POP";
        String tel6="317 365 74 63";
        String dir6="Calle 8  11e 53 Colsag";
        String hor6="4 pm hasta las 12 am";
        String lat6="7.890780";
        String lon6="-72.488159";
        String img6="circus";

        String id7="7";
        String sitio7="PUEBLITO PEPSI";
        String tel7="304 377 20 21";
        String dir7="Calle 9 No. 11E-39, Barrio La Riviera";
        String hor7="4 pm hasta las 12 am";
        String lat7="7.890007";
        String lon7="-72.488553";
        String img7="pueblito";

        String id8="8";
        String sitio8="CENTRO RECREACIONAL ISCALAND";
        String tel8="321 949 71 63";
        String dir8="Av. 15 #12-42, Barrio Cundinamarca";
        String hor8="4 pm hasta las 12 am";
        String lat8="7.882648";
        String lon8="-72.513812";
        String img8="iscaland";

        String id9="9";
        String sitio9="LAGO PARK";
        String tel9="320 856 51 96";
        String dir9="Km 17 Vía Pamplona Vía Los Vados Los Patios";
        String hor9="9 am hasta las 6 pm";
        String lat9="7.772737";
        String lon9="-72.520197";
        String img9="lagopark";

        String id10="10";
        String sitio10="VILLA SILVANIA";
        String tel10="321 942 99 40";
        String dir10="Km 4 Vía Bocono";
        String hor10="10 am hasta las 5 pm";
        String lat10="7.878101";
        String lon10="-72.464562";
        String img10="villa";

        String id11="11";
        String sitio11="TEMPLO HISTORICO";
        String tel11="No Existe";
        String dir11="Autopista San Antonio, Villa Del Rosario";
        String hor11="10 am hasta las 5 pm";
        String lat11="7.829757";
        String lon11="-72.462682";
        String img11="templo";

        String id12="12";
        String sitio12="BOLERA MALL";
        String tel12="570 43 43";
        String dir12="Cr 0 # 6-33 Autopista Internacional Villa Del Rosario";
        String hor12="02 pm hasta las 12 am";
        String lat12="7.830824";
        String lon12="-72.462281";
        String img12="bolera";

        String id13="13";
        String sitio13="CLUB CAMPESTRE SANTANDER ";
        String tel13="570 93 27";
        String dir13="Cl 7 # 12-77 Villa Del Rosario, Villa Del Rosario";
        String hor13="Horario a solicitud de eventos";
        String lat13="7.821117";
        String lon13="-72.459159";
        String img13="club";

        String id14="14";
        String sitio14="MARIA TOMATINA Y DON TOMATON";
        String tel14="316 480 01 99";
        String dir14="a 0-99, Av. 3 Este #0-1, Cúcuta";
        String hor14="9 am hasta las 7 pm";
        String lat14="7.897639";
        String lon14="-72.496270";
        String img14="maria";

        String id15="15";
        String sitio15="RANCHO VILLA LUZ";
        String tel15="570 32 94";
        String dir15="Carretera Antigua A San Antonio Vía A Boconó";
        String hor15="10 am hasta las 5 pm";
        String lat15="7.870450";
        String lon15="--72.463345";
        String img15="rancho";


        ContentValues values=new ContentValues();
        values.put(Funciones.CAMPO_ID,id);
        values.put(Funciones.CAMPO_LUGAR,sitio);
        values.put(Funciones.CAMPO_TELEFONO,tel);
        values.put(Funciones.CAMPO_DIRECCION,dir);
        values.put(Funciones.CAMPO_HORARIO,hor);
        values.put(Funciones.CAMPO_LATITUD,lat);
        values.put(Funciones.CAMPO_LONGITUD,lon);
        values.put(Funciones.CAMPO_IMG,img);

        Long idResultante=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values);

        ContentValues values2=new ContentValues();
        values2.put(Funciones.CAMPO_ID,id2);
        values2.put(Funciones.CAMPO_LUGAR,sitio2);
        values2.put(Funciones.CAMPO_TELEFONO,tel2);
        values2.put(Funciones.CAMPO_DIRECCION,dir2);
        values2.put(Funciones.CAMPO_HORARIO,hor2);
        values2.put(Funciones.CAMPO_LATITUD,lat2);
        values2.put(Funciones.CAMPO_LONGITUD,lon2);
        values2.put(Funciones.CAMPO_IMG,img2);

        Long idResultante2=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values2);

        ContentValues values3=new ContentValues();
        values3.put(Funciones.CAMPO_ID,id3);
        values3.put(Funciones.CAMPO_LUGAR,sitio3);
        values3.put(Funciones.CAMPO_TELEFONO,tel3);
        values3.put(Funciones.CAMPO_DIRECCION,dir3);
        values3.put(Funciones.CAMPO_HORARIO,hor3);
        values3.put(Funciones.CAMPO_LATITUD,lat3);
        values3.put(Funciones.CAMPO_LONGITUD,lon3);
        values3.put(Funciones.CAMPO_IMG,img3);

        Long idResultante3=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values3);

        ContentValues values4=new ContentValues();
        values4.put(Funciones.CAMPO_ID,id4);
        values4.put(Funciones.CAMPO_LUGAR,sitio4);
        values4.put(Funciones.CAMPO_TELEFONO,tel4);
        values4.put(Funciones.CAMPO_DIRECCION,dir4);
        values4.put(Funciones.CAMPO_HORARIO,hor4);
        values4.put(Funciones.CAMPO_LATITUD,lat4);
        values4.put(Funciones.CAMPO_LONGITUD,lon4);
        values4.put(Funciones.CAMPO_IMG,img4);

        Long idResultante4=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values4);

        ContentValues values5=new ContentValues();
        values5.put(Funciones.CAMPO_ID,id5);
        values5.put(Funciones.CAMPO_LUGAR,sitio5);
        values5.put(Funciones.CAMPO_TELEFONO,tel5);
        values5.put(Funciones.CAMPO_DIRECCION,dir5);
        values5.put(Funciones.CAMPO_HORARIO,hor5);
        values5.put(Funciones.CAMPO_LATITUD,lat5);
        values5.put(Funciones.CAMPO_LONGITUD,lon5);
        values5.put(Funciones.CAMPO_IMG,img5);

        Long idResultante5=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values5);

        ContentValues values6=new ContentValues();
        values6.put(Funciones.CAMPO_ID,id6);
        values6.put(Funciones.CAMPO_LUGAR,sitio6);
        values6.put(Funciones.CAMPO_TELEFONO,tel6);
        values6.put(Funciones.CAMPO_DIRECCION,dir6);
        values6.put(Funciones.CAMPO_HORARIO,hor6);
        values6.put(Funciones.CAMPO_LATITUD,lat6);
        values6.put(Funciones.CAMPO_LONGITUD,lon6);
        values6.put(Funciones.CAMPO_IMG,img6);

        Long idResultante6=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values6);

        ContentValues values7=new ContentValues();
        values7.put(Funciones.CAMPO_ID,id7);
        values7.put(Funciones.CAMPO_LUGAR,sitio7);
        values7.put(Funciones.CAMPO_TELEFONO,tel7);
        values7.put(Funciones.CAMPO_DIRECCION,dir7);
        values7.put(Funciones.CAMPO_HORARIO,hor7);
        values7.put(Funciones.CAMPO_LATITUD,lat7);
        values7.put(Funciones.CAMPO_LONGITUD,lon7);
        values7.put(Funciones.CAMPO_IMG,img7);

        Long idResultante7=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values7);

        ContentValues values8=new ContentValues();
        values8.put(Funciones.CAMPO_ID,id8);
        values8.put(Funciones.CAMPO_LUGAR,sitio8);
        values8.put(Funciones.CAMPO_TELEFONO,tel8);
        values8.put(Funciones.CAMPO_DIRECCION,dir8);
        values8.put(Funciones.CAMPO_HORARIO,hor8);
        values8.put(Funciones.CAMPO_LATITUD,lat8);
        values8.put(Funciones.CAMPO_LONGITUD,lon8);
        values8.put(Funciones.CAMPO_IMG,img8);

        Long idResultante8=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values8);

        ContentValues values9=new ContentValues();
        values9.put(Funciones.CAMPO_ID,id9);
        values9.put(Funciones.CAMPO_LUGAR,sitio9);
        values9.put(Funciones.CAMPO_TELEFONO,tel9);
        values9.put(Funciones.CAMPO_DIRECCION,dir9);
        values9.put(Funciones.CAMPO_HORARIO,hor9);
        values9.put(Funciones.CAMPO_LATITUD,lat9);
        values9.put(Funciones.CAMPO_LONGITUD,lon9);
        values9.put(Funciones.CAMPO_IMG,img9);

        Long idResultante9=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values9);

        ContentValues values10=new ContentValues();
        values10.put(Funciones.CAMPO_ID,id10);
        values10.put(Funciones.CAMPO_LUGAR,sitio10);
        values10.put(Funciones.CAMPO_TELEFONO,tel10);
        values10.put(Funciones.CAMPO_DIRECCION,dir10);
        values10.put(Funciones.CAMPO_HORARIO,hor10);
        values10.put(Funciones.CAMPO_LATITUD,lat10);
        values10.put(Funciones.CAMPO_LONGITUD,lon10);
        values10.put(Funciones.CAMPO_IMG,img10);

        Long idResultante10=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values10);

        ContentValues values11=new ContentValues();
        values11.put(Funciones.CAMPO_ID,id11);
        values11.put(Funciones.CAMPO_LUGAR,sitio11);
        values11.put(Funciones.CAMPO_TELEFONO,tel11);
        values11.put(Funciones.CAMPO_DIRECCION,dir11);
        values11.put(Funciones.CAMPO_HORARIO,hor11);
        values11.put(Funciones.CAMPO_LATITUD,lat11);
        values11.put(Funciones.CAMPO_LONGITUD,lon11);
        values11.put(Funciones.CAMPO_IMG,img11);

        Long idResultante11=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values11);

        ContentValues values12=new ContentValues();
        values12.put(Funciones.CAMPO_ID,id12);
        values12.put(Funciones.CAMPO_LUGAR,sitio12);
        values12.put(Funciones.CAMPO_TELEFONO,tel12);
        values12.put(Funciones.CAMPO_DIRECCION,dir12);
        values12.put(Funciones.CAMPO_HORARIO,hor12);
        values12.put(Funciones.CAMPO_LATITUD,lat12);
        values12.put(Funciones.CAMPO_LONGITUD,lon12);
        values12.put(Funciones.CAMPO_IMG,img12);

        Long idResultante12=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values12);

        ContentValues values13=new ContentValues();
        values13.put(Funciones.CAMPO_ID,id13);
        values13.put(Funciones.CAMPO_LUGAR,sitio13);
        values13.put(Funciones.CAMPO_TELEFONO,tel13);
        values13.put(Funciones.CAMPO_DIRECCION,dir13);
        values13.put(Funciones.CAMPO_HORARIO,hor13);
        values13.put(Funciones.CAMPO_LATITUD,lat13);
        values13.put(Funciones.CAMPO_LONGITUD,lon13);
        values13.put(Funciones.CAMPO_IMG,img13);

        Long idResultante13=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values13);

        ContentValues values14=new ContentValues();
        values14.put(Funciones.CAMPO_ID,id14);
        values14.put(Funciones.CAMPO_LUGAR,sitio14);
        values14.put(Funciones.CAMPO_TELEFONO,tel14);
        values14.put(Funciones.CAMPO_DIRECCION,dir14);
        values14.put(Funciones.CAMPO_HORARIO,hor14);
        values14.put(Funciones.CAMPO_LATITUD,lat14);
        values14.put(Funciones.CAMPO_LONGITUD,lon14);
        values14.put(Funciones.CAMPO_IMG,img14);

        Long idResultante14=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values14);

        ContentValues values15=new ContentValues();
        values15.put(Funciones.CAMPO_ID,id15);
        values15.put(Funciones.CAMPO_LUGAR,sitio15);
        values15.put(Funciones.CAMPO_TELEFONO,tel15);
        values15.put(Funciones.CAMPO_DIRECCION,dir15);
        values15.put(Funciones.CAMPO_HORARIO,hor15);
        values15.put(Funciones.CAMPO_LATITUD,lat15);
        values15.put(Funciones.CAMPO_LONGITUD,lon15);
        values15.put(Funciones.CAMPO_IMG,img15);

        Long idResultante15=db.insert(Funciones.TABLA_LUGAR, Funciones.CAMPO_ID,values15);
        db.close();
    }

}
