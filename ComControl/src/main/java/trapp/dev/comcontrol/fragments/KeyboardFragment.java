package trapp.dev.comcontrol.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import trapp.dev.comcontrol.R;

/**
 * Created by Brad on 1/11/14.
 */
public class KeyboardFragment extends Fragment {

    EditText hiddenText;
    View keyboardView;

    public KeyboardFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        keyboardView = inflater.inflate(R.layout.fragment_keyboard, container, false);
        hiddenText = (EditText) keyboardView.findViewById(R.id.hiddenText);
        return keyboardView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}