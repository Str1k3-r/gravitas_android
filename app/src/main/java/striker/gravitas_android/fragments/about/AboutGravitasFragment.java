package striker.gravitas_android.fragments.about;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import striker.gravitas_android.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutGravitasFragment extends Fragment {


    public AboutGravitasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_gravitas, container, false);
    }

}
