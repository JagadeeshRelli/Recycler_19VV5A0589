package com.example.recyclerview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context ctx;
    String[] tit;
    String[] vers;
    int[] img;

    public MyAdapter(Context ctx, String[] tit, String[] vers, int[] img) {
        this.ctx = ctx;
        this.tit = tit;
        this.vers=vers;
        this.img = img;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(ctx).inflate(R.layout.every_row_design, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.text.setText(tit[position]);
        holder.image.setImageResource(img[position]);
        holder.versions.setText(vers[position]);


    }

    @Override
    public int getItemCount() {
        return tit.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView text;
        TextView versions;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView);
            text = itemView.findViewById(R.id.textView);
            versions=itemView.findViewById(R.id.textView2);


        }
    }
}
