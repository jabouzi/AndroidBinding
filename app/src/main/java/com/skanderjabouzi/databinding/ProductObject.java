package com.skanderjabouzi.databinding;

import android.databinding.BaseObservable;
import android.databinding.ObservableDouble;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by Skander Jabouzi on 2018-03-11.
 * Manulife
 * skander_jabouzi@manulife.com
 */

public class ProductObject extends BaseObservable {
    public final ObservableInt image = new ObservableInt();
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableDouble productPrice = new ObservableDouble();
    public final ObservableField<String> description = new ObservableField<>();
}
