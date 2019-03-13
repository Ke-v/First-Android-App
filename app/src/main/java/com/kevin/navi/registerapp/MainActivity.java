package com.kevin.navi.registerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputNames, inputEmail, inputPassword, inputDOB, inputPhone;
    RadioButton radioMale, radioFemale;
    CheckBox checkBoxTerms;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputNames = findViewById(R.id.enter_names);
        inputEmail = findViewById(R.id.enter_email);
        inputPassword = findViewById(R.id.password);
        inputDOB = findViewById(R.id.date_of_birth);
        inputPhone = findViewById(R.id.phone);
        radioMale = findViewById(R.id.male);
        radioFemale = findViewById(R.id.female);
        checkBoxTerms = findViewById(R.id.checkboxTerms);
        buttonSubmit = findViewById(R.id.submit);

        buttonSubmit.setEnabled(false);

        //listener
        checkBoxTerms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    buttonSubmit.setEnabled(true);
                }else{
                    buttonSubmit.setEnabled(false);
                }
            }
        });


    }

    public void register(View view) {
        String names = inputNames.getText().toString().trim();
        String email = inputEmail.getText().toString().trim();
        String password = inputPassword.getText().toString().trim();
        String dob = inputDOB.getText().toString().trim();
        String phone = inputPhone.getText().toString().trim();
        String gender = radioFemale.isChecked() ? "Female" : "Male";
        String data = names +" "+ email +" "+ phone +" "+ dob +" "+ gender +" "+ password;
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}
