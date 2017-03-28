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

public class JeuProgCarteActivity extends Fragment {


    public static Fragment newInstance(Context context) {
        JeuProgCarteActivity fr= new JeuProgCarteActivity();
        return fr;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragement_prog_carte, null);
        return root;
    }
}
