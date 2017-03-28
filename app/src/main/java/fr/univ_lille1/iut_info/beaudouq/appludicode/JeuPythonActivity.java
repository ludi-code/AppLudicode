package fr.univ_lille1.iut_info.beaudouq.appludicode;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by quentin on 24/03/17.
 */

public class JeuPythonActivity extends Fragment {

    public static Fragment newInstance(Context context) {
        JeuPythonActivity fr= new JeuPythonActivity();
        return fr;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragement_jeupython, null);
        return root;
    }
}
