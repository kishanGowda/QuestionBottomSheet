package com.example.questionbottomsheet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class QuestionGridAdapter extends BaseAdapter {
    private int numOfQestion;


    public QuestionGridAdapter(int numOfQestion) {
        this.numOfQestion = numOfQestion;
    }

    @Override
    public int getCount() {
        return numOfQestion;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View myview ;
        if(convertView==null)
        {
          myview= LayoutInflater.from(convertView.getContext()).inflate(R.layout.number, (ViewGroup) convertView,false);
        }
        else {
            myview=convertView;
        }

        TextView quesTv=myview.findViewById(R.id.questionm);
        quesTv.setText(String.valueOf(1));
        return myview;
    }
}
