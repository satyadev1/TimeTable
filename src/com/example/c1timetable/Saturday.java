package com.example.c1timetable;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Saturday extends ListActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//Storing strings resources into a string array
		String[] items = getResources().getStringArray(R.array.saturday);
				
		//Binding resources array to list adapter 
		this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, items));
	}

}
