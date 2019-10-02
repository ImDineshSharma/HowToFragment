package com.example.frag3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BottomFragment extends Fragment {

    private static TextView TopMeme;
    private static TextView BottomMeme;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container, false);


        TopMeme = (TextView) view.findViewById(R.id.TOPP);
        BottomMeme = (TextView) view.findViewById(R.id.BOTTOM);
        return view;
    }

    public void setMemeText(String top, String bottom){
        TopMeme.setText(top);
        BottomMeme.setText(bottom);
    }
}
