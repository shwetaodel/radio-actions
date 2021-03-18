package com.example.radioactions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtxt;
    Button button;
    RadioGroup radioGroup;
    RadioButton upper,lower,right,left;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtxt=findViewById(R.id.edtxt);
        button=findViewById(R.id.button);
        radioGroup=findViewById(R.id.radioGroup);
        upper=findViewById(R.id.upper);
        lower=findViewById(R.id.lower);
        right=findViewById(R.id.right);
        left=findViewById(R.id.left);
        txt=findViewById(R.id.txt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int checkedId = radioGroup.getCheckedRadioButtonId();
                findRadioButton( checkedId );
            }

            private void findRadioButton(int checkedId) {

                switch (checkedId)
                {
                    case R.id.upper:
                    {
                        String name;
                        name=edtxt.getText().toString();
                        txt.setText(name.toUpperCase());
                    }break;
                    case R.id.lower:
                    {
                        String name;
                        name=edtxt.getText().toString();
                        txt.setText(name.toLowerCase());
                    }break;
                    case R.id.right:
                    {
                        String name;
                        name=edtxt.getText().toString();
                        txt.setText(name.substring(0,5));
                    }break;
                    case R.id.left:
                    {
                        String name;
                        name=edtxt.getText().toString();
                        txt.setText(name.substring(name.length()-5));
                    }break;
                }
            }
        });


    }
}