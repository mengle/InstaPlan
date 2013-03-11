package com.project.instaplan;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {

	String classes[] = { "Sms", "Chatroom", "GetContacts", "FTP", "CreateEvent",
			"RuntimeStatusCheck", "AllEvents", "Facebook", "GoogleMaps", "task10", "task11", "task11" };

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String item_clicked = classes[position];
		try {
			Class<?> ourClass = Class.forName("com.project.instaplan."
					+ item_clicked);
			Intent ourIntent = new Intent(Menu.this, ourClass);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this,
				android.R.layout.simple_expandable_list_item_1, classes));
	}

}