package trapp.dev.comcontrol.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import trapp.dev.comcontrol.R;

/**
 * Created by Brad on 2/4/14.
 */
public class MainFragment extends Fragment {

    View MainView;

    public MainFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        MainView = inflater.inflate(R.layout.fragment_main, container, false);
        return MainView;
    }
}