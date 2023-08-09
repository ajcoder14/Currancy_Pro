package com.aniket.currencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText etInput;
    Button btnConvert;
    Spinner spinner1;
    TextView txtResult;
    String list, getMoney;

    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = findViewById(R.id.etInput);
        btnConvert = findViewById(R.id.btnConvert);
        txtResult = findViewById(R.id.txtOutput);
        spinner1 = findViewById(R.id.spinner1);

        adapter = ArrayAdapter.createFromResource(this, R.array.currencies, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                list = parent.getItemAtPosition(position).toString();
                switch (list){
                    case "KWD - Kuwaiti Dinar":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et *245.70));
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }
                    case "USD - US Dollar":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et * 82.86)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }

                    case "BHD - Bahrain Dinar":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et * 82.80)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }

                    case "OMR - Omani Riyal":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et * 215.21)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }

                    case "JOD - Jordanian Dinar":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et * 117.01)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }

                    case "GBP - Pound":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et * 105.53)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }

                    case "EUR - Euro":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et * 90.98)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }

                    case "TRY - Turkish Lira":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et * 3.07)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }

                    case "QAR - Qatari Rial":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et * 22.76)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }

                    case "CAD - Canadian Dollar":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et * 61.71)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }

                    case "AUD - Australian Dollar":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et * 54.21)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }

                    case "SGD - Singapore Dollar":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et * 61.63)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }

                    case "SAR - Saudi Riyal":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et * 22.08)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }

                    case "NPR - Nepalese Rupee":{
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                }else{
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sotre = Double.parseDouble(new DecimalFormat("##.####").format(  convertToDouble_et *0.63)) ;
                                    txtResult.setText(""+ sotre);
                                }
                            }
                        });
                        break;
                    }


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}