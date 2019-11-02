package com.allsocialsite.bd.navigationDrawer.ui.privacyAndPolicy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PrivacyPolicyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PrivacyPolicyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Privacy and Policy fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}