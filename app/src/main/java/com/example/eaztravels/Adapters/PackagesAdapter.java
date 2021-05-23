package com.example.eaztravels.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eaztravels.Activity.BookingFormActivity;
import com.example.eaztravels.Activity.ConfrimPackage;
import com.example.eaztravels.Activity.MainActivity;
import com.example.eaztravels.Activity.TravelingPackagesActivity;
import com.example.eaztravels.R;

public class PackagesAdapter extends RecyclerView.Adapter<PackagesAdapter.PackageViewHolder> {
    private String[] data;
    Context ctx;

    public PackagesAdapter(Context activity,String[] arrl) {
        this.data=arrl;
        this.ctx=activity;
    }

    @NonNull
    @Override
    public PackageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_traveling_pakges,parent,false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) ctx).startActivity(new Intent(ctx,ConfrimPackage.class));
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


    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    public class PackageViewHolder extends RecyclerView.ViewHolder{
        //ImageView img;
        //   TextView team1,team2,src;

        public PackageViewHolder(@NonNull View itemView) {
            super(itemView);
//            team1=  itemView.findViewById(R.id.team1);
//            team2=  itemView.findViewById(R.id.team2);
//            src= itemView.findViewById(R.id.src);

        }
    }
}