package com.example.quiz_o_space;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {


    TextView questionTextView;
    Button ansA,ansB,ansC,ansD;
    Button nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        questionTextView= findViewById(R.id.card_question);

        ansA=findViewById(R.id.card_optiona);
        ansB=findViewById(R.id.card_optionb);
        ansC=findViewById(R.id.card_optionc);
        ansD=findViewById(R.id.card_optiond);
        nextbtn=findViewById(R.id.next_btn);

        ansA.



    }
}