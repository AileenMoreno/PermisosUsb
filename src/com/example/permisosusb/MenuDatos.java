package com.example.permisosusb;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuDatos extends ListActivity {

	String classes[]={"Datos Personales","Datos Academicos","Solicitud Permisos","Permisos"}; 
	String classesValue[]={"DatosPersonales","DatosAcademicos","SolicitudPermisos","Permisos"}; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(MenuDatos.this,android.R.layout.simple_list_item_1,classes));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		String option = classesValue[position];
		super.onListItemClick(l, v, position, id);
		try{
		Class<?> simpleClass = Class.forName("com.example.permisosusb."+option);
		Intent intent = new Intent(MenuDatos.this, simpleClass);
		startActivity(intent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
