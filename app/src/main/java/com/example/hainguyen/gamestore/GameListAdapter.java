package com.example.hainguyen.gamestore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hai Nguyen on 9/10/2016.
 */
public class GameListAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<Object> objects = new ArrayList<Object>();

    public GameListAdapter(Context mContext) {
        super();
        this.mContext = mContext;
    }

    public void addAll(ArrayList<Object> items){
        objects.addAll(items);
        //notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (objects.size() != 0) {
            Object mObject = objects.get(i);
            if (mObject != null) {
                //inflarter view tu res/layout
                view = LayoutInflater.from(mContext).inflate(R.layout.item_list_of_game, viewGroup, false);
                //tao 1 view holder
                ViewHolder holder = new ViewHolder();
                holder.position = i;
                //gán các view trong layout với vào view holder
                holder.item_layout = (LinearLayout) view.findViewById(R.id.item_layout);
                holder.imageView = (ImageView) view.findViewById(R.id.imageView);
                holder.textView = (TextView) view.findViewById(R.id.textView);
                holder.buttonDownload = (Button) view.findViewById(R.id.buttonDownload);
                holder.buttonPlay = (Button) view.findViewById(R.id.buttonPlay);
                //dổ dữ liệu vào holder
                holder.textView.setText("aaaaaaadapter");
                //...

            }
        }
        return view;
    }

    //design patten: ViewHolder
    static class ViewHolder {
        LinearLayout item_layout;
        ImageView imageView;
        TextView textView;
        Button buttonDownload;
        Button buttonPlay;
        int position;

        public ViewHolder(){
            //event cho vào đây
        }
    }
}
