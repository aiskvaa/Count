package com.example.count.counterViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {
    public MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();

    int count = 0;

    public void increment() {
        mutableLiveData.postValue(++count);
    }

    public void decrement() {
        mutableLiveData.postValue(--count);
    }



}
