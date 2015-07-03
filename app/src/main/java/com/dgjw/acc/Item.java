package com.dgjw.acc;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by johnathon on 7/2/2015.
 */
public class Item implements Nameable, Parcelable {

    private String name;
    private Boolean collected;

    Item(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(name);
    }
}
