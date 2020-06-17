package com.fyp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.tiper.MaterialSpinner;

public class login_Screen extends AppCompatActivity {

    MaterialSpinner spinner2;
    Button login_button;
    private static final String[] ITEMS = {"Patient", "Pharmacy", "Laboratory"};

    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        String selected_option;
        setContentView(R.layout.activity_login_screen);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, ITEMS);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final MaterialSpinner materialSpinner = findViewById(R.id.material_spinner);
        materialSpinner.setAdapter(adapter);
        login_button=findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        String selected_option= (String) materialSpinner.getSelectedItem();
        Log.d("switch check", selected_option);
        switch (selected_option) {
            case "Patient": {

                        startActivity(new Intent(login_Screen.this, dashboard.class));
                        finish();
                        break;



            }
            case "Laboratory":
            {

                        startActivity(new Intent(login_Screen.this, dashboard.class));
                        finish();
                        break;

        }
            case "Pharmacy":
            {

                        startActivity(new Intent(login_Screen.this, dashboard_pharmacy.class));
                        finish();
                        break;

            }


        }

            }

        });



    }

}