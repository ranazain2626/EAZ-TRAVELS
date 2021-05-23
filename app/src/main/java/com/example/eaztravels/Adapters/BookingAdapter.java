package com.example.eaztravels.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eaztravels.Activity.MainActivity;
import com.example.eaztravels.Activity.TravelingPackagesActivity;
import com.example.eaztravels.R;

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.BookingViewHolder> {
    private String[] data;
    Context ctx;

    public BookingAdapter(Context activity,String[] arrl) {
        this.data=arrl;
        this.ctx=activity;
    }

    @NonNull
    @Override
    public BookingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_booking,parent,false);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) ctx).startActivity(new Intent(ctx, TravelingPackagesActivity.class));
            }
        });
        return new BookingViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull BookingViewHolder holder, int position) {
//        MatchesModel title = data[position];
//        holder.team1.setText(title.getHomeTeamName());
//        holder.team2.setText(title.getAwayTeamName());
//        holder.src.setText(title.getScore());


    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    public class BookingViewHolder extends RecyclerView.ViewHolder{
        //ImageView img;
     //   TextView team1,team2,src;

        public BookingViewHolder(@NonNull View itemView) {
            super(itemView);
//            team1=  itemView.findViewById(R.id.team1);
//            team2=  itemView.findViewById(R.id.team2);
//            src= itemView.findViewById(R.id.src);

        }
    }
}