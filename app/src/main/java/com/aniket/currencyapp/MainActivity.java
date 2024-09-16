package com.aniket.currencyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {
    EditText etInput;
    Button btnConvert;
    Spinner spinner1;
    TextView txtResult;
    String list, getMoney;

    ArrayAdapter adapter;
    Handler handler = new Handler();
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = findViewById(R.id.etInput);
        btnConvert = findViewById(R.id.btnConvert);
        txtResult = findViewById(R.id.txtOutput);
        spinner1 = findViewById(R.id.spinner1);
        FirebaseApp.initializeApp(this);

        generateToken();


        runnable = new Runnable() {
            @Override
            public void run() {
                generateKey();
            }
        };

       handler.postDelayed(runnable, 5000);

        //it is used to create list of item in spinner and give layout
        adapter = ArrayAdapter.createFromResource(this, R.array.currencies, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        //here we apply click listener on spinner
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                list = parent.getItemAtPosition(position).toString();
                switch (list) {
                    case "KWD - Kuwaiti Dinar": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 245.70));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }
                    case "USD - US Dollar": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 82.86));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }

                    case "BHD - Bahrain Dinar": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 82.80));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }

                    case "OMR - Omani Riyal": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 215.21));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }

                    case "JOD - Jordanian Dinar": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 117.01));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }

                    case "GBP - Pound": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 105.53));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }

                    case "EUR - Euro": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 90.98));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }

                    case "TRY - Turkish Lira": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 3.07));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }

                    case "QAR - Qatari Rial": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 22.76));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }

                    case "CAD - Canadian Dollar": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 61.71));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }

                    case "AUD - Australian Dollar": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 54.21));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }

                    case "SGD - Singapore Dollar": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 61.63));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }

                    case "SAR - Saudi Riyal": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 22.08));
                                    txtResult.setText("" + sorter);
                                }
                            }
                        });
                        break;
                    }

                    case "NPR - Nepalese Rupee": {
                        btnConvert.setOnClickListener(new View.OnClickListener() {
                            @SuppressLint("SetTextI18n")
                            @Override
                            public void onClick(View v) {
                                getMoney = etInput.getText().toString();
                                if (getMoney.isEmpty()) {
                                    Toast.makeText(getApplicationContext(), "Please enter value to convert", Toast.LENGTH_SHORT).show();
                                } else {
                                    double convertToDouble_et = Double.parseDouble(getMoney);
                                    double sorter = Double.parseDouble(new DecimalFormat("##.####").format(convertToDouble_et * 0.63));
                                    txtResult.setText("" + sorter);
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

    private void generateKey() {
        String firebaseMessagingScope =
                "https://www.googleapis.com/auth/firebase.messaging";

                try {

                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Handler handler = new Handler(Looper.getMainLooper());
                    executor.execute(() -> {
                        try {
                            String jsonString = "{\n" +
                                    "  \"type\": \"service_account\",\n" +
                                    "  \"project_id\": \"currencyapp-f88f1\",\n" +
                                    "  \"private_key_id\": \"b546dfeac20c15a79c84d389ff062c726f999f5f\",\n" +
                                    "  \"private_key\": \"-----BEGIN PRIVATE KEY-----\\nMIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDF991fW3ng0yZ7\\n+mK7pioqMhsBuUscndMcf09UPceouwwlVkBk9vpv+SFGYoDMUon1xEifew2qOjEN\\nGLMcGw5dkpuwfCxQn/K/AiNdz+bYXMlhcTzvkjYt2GmQi55k52wuHAVOopFAC+f1\\nuZLoUZ/7fhwXiYXwZyB6c6CcMR2VHxID4P2dOHsm6XkgEy1lG5uaCBKNXUzgQmvC\\nI7iOF8gbY8LWTqQMK3r/w73TG/6WfMYDtqBhcmGKyA8+1MM2tYMDOrgYgrISfVJd\\ny1if4b2rmHufL7KMGyoiCRecx71tj3r4AlyFWyQLyWVVTPatWsUSlY6LsgOfYgw9\\n0PqapYdNAgMBAAECggEAN3mu6jLbI3poFWPj2QvGUw65bLE88Cb16s1uMIAjfA/2\\nZlwWLXTcVxZsEao2x4r1qA45/57fBG3MIwxh3KVkUCpuQHV7gZhg0M/Lk1VYLhdK\\nQ2kVF1lUn2I+qsfFOidztDQb9J4vr8/mT4CSP1HoT/RV8O6TvvtXKZlPT5Wf4ZJW\\nMPl1mYD7DjLTrWM6omWrlJHoV1LM/uJfPff66/IoOy6EV9MpBQtZKToUPDak+5Dv\\n3wWKqnXI2pDw7S8keDQ6fs6UPjP2n7rlGA1nZAqbjD+NCTQwd3ERXLKFXIyK+kFb\\n/mIjI34ZRq3cRvVqkWrnF+7TL/+J792XyZEmAIhdrQKBgQDiLC+t9eJGNhEMRBih\\nXSZfb8NZrC5UwN3UkIIIvwOIbd7HKyhRUQ8urfQuxL/8orBJoQFILNY8Fu9ucQfr\\nTBKK1mlY77g+Z7Y68VK+DzY3aFBgJIyGfRm+gM2P9CuMV2K3pUvP0f4ldi/6Ih0J\\njVUxBmk+pKkXkdMqLm+o0LML3wKBgQDgE3hm4KJZzvXBe73FLK83iKkL4vAY7ULa\\n6FICf9h1ohQfACVnw0m12ROwXhhpdu3oJyOOGIeGexyQC/vL85qcIbT9dcMfPU2Y\\nxQWuC+G9uvcg5BnYGxVtKpvIIMxfmxHl4gKKcpUztgx2aO2xLGEulXN1PC52U+dZ\\nK9+eLp0SUwKBgQDO/BMyiClpigd2C0fjPUVl5/mGsm3AQLWC2DE44d7Q14QfEB8Y\\ntC9J0Ab9WjA9e4IMEB4FOItjeLXsg+L0cq0xhGHq84/RBMcgEERiDbfXY07Tff9h\\nAVIzJtt5V8MW7843NT45VfvZutzTdK7QVBjYAf8FRlo9aMYw/0hO3ZhOTwKBgDae\\nqF+za/+mQiN6rURt4vwPdN1v4QTCeORxcuQnE7WA35S67WNAqCwKkRERrrOuiMlp\\nGPKfKhHu2oSGV0dcxxg94ydRWFG6GLsfc4X8YXdlJq4+y8nwuCVXGIgM7qRzYUZ+\\n9A2ZZqMnQhxu8VmZrsqzJWSzWcQAKcmDt0uQozr/AoGAE6dwaXDEqrAG8qX411tt\\nskxZI1zXXE0jccvCY7HDu5PbVoRepwjUTp18GcDhLJ43l2XvbpS2DYA6tKDaBteD\\n7YlvCJ9HwR+6L2RlK0/heE/grXlorAai9c9T8IpXAdQchBPRDtBmFl7/rlLwiq9c\\n1bggimYA8K4wao2lpCXT2Ik=\\n-----END PRIVATE KEY-----\\n\",\n" +
                                    "  \"client_email\": \"firebase-adminsdk-bs0vz@currencyapp-f88f1.iam.gserviceaccount.com\",\n" +
                                    "  \"client_id\": \"106313848039185659897\",\n" +
                                    "  \"auth_uri\": \"https://accounts.google.com/o/oauth2/auth\",\n" +
                                    "  \"token_uri\": \"https://oauth2.googleapis.com/token\",\n" +
                                    "  \"auth_provider_x509_cert_url\": \"https://www.googleapis.com/oauth2/v1/certs\",\n" +
                                    "  \"client_x509_cert_url\": \"https://www.googleapis.com/robot/v1/metadata/x509/firebase-adminsdk-bs0vz%40currencyapp-f88f1.iam.gserviceaccount.com\",\n" +
                                    "  \"universe_domain\": \"googleapis.com\"\n" +
                                    "}";
                            InputStream stream = new ByteArrayInputStream(jsonString.getBytes(StandardCharsets.UTF_8));
                            GoogleCredentials googleCredentials = GoogleCredentials.fromStream(stream).createScoped(firebaseMessagingScope);
                            googleCredentials.refresh();
                            String tokenKey = googleCredentials.getAccessToken().getTokenValue();
                            Log.e("AccessToken", "getAccessToken: " + tokenKey);

                        } catch (IOException e) {
                            handler.post(() -> Log.e("AccessTokenError", "Error refreshing token", e));
                        }
                    });


                } catch (Exception e) {
                    Log.e("AccessToken", "getAccessToken: " + e.getLocalizedMessage());
                }

    }

    private void generateToken() {
        // Retrieve FCM registration token
        FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(new OnCompleteListener<String>() {
                    @Override
                    public void onComplete(@NonNull Task<String> task) {
                        if (!task.isSuccessful()) {
                            Log.w("FCM", "Fetching FCM registration token failed", task.getException());
                            return;
                        }

                        // Get new FCM registration token
                        String token = task.getResult();

                        // Log and display the token
                        Log.d("FCM", "Token: " + token);
                    }
                });
    }
}