package com.github.kotlin_studio.main_activity_and_fragment1_java;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * Fragment1 subclass.
 */
public class Fragment1 extends Fragment implements View.OnClickListener  {

    public int counter = 0;
    Activity activity;

    public Fragment1() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment1, container, false);
        Button button = rootView.findViewById(R.id.button1);
        button.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Activity){
            activity=(Activity) context;
        }
    }

    @Override
    public void onClick(View view) {
        counter++;
        Toast.makeText(getActivity(), "Количество нажатий кнопки: " + counter,
                Toast.LENGTH_SHORT).show();

        try {
            ((Postman) activity).fragmentMail(counter);
        } catch (ClassCastException ignored) {}
    }

}
