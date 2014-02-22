package trapp.dev.comcontrol.fragments;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import trapp.dev.comcontrol.R;

/**
 * Created by Brad on 1/9/14.
 */
public class MouseFragment extends Fragment {
    private SurfaceView surface;

    public MouseFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        surface = (SurfaceView) inflater.inflate(R.layout.fragment_mouse, container, false);
        return surface;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //make on click/tap listeners
        surface.setOnTouchListener( new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                // get pointer index from the event object
                int action = event.getAction() & MotionEvent.ACTION_MASK;
                switch(action)
                {
                    case MotionEvent.ACTION_DOWN:
                        //touch detected
                        break;
                    case MotionEvent.ACTION_MOVE:
                        //touch moving, change position of the mouse
                        break;
                    case MotionEvent.ACTION_UP:
                        //touch lifted, use as left click
                        break;
                    case MotionEvent.ACTION_POINTER_DOWN:
                    case MotionEvent.ACTION_POINTER_UP:
                        //multitouch event, use as right click
                        break;
                }
                return true;
            }
        });
    }




}