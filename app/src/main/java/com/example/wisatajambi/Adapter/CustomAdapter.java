package com.example.wisatajambi.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wisatajambi.DetailActivity;
import com.example.wisatajambi.R;

import java.net.URLEncoder;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    List<Model> my_list;
    Context context;

    public CustomAdapter(List<Model> my_list, Context context) {
        this.my_list = my_list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        final Model model = my_list.get(position);
        holder.description_tv.setText(model.getDescription());
        holder.desc_nature.setText(model.getDesc_nature());
        holder.image.setImageDrawable(context.getResources().getDrawable(model.getImage()));

        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("image", model.getImage());
                intent.putExtra("nature", model.getDesc_nature());
                intent.putExtra("description", model.getDescription());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return my_list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView description_tv;
        TextView desc_nature;

        CardView cardView;

        Button button;

        //RelativeLayout relativeLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            description_tv = itemView.findViewById(R.id.description);
            desc_nature = itemView.findViewById(R.id.nature);

            cardView = itemView.findViewById(R.id.cardview);

            button = itemView.findViewById(R.id.share_action);


        }
    }

}
