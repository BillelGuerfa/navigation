package app.com.example.billelguerfa.tabbedtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Billel Guerfa on 14/03/2016.
 */
public class PlaceholderFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, null);
        Bundle bundle = getArguments();
        TextView textView = (TextView) view.findViewById(R.id.section_label);
        textView.setText(Integer.toString(bundle.getInt("position")));
        return view;
    }
}
