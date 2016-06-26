package com.example.confrencescreen;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
	
	private ArrayList<DataHolder> list = new ArrayList<DataHolder>();
	Context context;
	
	public ListAdapter(Context context, ArrayList<DataHolder> rList) {
		this.context=context;
		list=rList;
	}

	@Override
	public int getCount() {
		
			return list.size();
	}
		
	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int pos, View convertView, ViewGroup arg2) {
		
		   LayoutInflater inflater = ((Activity) context).getLayoutInflater();
		   if (convertView == null) {
	            convertView = inflater.inflate(R.layout.list_textview, null);
	        }
			
		   String name=list.get(pos).getName();
		   String time=list.get(pos).getTime(); 
		   TextView firstLine = (TextView) convertView.findViewById(R.id.firstline);
	        firstLine.setText(name);
	        TextView secondLine = (TextView)convertView.findViewById(R.id.Secondline);
	        secondLine.setText(time);
	        
	        return convertView;
	}
}