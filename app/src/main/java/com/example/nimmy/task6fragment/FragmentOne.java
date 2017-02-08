package com.example.nimmy.task6fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Nimmy on 07-02-2017.
 */

public class FragmentOne extends Fragment {

    EditText ETname;
    Button button1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentone, container, false);
        ETname = (EditText)view.findViewById(R.id.main_ET_name);
        button1 = (Button) view.findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTwo fragmentTwo = new FragmentTwo();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                String name=ETname.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("key1",name);
                fragmentTwo.setArguments(bundle);
                ETname.setText("");
                ft.replace(R.id.main_fragment,fragmentTwo);
                ft.addToBackStack("");
                ft.commit();

            }
        });

        return view;
    }
}
