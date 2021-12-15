package com.example.list_mail;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Random;

public class Adapter extends RecyclerView.Adapter<Adapter.EmailViewHolder> {

    List<Item> emailList;
    Context Context;
    Random rnd;

    public Adapter(List<Item> emailList, Context mContext) {
        this.emailList = emailList;
        this.Context = mContext;
        rnd = new Random();
    }


    @Override
    public EmailViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new EmailViewHolder(view);
    }

    @Override
    public void onBindViewHolder( EmailViewHolder holder, int position) {
        Item item = emailList.get(position);
        String sender = item.getSender();
        String content = item.getContent();
        String time = item.getTime();

        holder.avatar.setText(Character.toString(Character.toUpperCase(sender.charAt(0))));
        holder.avatar.getBackground().setTint(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
        holder.textView1.setText(sender);
        holder.textView2.setText(content);
        holder.ViewTime.setText(time);

    }

    @Override
    public int getItemCount() {
        return emailList.size();
    }

    public class EmailViewHolder extends RecyclerView.ViewHolder {
        TextView avatar, textView1, textView2, ViewTime;
        ImageView star;


        public EmailViewHolder( View itemView) {
            super(itemView);

            avatar = itemView.findViewById(R.id.ava);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            ViewTime = itemView.findViewById(R.id.Time);
            star = itemView.findViewById(R.id.star);

            star.setOnClickListener(v -> {
                star.setImageResource(R.drawable.star);
            });
        }
    }
}
