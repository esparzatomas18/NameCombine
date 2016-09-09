package com.example.tomasesparza.namecombine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText firstName, lastName;
    Button submit;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = (EditText) findViewById(R.id.firstNameEditTxt);
        lastName = (EditText) findViewById(R.id.lastNameEditTxt);
        submit = (Button) findViewById(R.id.btnSubmit);
        output = (TextView) findViewById(R.id.combinedTxt);

    }
    public void submitClicked(View v){

        String fName, lName, fullName;

        fName = firstName.getText().toString();
        lName = lastName.getText().toString();
        fullName = fName + lName;

        output.setText(fullName);


    }



}
