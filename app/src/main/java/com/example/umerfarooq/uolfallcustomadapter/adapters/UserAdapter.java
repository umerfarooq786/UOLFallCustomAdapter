package com.example.umerfarooq.uolfallcustomadapter.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.umerfarooq.uolfallcustomadapter.R;
import com.example.umerfarooq.uolfallcustomadapter.models.User;

import java.util.List;

/**
 * Created by Umer Farooq on 10/15/2017.
 */

public class UserAdapter extends ArrayAdapter<User> {
    private static final String TAG = "MTAG";

    class ViewHolder{
        TextView tvUsername;
        TextView tvRollNumber;

    }
    public UserAdapter(@NonNull Context context, @NonNull List<User> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Log.d(TAG,"convert view "+convertView);
        View view=convertView;
        ViewHolder vh;
        User u=getItem(position);
        if(view==null)
        {
            view= LayoutInflater.from(getContext()).inflate(R.layout.user_list_item,parent,false);
            TextView tvUsername= (TextView) view.findViewById(R.id.tvUsername);
            TextView tvRollNumber= (TextView) view.findViewById(R.id.tvRollNumber);

            vh=new ViewHolder();
            vh.tvUsername= (TextView) view.findViewById(R.id.tvUsername);
            vh.tvRollNumber= (TextView) view.findViewById(R.id.tvRollNumber);
            view.setTag(vh);
        }
        vh= (ViewHolder) view.getTag();
        vh.tvUsername.setText(u.getUsername());
        vh.tvRollNumber.setText(u.getRollnumber());



        return  view;
    }
}
