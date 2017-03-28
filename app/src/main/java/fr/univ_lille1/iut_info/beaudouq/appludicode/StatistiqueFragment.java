package fr.univ_lille1.iut_info.beaudouq.appludicode;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by quentin on 28/03/17.
 */

public class StatistiqueFragment extends Fragment {
    public static Fragment newInstance(Context context) {
        StatistiqueFragment fr= new StatistiqueFragment();
        return fr;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.statistique_fragment, null);
        return root;
    }
}
