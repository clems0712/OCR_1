package com.example.cleme.ocr_1.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cleme.ocr_1.R;

public class GameActivity extends AppCompatActivity {


    private TextView mViewRep;

  private  Button mButtonRe1;
  private  Button mButtonRe2;
  private  Button mButtonRe3;
  private  Button mButtonRe4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mButtonRe1=(Button)findViewById(R.id.BtnResp1);
        mButtonRe2=(Button)findViewById(R.id.BtnResp2);
        mButtonRe3=(Button)findViewById(R.id.BtnResp3);
        mButtonRe4=(Button)findViewById(R.id.BtnResp4);

        mViewRep=(TextView)findViewById(R.id.ViewRep);

        mButtonRe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewRep.setText(R.string.Bad);

            }
        });

        mButtonRe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mViewRep.setText(R.string.Good);
            }
        });


        mButtonRe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewRep.setText(R.string.Bad);
            }
        });

        mButtonRe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewRep.setText(R.string.Bad);
            }
        });




    }
}
