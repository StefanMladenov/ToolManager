package com.example.a7mengineering.ui.LocationTag;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocationTagViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LocationTagViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}