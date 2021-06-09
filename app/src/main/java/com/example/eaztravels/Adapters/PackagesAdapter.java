package com.example.eaztravels.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eaztravels.Activity.PackageDetailsActivity;
import com.example.eaztravels.Activity.MainActivity;
import com.example.eaztravels.Activity.TravelingPackagesActivity;
import com.example.eaztravels.R;

public class PackagesAdapter extends RecyclerView.Adapter<PackagesAdapter.PackageViewHolder> {
    private String[] data;
    Context ctx;
    int done;

    public PackagesAdapter(Context activity,String[] arrl,int done) {
        this.data=arrl;
        this.ctx=activity;
        this.done=done;
    }

    @NonNull
    @Override
    public PackageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_traveling_pakges,parent,false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ctx, PackageDetailsActivity.class);
                intent.putExtra("done",done);
                ((TravelingPackagesActivity) ctx).startActivity(intent);
            }
        });
        return new PackageViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull PackageViewHolder holder, int position) {
//        MatchesModel title = data[position];
//        holder.team1.setText(title.getHomeTeamName());
//        holder.team2.setText(title.getAwayTeamName());
//        holder.src.setText(title.getScore());

        holder.title.setText("Itinerary # "+(position+1));
        if(position==0)
        {
            if(done==1)
            {
                holder.done_layout.setVisibility(View.VISIBLE);
            }else{
                holder.done_layout.setVisibility(View.GONE);
            }
            holder.img.setImageDrawable(ctx.getResources().getDrawable(R.drawable.itnerary2));
        }else  if(position==1)
        {
            holder.img.setImageDrawable(ctx.getResources().getDrawable(R.drawable.itenraray3));
        }else  if(position==2)
        {
            holder.img.setImageDrawable(ctx.getResources().getDrawable(R.drawable.itinerary1));
        }

    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    public class PackageViewHolder extends RecyclerView.ViewHolder{
            ImageView img;
           TextView title;
           FrameLayout done_layout;

        public PackageViewHolder(@NonNull View itemView) {
            super(itemView);
            title=  itemView.findViewById(R.id.title);
            img= itemView.findViewById(R.id.image);
            done_layout= itemView.findViewById(R.id.done_layout);


        }
    }
}