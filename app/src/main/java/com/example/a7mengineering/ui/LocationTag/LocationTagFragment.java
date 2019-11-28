package com.example.a7mengineering.ui.LocationTag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.a7mengineering.R;

public class LocationTagFragment extends Fragment {

    private LocationTagViewModel locationTagViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        locationTagViewModel =
                ViewModelProviders.of(this).get(LocationTagViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tag, container, false);

        return root;

    }
}