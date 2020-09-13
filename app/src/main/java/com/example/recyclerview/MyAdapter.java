package com.example.recyclerview;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context ctx;
    String[] tit;
    String[] vers;
    int[] img;
    String[] rd;

    public MyAdapter(Context ctx, String[] tit, String[] vers, int[] img, String[] rd) {
        this.ctx = ctx;
        this.tit = tit;
        this.vers = vers;
        this.img = img;
        this.rd = rd;
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
        holder.releaseDate.setText(rd[position]);


    }

    @Override
    public int getItemCount() {
        return tit.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView image;
        TextView text;
        TextView versions;
        TextView releaseDate;
        int i;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView);
            image.setOnClickListener(this);
            text = itemView.findViewById(R.id.textView);
            versions = itemView.findViewById(R.id.textView2);
            releaseDate = itemView.findViewById(R.id.textView3);


        }

        @Override
        public void onClick(View view) {

            if (getLayoutPosition() == 0) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity2.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 1) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity3.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 2) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity4.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 3) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity5.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 4) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity6.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 5) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity7.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 6) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity8.class);
                ctx.startActivity(intent);
            }else if (getLayoutPosition() == 7) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity9.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 8) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity10.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 9) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity11.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 10) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity12.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 11) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity13.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 12) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity14.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 13) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity15.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 14) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity16.class);
                ctx.startActivity(intent);
            } else if (getLayoutPosition() == 15) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity17.class);
                ctx.startActivity(intent);

            } else if (getLayoutPosition() == 16) {

                Intent intent;
                intent = new Intent(view.getContext(), MainActivity18.class);
                ctx.startActivity(intent);

            }


        }
    }
}
