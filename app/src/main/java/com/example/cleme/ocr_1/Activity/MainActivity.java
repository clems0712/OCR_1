package com.example.cleme.ocr_1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.cleme.ocr_1.KPrefModel;
import com.example.cleme.ocr_1.R;

public class MainActivity extends AppCompatActivity {

  private  TextView mGreeting;
  private  EditText mEmailEdit;
  private  EditText mPasswordEdit;
  private  Button mConnectBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGreeting = (TextView)findViewById(R.id.ViewWelcome);
        mEmailEdit = (EditText)findViewById(R.id.editTextEmail);
        mPasswordEdit = (EditText)findViewById(R.id.editTextPassword);
        mConnectBtn = (Button)findViewById(R.id.BtnConnect);


        mConnectBtn.setEnabled(false);

        if(!KPrefModel.INSTANCE.getUserMail().isEmpty()){
           String EmailPref= KPrefModel.INSTANCE.getUserMail().toString();
           mEmailEdit.setText(EmailPref);
        }


        mPasswordEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                mConnectBtn.setEnabled(!s.toString().isEmpty());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        mConnectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KPrefModel.INSTANCE.setUserMail(mEmailEdit.getText().toString());


                Intent GameActivityIntent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(GameActivityIntent);


            }
        });



    }



}
