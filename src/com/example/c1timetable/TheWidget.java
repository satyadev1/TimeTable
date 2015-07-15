package com.example.c1timetable;

import java.util.Calendar;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;
import android.widget.Toast;

public class TheWidget extends AppWidgetProvider {
	
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		// TODO Auto-generated method stub
		super.onUpdate(context, appWidgetManager, appWidgetIds);
		
		final int N = appWidgetIds.length;
		
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK); 

		for(int i=0; i<N;i++) {
			
			RemoteViews v = new RemoteViews(context.getPackageName(),R.layout.widget);
			
			
			
			// If current day is Sunday, day=1. Saturday, day=7.
			switch (day) {
		    	case Calendar.MONDAY: break;
		        // ...

		    	case Calendar.TUESDAY: break;
		        // etc ...
		    		
		    	case Calendar.WEDNESDAY: break;
		    		
		    	case Calendar.THURSDAY: break;
		    		
		    	case Calendar.FRIDAY: break;
		    		
		    	case Calendar.SATURDAY:	break;
		    		
		    	default: break;	
		    		
			}
			
		}
	}
	
	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		// TODO Auto-generated method stub
		super.onDeleted(context, appWidgetIds);
		Toast.makeText(context, "Widget closed", Toast.LENGTH_SHORT).show();
	}

}
