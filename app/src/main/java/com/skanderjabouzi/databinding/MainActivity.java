package com.skanderjabouzi.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.skanderjabouzi.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ProductObject productObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding bindings = DataBindingUtil.setContentView(this, R.layout.activity_main);
        productObject = new ProductObject();
        productObject.image.set(R.drawable.sandals);
        productObject.name.set("Navy blue sandals");
        productObject.description.set("Beautiful fitted sandals for work");
        productObject.productPrice.set(34.50);
        bindings.setProduct(productObject);
    }

    public void updateProduct(View v) {
        productObject.image.set(R.drawable.sandals2);
        productObject.name.set("Brown sandals");
        productObject.description.set("Men sandals for walking");
        productObject.productPrice.set(25.60);
    }
}
