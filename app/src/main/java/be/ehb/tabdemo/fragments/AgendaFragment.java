package be.ehb.tabdemo.fragments;


import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import be.ehb.tabdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AgendaFragment extends Fragment {

    private static final String LUKCKY_KEY = "lucky key";
    private TextView tvLucky, tvUsername;


    public AgendaFragment() {
        // Required empty public constructor
    }
    //factory method
    //met parameters
    public static AgendaFragment newInstance(int luckyInt){
       AgendaFragment af= new AgendaFragment();

       Bundle bundle = new Bundle();
       bundle.putInt(LUKCKY_KEY,luckyInt);
       af.setArguments(bundle);
       return  af;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_agenda, container, false);

        tvLucky = view.findViewById(R.id.tv_lucky);
        tvUsername = view.findViewById(R.id.tv_username);

        String name = PreferenceManager.getDefaultSharedPreferences(getActivity()).getString("pref_username","niets");
        tvUsername.setText("Welcome" + name);
        tvLucky.setText(""+getArguments().getInt(LUKCKY_KEY));
        return view;

    }

}
