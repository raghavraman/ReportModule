package com.example.confrencescreen;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.example.confrencescreen.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;
import android.widget.ExpandableListView.OnChildClickListener;

public class ConferenceAttendedActivity extends Activity {
	
    List<String> groupList;
    List<String> childList;
    Map<String, List<String>> Children;
    ExpandableListView expListView;
	
	@Override
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.conference_attended_layout);
	        
	        
	        createGroupList();
	        
	        createCollection();
	 
	        expListView = (ExpandableListView) findViewById(R.id.expandableListView1);
	        final ExpandableListAdapter expListAdapter = new ExpandableListAdapter(
	                this, groupList, Children);
	        expListView.setAdapter(expListAdapter);
	 
	        //setGroupIndicatorToRight();
	 
	        expListView.setOnChildClickListener(new OnChildClickListener() {
	 
	            public boolean onChildClick(ExpandableListView parent, View v,
	                    int groupPosition, int childPosition, long id) {
	                final String selected = (String) expListAdapter.getChild(
	                        groupPosition, childPosition);
	                Toast.makeText(getBaseContext(), selected, Toast.LENGTH_LONG)
	                        .show();
	 
	                return true;
	            }
	        });

	 }
	
	 private void createGroupList() {
	        groupList = new ArrayList<String>();
	        groupList.add("Raghav	11/09/2014	12:00pm");
	        groupList.add("Rahul	10/08/2014	12:00pm");
	        groupList.add("Ramesh	09/08/2014	12:00pm");
	        groupList.add("Vignesh	11/07/2014	09:00am");
	        groupList.add("Suresh	11/06/2014	11:00am");
	    }

	 private void createCollection() {
	        // preparing Parents collection(child)
	        String[] Children1 = { "Ramesh", "Rahul",
	                "Vignesh","you"};
	        String[] Children2 = { "Ramesh", "Suresh", "Mukesh" , "Yogesh","you" };
	        String[] Children3 = { "Shekar", "+919994792608",
	                "+919994798787", "+918987898785" ,"you"};
	        String[] Children4 = { "Gandhi", "Nehru",
	                "Subash", "Sardar" ,"you" };
	        String[] Children5 = { "Jhon", "Ilango", "Kannan" ,"you"};
	 
	        Children = new LinkedHashMap<String, List<String>>();
	 
	        for (String Parent : groupList) {
	            if (Parent.equals("Raghav	11/09/2014	12:00pm")) {
	                loadChild(Children1);
	            } else if (Parent.equals("Rahul	10/08/2014	12:00pm"))
	                loadChild(Children5);
	            else if (Parent.equals("Ramesh	09/08/2014	12:00pm"))
	                loadChild(Children4);
	            else if (Parent.equals("Vignesh	11/07/2014	09:00am"))
	                loadChild(Children1);
	            else if (Parent.equals("Suresh	11/06/2014	11:00am"))
	                loadChild(Children2);
	            else
	                loadChild(Children3);
	 
	            Children.put(Parent, childList);
	        }
	 }
	        private void loadChild(String[] ParentModels) {
	            childList = new ArrayList<String>();
	            for (String model : ParentModels)
	                childList.add(model);
	        }
	     
	      
	    }




