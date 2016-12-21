package com.rafael.bruno.crimecalculator;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela1 extends AppCompatActivity {

    private Button tela_btn_abrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        //referencias
        tela_btn_abrir = (Button) findViewById(R.id.tela1_btn_abrir);
        tela_btn_abrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Tela1.this,Tela2.class);
                startActivity(it);
                finish();
            }
        });
}
}