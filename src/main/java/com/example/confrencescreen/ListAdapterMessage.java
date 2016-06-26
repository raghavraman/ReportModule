package com.example.confrencescreen;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapterMessage extends BaseAdapter {

	private ArrayList<DataHolderMessage> report = new ArrayList<DataHolderMessage>();
	private Context context;
	
	public  ListAdapterMessage(Context context, ArrayList<DataHolderMessage> rList) {
		this.context=context;
		report=rList;
	}


	@Override
	public int getCount() {
		
			return report.size();
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
	            convertView = inflater.inflate(R.layout.listmessageview, null);
	        }
			
		   String name=report.get(pos).getString();
		
		   TextView firstLine = (TextView) convertView.findViewById(R.id.firstline);
	        firstLine.setText(name);
	        
	        return convertView;
	}
}