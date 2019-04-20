package com.example.mashyield.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.mashyield.R;


public class FragmentLancamentos extends Fragment {

    Button btnAdvance;
    TextView txtProduct, txtMesh, txtType, txtColor, txtWeight, txtDate;
    EditText editTextProduct, editTextMesh, editTextType, editTextColor, editTextWeight, editTextDate;
    RadioButton radioAdult, radioChildren, radioCustom;

    String product;
    double weight;
    String weightText;

    Context context;

    View view;

    public FragmentLancamentos() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Context context;


    } //fim do onCreate

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_lancamentos, container, false);

        editTextProduct = view.findViewById(R.id.editTextProduct);
        editTextMesh = view.findViewById(R.id.editTextMesh);
        editTextType = view.findViewById(R.id.editTextType);
        editTextColor = view.findViewById(R.id.editTextColor);
        editTextWeight = view.findViewById(R.id.editTextWeight);
        editTextDate = view.findViewById(R.id.editTextDate);
        btnAdvance = view.findViewById(R.id.btnAdvance);

        btnAdvance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                product = editTextProduct.getText().toString();
                weight = Double.parseDouble(editTextWeight.getText().toString());
                weightText = Double.toString(weight);
            }
        });

        return view;
    }

}
