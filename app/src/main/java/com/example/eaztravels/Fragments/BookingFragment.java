package com.example.eaztravels.Fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eaztravels.Adapters.BookingAdapter;
import com.example.eaztravels.R;

public class BookingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_booking,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView rv= (RecyclerView) view.findViewById(R.id.request_list);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        String data[]={"1","1","12"};
        BookingAdapter adapter=new BookingAdapter(getActivity(),data);
        rv.setAdapter(adapter);

    }
}