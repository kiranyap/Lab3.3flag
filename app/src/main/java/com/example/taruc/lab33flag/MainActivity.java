package com.example.taruc.lab33flag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinnerAge;
    private RadioGroup radioGroupGender;
    private RadioButton radioButtonMale, radioButtonFemale;
    private CheckBox checkBoxSmoker;
    private TextView textViewPremium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking UI to program
        spinnerAge = (Spinner)findViewById(R.id.spinnerAge);
        radioGroupGender = (RadioGroup)findViewById(R.id.radioGroupGender);
        radioButtonMale = (RadioButton)findViewById(R.id.radioButtonMale);
        radioButtonFemale = (RadioButton)findViewById(R.id.radioButtonFemale);
        checkBoxSmoker = (CheckBox)findViewById(R.id.checkBoxSmoker);
        textViewPremium = (TextView)findViewById(R.id.textViewPremium);


        //create an adapter
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.age_group, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAge.setOnItemSelectedListener(this);
        spinnerAge.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Position:" + position, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void calculatePremium(View view)
    {
        double premium =0;
        int pos;
        pos = spinnerAge.getSelectedItemPosition();

        //determine the gender of user
        int indexGender;
        indexGender = radioGroupGender.getCheckedRadioButtonId();

        if(indexGender == R.id.radioButtonMale)
        {
            //TODO: calcualte premium for male
            Premium(pos);

        }
        else
        {
            //TODO: calculate premium for female
        }


        //Check smoker
        if(checkBoxSmoker.isChecked())
        {

        }

        //display premium
        textViewPremium.setText(getString(R.string.premium) + premium);


    }

    public double Premium(int pos)
    {
        double premium = 0;
        if(pos < 6)
        {
            premium = 50;
        }

        else if(pos < 11)
        {
            premium = 55;
        }

        else if(pos < 16)
        {
            premium = 60;
        }

        else if(pos < 22)
        {
            premium = 70;
        }

        else if(pos < 31)
        {
            premium = 120;
        }

        else if(pos < 41)
        {
            premium = 160;
        }


        else if(pos < 51)
        {
            premium = 200;
        }

        else if (pos >50)
        {
            premium = 250;
        }

        return premium;
    }


    public double SmokerPremium(int pos)
    {
        double premium = 0;
        if(pos < 6)
        {
            premium = 50;
        }

        else if(pos < 11)
        {
            premium = 55;
        }

        else if(pos < 16)
        {
            premium = 110;
        }

        else if(pos < 22)
        {
            premium = 170;
        }

        else if(pos < 31)
        {
            premium = 220;
        }

        else if(pos < 41)
        {
            premium = 210;
        }


        else if(pos < 51)
        {
            premium = 200;
        }

        else if (pos >50)
        {
            premium = 250;
        }

        return premium;
    }

    public double girlPremium(int pos)
    {
        double premium = 0;
        if(pos < 6)
        {
            premium = 50;
        }

        else if(pos < 11)
        {
            premium = 55;
        }

        else if(pos < 16)
        {
            premium = 110;
        }

        else if(pos < 22)
        {
            premium = 170;
        }

        else if(pos < 31)
        {
            premium = 220;
        }

        else if(pos < 41)
        {
            premium = 210;
        }


        else if(pos < 51)
        {
            premium = 200;
        }

        else if (pos >50)
        {
            premium = 250;
        }

        return premium;
    }


}
