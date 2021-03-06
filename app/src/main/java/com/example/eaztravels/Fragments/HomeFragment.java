package com.example.eaztravels.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.eaztravels.Activity.BookingFormActivity;
import com.example.eaztravels.Activity.SpecialRequestFormActivity;
import com.example.eaztravels.R;

import org.jetbrains.annotations.NotNull;

public class HomeFragment extends Fragment {

    CardView usa_card,international_card,request_card;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        usa_card=view.findViewById(R.id.usa_card);
        international_card=view.findViewById(R.id.international_card);
        request_card=view.findViewById(R.id.request_card);

        usa_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), BookingFormActivity.class));
            }
        });

        international_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), BookingFormActivity.class));
            }
        });

        request_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SpecialRequestFormActivity.class));
            }
        });

    }
}
