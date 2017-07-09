package com.example.android.tourguide;

import android.content.Context;
import android.location.Location;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Ryoko on 09/07/2017.
 */

public class ViewAdapter extends ArrayAdapter<Location> {

    public ViewAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }
}

