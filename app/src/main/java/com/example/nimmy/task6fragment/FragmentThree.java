package com.example.nimmy.task6fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Nimmy on 07-02-2017.
 */

public class FragmentThree extends Fragment  {

    Button button3;
    TextView textView1,textView2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentthree,container,false);

        button3 = (Button)view.findViewById(R.id.btn3);
        textView1 = (TextView)view.findViewById(R.id.tv1);
        textView2 = (TextView)view.findViewById(R.id.tv2);
        String s1 = getArguments().getString("key1");
        String s2 = getArguments().getString("key2");
        textView1.setText(s1);
        textView2.setText(s2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getFragmentManager().popBackStack();
            }
        });

        return  view;
    }
}
