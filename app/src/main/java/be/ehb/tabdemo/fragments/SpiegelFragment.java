package be.ehb.tabdemo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import be.ehb.tabdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SpiegelFragment extends Fragment {

    private EditText etInvoer;
    private Button btnSpiegel;

    private View.OnClickListener onSpiegelClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(etInvoer.getText());
            stringBuilder.reverse();
            etInvoer.setText(stringBuilder);
        }
    };


    public SpiegelFragment() {
        // Required empty public constructor
    }
    public static SpiegelFragment newInstance(){

        return new SpiegelFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_spiegel, container, false);

        etInvoer = view.findViewById(R.id.et_spiegel_invoer);
        btnSpiegel = view.findViewById(R.id.btn_spiegel);

        btnSpiegel.setOnClickListener(onSpiegelClickListener);


        return view;
    }

}
