package com.example.semiprojectsample.fragment;

import android.Manifest;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import com.example.semiprojectsample.R;

public class FragmentCamera extends Fragment {
    // 사진이 저장된 단말기상의 실제 경로
    public String mPhotoPath = "sdfsd/hello/world.jpg"; // dummy data

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
