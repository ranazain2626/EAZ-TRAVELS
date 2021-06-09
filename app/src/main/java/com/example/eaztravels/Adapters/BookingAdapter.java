package com.example.eaztravels.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
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

        return new BookingViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull BookingViewHolder holder, int position) {
//        MatchesModel title = data[position];
           holder.title.setText("Request # "+(position+1));
           if(position==0)
           {
               holder.status.setBackgroundResource(R.drawable.btn_inital);
               holder.status.setText("Pending");
               holder.card.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       ((MainActivity) ctx).showMessage("This request is pending currently! Our operator will contact you shortly");

                   }
               });
           }else if(position==1)
           {
               holder.status.setBackgroundResource(R.drawable.btn_secondary);
               holder.status.setText("Packages Offered");
               holder.card.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       ((MainActivity) ctx).startActivity(new Intent(ctx, TravelingPackagesActivity.class));
                   }
               });
           }else if(position==2)
           {
               holder.status.setBackgroundResource(R.drawable.btn_green);
               holder.status.setText("Package Confirmed");
               holder.card.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent=new Intent(ctx, TravelingPackagesActivity.class);
                       intent.putExtra("done",1);
                       ((MainActivity) ctx).startActivity(intent);
                   }
               });
           }
//        holder.team2.setText(title.getAwayTeamName());
//        holder.src.setText(title.getScore());


    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    public class BookingViewHolder extends RecyclerView.ViewHolder{
        //ImageView img;
       TextView title;
       Button status;
       CardView card;

        public BookingViewHolder(@NonNull View itemView) {
            super(itemView);
            title=  itemView.findViewById(R.id.title);
            status=  itemView.findViewById(R.id.status);
            card= itemView.findViewById(R.id.card);

        }
    }
}