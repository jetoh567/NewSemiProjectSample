package com.example.semiprojectsample.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.semiprojectsample.R;
import com.example.semiprojectsample.activity.NewMemoActivity;

public class FragmentMemo extends Fragment {
    public ListView mLstMemo; // MainActivity 에서도 ListView 로 접근할 수 있게하기위해 public 으로 선언

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_memo, container, false);

        mLstMemo = view.findViewById(R.id.lstMemo);

        view.findViewById(R.id.btnNewMemo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 새 메모화면으로 이동
                Intent i = new Intent(getActivity(), NewMemoActivity.class);
                startActivity(i);
            }
        });

        return view;
    }
}
