package com.tyoang.wisatapantaimalang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.tyoang.wisatapantaimalang.pantai.BaleActivity;
import com.tyoang.wisatapantaimalang.pantai.BanyuActivity;
import com.tyoang.wisatapantaimalang.pantai.BatuActivity;
import com.tyoang.wisatapantaimalang.pantai.GatraActivity;
import com.tyoang.wisatapantaimalang.pantai.LeterActivity;
import com.tyoang.wisatapantaimalang.pantai.LicinActivity;
import com.tyoang.wisatapantaimalang.pantai.SendangActivity;
import com.tyoang.wisatapantaimalang.pantai.SendikiActivity;
import com.tyoang.wisatapantaimalang.pantai.TelukActivity;
import com.tyoang.wisatapantaimalang.pantai.TigaActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton pantaiBale =findViewById(R.id.pantaiBale);
        pantaiBale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bale = new Intent(getBaseContext(), BaleActivity.class);
                startActivity(bale);
            }
        });
        ImageButton pantaiBanyu =findViewById(R.id.pantaiBanyu);
        pantaiBanyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent banyu = new Intent(getBaseContext(), BanyuActivity.class);
                startActivity(banyu);
            }
        });
        ImageButton pantaiBatu =findViewById(R.id.pantaiBatu);
        pantaiBatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent batu = new Intent(getBaseContext(), BatuActivity.class);
                startActivity(batu);
            }
        });
        ImageButton pantaiGatra =findViewById(R.id.pantaiGatra);
        pantaiGatra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gatra = new Intent(getBaseContext(), GatraActivity.class);
                startActivity(gatra);
            }
        });
        ImageButton pantaiLeter =findViewById(R.id.pantaiWatu);
        pantaiLeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent leter = new Intent(getBaseContext(), LeterActivity.class);
                startActivity(leter);
            }
        });
        ImageButton pantaiLicin =findViewById(R.id.pantaiLicin);
        pantaiLicin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent licin = new Intent(getBaseContext(), LicinActivity.class);
                startActivity(licin);
            }
        });
        ImageButton pantaiSendang =findViewById(R.id.pantaiSendang);
        pantaiSendang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendang = new Intent(getBaseContext(), SendangActivity.class);
                startActivity(sendang);
            }
        });
        ImageButton pantaiSendiki =findViewById(R.id.pantaiSendiki);
        pantaiSendiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendiki = new Intent(getBaseContext(), SendikiActivity.class);
                startActivity(sendiki);
            }
        });
        ImageButton pantaiTeluk =findViewById(R.id.pantaiTeluk);
        pantaiTeluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent teluk = new Intent(getBaseContext(), TelukActivity.class);
                startActivity(teluk);
            }
        });
        ImageButton pantaiTiga =findViewById(R.id.pantaiTiga);
        pantaiTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tiga = new Intent(getBaseContext(), TigaActivity.class);
                startActivity(tiga);
            }
        });
        Button akun =findViewById(R.id.button3);
        akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent akun = new Intent(getBaseContext(), ProfileActivity.class);
                startActivity(akun);
            }
        });
    }
}
