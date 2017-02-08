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

public class FragmentTwo extends Fragment {

    EditText ETsem;
    Button button2,button21;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmenttwo,container,false);

        ETsem = (EditText)view.findViewById(R.id.main_ET_sem);
        button2 = (Button) view.findViewById(R.id.btn2);
        button21 = (Button)view.findViewById(R.id.btn21);
        final String str = getArguments().getString("key1");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentThree fragmentThree = new FragmentThree();
                Bundle bundle = new Bundle();
                String sem=ETsem.getText().toString();
                bundle.putString("key1",str);
                bundle.putString("key2",sem);
                fragmentThree.setArguments(bundle);
                //FragmentManager fm = getFragmentManager().popBackStack();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ETsem.setText("");
                ft.replace(R.id.main_fragment,fragmentThree);
                ft.addToBackStack("");
                ft.commit();

            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });
        return view;
    }
}
