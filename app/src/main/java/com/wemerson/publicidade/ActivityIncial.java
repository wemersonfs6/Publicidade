package com.wemerson.publicidade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.SignInButton;

public class ActivityIncial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incial);

        Button BtnLogin = (Button) findViewById(R.id.btn_login);
        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(ActivityIncial.this, LoginActivity.class);
                startActivity(it);

            }

        });

        Button BtnCadastro = (Button) findViewById(R.id.btn_cadastro);
        BtnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(ActivityIncial.this, SignupActivity.class);
                startActivity(it);

            }

        });
    }
}
