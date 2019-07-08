package com.example.semiprojectsample.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.semiprojectsample.R;
import com.example.semiprojectsample.activity.NewMemoActivity;
import com.example.semiprojectsample.bean.MemoBean;

import java.util.List;

public class FragmentMemo extends Fragment {
    public ListView mLstMemo; // MainActivity 에서도 ListView 로 접근할 수 있게하기위해 public 으로 선언
    ListAdapter adapter;

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
    } // end OnCreate

    class ListAdapter extends BaseAdapter {
        List<MemoBean> memos;
        LayoutInflater inflater;
        Context mContext;

        public ListAdapter(List<MemoBean> memos, Context context) {
            this.memos = memos;
            this.mContext = context;
            this.inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        }

        public void setMemos(List<MemoBean> memos) {this.memos = memos;}

        @Override
        public int getCount() {
            return MemoBean.memoId;
        }

        @Override
        public Object getItem(int i) {
            return memos.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = inflater.inflate(R.layout.list_view, null);
            ImageView memoPic = view.findViewById(R.id.memoPic);
            TextView memoTitle = view.findViewById(R.id.memoTitle);
            TextView memoDesc = view.findViewById(R.id.memoDesc);
            
        }
    }
} // end class
