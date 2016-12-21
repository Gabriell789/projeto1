package com.rafael.bruno.crimecalculator;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela2 extends AppCompatActivity {

    private EditText tela2_s1;
    private EditText tela2_s2;
    private Button tela2_btn_calcular;

    private Calcular calc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        tela2_s1 = (EditText) findViewById(R.id.tela2_nomeS1);
        tela2_s2 = (EditText) findViewById(R.id.tela2_nomeS2);
        tela2_btn_calcular = (Button) findViewById(R.id.tela2_btn_calcular);
        tela2_btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calc= new Calcular();
                calc.setSuspeito1(tela2_s1.getText().toString());
                calc.setSuspeito2(tela2_s2.getText().toString());

                AlertDialog.Builder msg = new AlertDialog.Builder(Tela2.this);
                msg.setTitle("Resultado");
                msg.setMessage(calc.toString());
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_botao),null);
                msg.show();
            }//fecha Onclick
        });
    }//fecha Oncreate
}//fecha classe
