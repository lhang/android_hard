package com.example.lllde.androidhard.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lllde.androidhard.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentActivityFragment extends Fragment {

    public FragmentActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment, container, false);
    }
}
