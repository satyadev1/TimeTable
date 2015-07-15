package com.example.c1timetable;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainListView extends ListActivity {
	
	String classNames[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Storing strings resources into a string array
		String[] days = getResources().getStringArray(R.array.week_days);
		
		//display toast
		Context context = getApplicationContext();
		CharSequence text = "App Developed By Sai Vikas";
		int duration = 5;

		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
		
		//Binding resources array to list adapter 
		this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, days));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String openClass = classNames[position];
		
		try {
			Class Selected = Class.forName("com.example.c1timetable."+openClass);
			Intent selectedIntent = new Intent(this, Selected);
			startActivity(selectedIntent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
