package com.example.frag3;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TopFragment extends Fragment {

    private static EditText topText;
    private static EditText  bottomText;

    // interface object with name activityCommander
    TopSectionListener activityCommander;

    //In order to communicate with main activity we need to create an interface
    public interface TopSectionListener{
        // Here main activity says i promise when i implement the interface TopSectionListener, i will override createMeme
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            activityCommander = (TopSectionListener) getActivity();
        }catch (ClassCastException e){
            throw new ClassCastException(getActivity().toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // reference to the top_fragment layout
        View view = inflater.inflate(R.layout.top_fragment, container, false);

        // reference to top_fragment layout widgets
        topText = (EditText) view.findViewById(R.id.topText);
        bottomText = (EditText) view.findViewById(R.id.bottomText);
        Button button = (Button) view.findViewById(R.id.memeButton);

        //listener for memeButton
        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        buttonClicked(v);
                    }
                }
        );

        return view;

    }

    //call this when button is clicked
    public void buttonClicked(View view){
        activityCommander.createMeme(topText.getText().toString(), bottomText.getText().toString());

    }
}
