package com.example.uidevcodes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout nameContainer;
    private LinearLayout addressContainer;
    private LinearLayout parentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createNameContainer();
        createAddressContainer();
        createParentContainer();
//        setContentView(R.layout.activity_main);
        setContentView(parentContainer);
    }

    private void createParentContainer() {
        parentContainer = new LinearLayout(this);
        parentContainer.setLayoutParams(new LinearLayout.
                LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.FILL_PARENT));
        parentContainer.setOrientation(LinearLayout.VERTICAL);

        parentContainer.addView(nameContainer);
        parentContainer.addView(addressContainer);

    }

    private void createAddressContainer() {
        addressContainer = new LinearLayout(this);

        addressContainer.setLayoutParams(new LinearLayout.
                LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        addressContainer.setOrientation(LinearLayout.VERTICAL);
        TextView addrLbl = new TextView(this);
        addrLbl.setText("Address: ");

        TextView addressValue = new TextView(this);
        addressValue.setText(R.string.actorAddress);

        addressContainer.addView(addrLbl);
        addressContainer.addView(addressValue);
    }

    private void createNameContainer() {
        nameContainer = new LinearLayout(this);
        nameContainer.setLayoutParams(new LinearLayout.
                LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        nameContainer.setOrientation(LinearLayout.HORIZONTAL);

        TextView nameLbl = new TextView(this);
        nameLbl.setText("Name: ");

        TextView nameValue = new TextView(this);
        nameValue.setText(R.string.actorName);

        nameContainer.addView(nameLbl);
        nameContainer.addView(nameValue);
    }
}