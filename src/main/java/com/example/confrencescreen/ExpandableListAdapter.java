package com.example.confrencescreen;
 
import java.util.List;
import java.util.Map;

import com.example.confrencescreen.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
 
public class ExpandableListAdapter extends BaseExpandableListAdapter {
 
    private Activity context;
    private Map<String, List<String>> Parent;
    private List<String> Child;
 
    public ExpandableListAdapter(Activity context, List<String> Child,
            Map<String, List<String>> Parent) {
        this.context = context;
        this.Parent = Parent;
        this.Child = Child;
    }
 
    public Object getChild(int groupPosition, int childPosition) {
        return Parent.get(Child.get(groupPosition)).get(childPosition);
    }
 
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }
     
     
    public View getChildView(final int groupPosition, final int childPosition,
            boolean isLastChild, View convertView, ViewGroup parent) {
        final String laptop = (String) getChild(groupPosition, childPosition);
        LayoutInflater inflater = context.getLayoutInflater();
         
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.expandablelist_child_view, null);
        }
         
        TextView item = (TextView) convertView.findViewById(R.id.laptop);
        item.setText(laptop);
        return convertView;
    }
 
    public int getChildrenCount(int groupPosition) {
        return Parent.get(Child.get(groupPosition)).size();
    }
 
    public Object getGroup(int groupPosition) {
        return Child.get(groupPosition);
    }
 
    public int getGroupCount() {
        return Child.size();
    }
 
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }
 
    public View getGroupView(int groupPosition, boolean isExpanded,
            View convertView, ViewGroup parent) {
        String ParentString = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.expandablelist_parent_view,
                    null);
        }
        TextView item = (TextView) convertView.findViewById(R.id.laptop);
        item.setText(ParentString);
        return convertView;
    }
 
    public boolean hasStableIds() {
        return true;
    }
 
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}