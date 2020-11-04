package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.DateIntervalFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.text.DecimalFormat;

public class showInfor extends AppCompatActivity {

    Toolbar tbCTSP;
    ImageView imgCTSP;
    TextView tvTenCTSP, tvCTSP , tvgiaCTSP;
    Button btnaddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_infor);
        Intent intent = getIntent();
        AnhXa();
        GetInformation();
        TroVe();
    }

    private void TroVe() {
        findViewById(R.id.btnCTSPBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void GetInformation() {
        product product = (product) getIntent().getSerializableExtra("product");

        tvTenCTSP.setText(product.getTen());
        imgCTSP.setImageResource(product.getAvt());
        tvgiaCTSP.setText("Giá: " + String.valueOf(product.getGia()) + "đ");
        tvCTSP.setText(product.getChitietsp());

    }

    private void AnhXa() {
        imgCTSP = findViewById(R.id.imgCTSP);
        tvTenCTSP = findViewById(R.id.tvTenCTSP);
        tvCTSP = findViewById(R.id.tvCTSP);
        tvgiaCTSP = findViewById(R.id.giaCTSP);
        btnaddToCart = findViewById(R.id.btnAddtoCart);
    }
}