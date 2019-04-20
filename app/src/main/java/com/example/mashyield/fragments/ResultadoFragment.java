package com.example.mashyield.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mashyield.R;


public class ResultadoFragment extends Fragment {


    Button btnSoma;
    TextView txt_Pp, txt_P, txt_M, txt_G, txt_GG, txt_Exg, textView_total;
    EditText editText_Pp, editText_P, editText_M, editText_G, editText_GG, editText_Exg, editText_total;

    Context context;
    FragmentLancamentos fragmentLancamentos;

    double media;
    double weight;
    String productR;
    View view;

    int pp,p, m, g, gg, exg, total;
    String totalStr;

    public ResultadoFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context = getContext();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.resultado_modelo, container, false);

        editText_Pp = view.findViewById(R.id.editText_Pp);
        editText_P = view.findViewById(R.id.editText_P);
        editText_M = view.findViewById(R.id.editText_M);
        editText_G = view.findViewById(R.id.editText_G);
        editText_GG = view.findViewById(R.id.editText_GG);
        editText_Exg = view.findViewById(R.id.editText_Exg);
        editText_total = view.findViewById(R.id.editText_total);
        btnSoma = view.findViewById(R.id.btnSoma);


        btnSoma.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           try {

                                               fragmentLancamentos = new FragmentLancamentos();

                                               pp =  Integer.parseInt(editText_Pp.getText().toString());
                                               p =  Integer.parseInt(editText_P.getText().toString());
                                               m =  Integer.parseInt(editText_M.getText().toString());
                                               g =  Integer.parseInt(editText_G.getText().toString());
                                               gg =  Integer.parseInt(editText_GG.getText().toString());
                                               exg =  Integer.parseInt(editText_Exg.getText().toString());
                                               total =  pp + p + m + g + gg + exg;
                                               totalStr = Integer.toString(total);
                                               editText_total.setText(totalStr);
                                               media = total / weight;

                                               Log.i("media: ", "Essa é a média: "+ media);

                                           } catch (Exception e) {
                                               Toast.makeText(context, "Faltou informações", Toast.LENGTH_LONG).show();
                                           }
                                       }
                                   }

        );//fim do metodo onClick btnSoma

        return view;
    }

}
