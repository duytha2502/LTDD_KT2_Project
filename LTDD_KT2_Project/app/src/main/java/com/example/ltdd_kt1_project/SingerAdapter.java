package com.example.ltdd_kt1_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class SingerAdapter  extends BaseAdapter {

    private List<Singer> SingerList;
    private int layout;
    private Context context;

    public SingerAdapter(Context Context,int layout,  List<Singer> singerlist) {
        this.context = Context;
        this.layout = layout;
        this.SingerList=singerlist;
    }

    @Override
    public int getCount() {
        return SingerList.size();
    }

    @Override
    public Object getItem(int i){
        return SingerList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    private class ViewHolder{
        ImageView imgsinger;
        TextView txtName,txtNickName,txtStar,txtNation;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            holder.txtName = (TextView) view.findViewById(R.id.textView_singerName);
            holder.txtNickName = (TextView) view.findViewById(R.id.textView_nickName);
            holder.txtNation = (TextView) view.findViewById(R.id.textView_nation);
            holder.txtStar = (TextView) view.findViewById(R.id.textView_star);
            holder.imgsinger = (ImageView) view.findViewById(R.id.imageView_singer);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        Singer lapTop = SingerList.get(i);

        holder.txtName.setText(lapTop.getSingerName());
        holder.txtNickName.setText(lapTop.getNickName());
        holder.txtNation.setText(lapTop.getNation());
        holder.txtStar.setText(lapTop.getStar());
        holder.imgsinger.setImageResource(lapTop.getSinger());

        return view;
    }
}

