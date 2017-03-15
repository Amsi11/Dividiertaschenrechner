package com.example.jasmin.dividiertaschenrechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dividiere(View v){

        //Verweisen auf die 3 Felder von der App
        EditText dividend=(EditText)findViewById(R.id.dividendeingabe);
        EditText divisor=(EditText)findViewById(R.id.divisoreingabe);
        EditText output=(EditText)findViewById(R.id.output);

        //Elemente rausholen, die im Feld eingegeben wurden
        Double divid = Double.parseDouble(dividend.getText().toString());
        Double divis = Double.parseDouble(divisor.getText().toString());

        if(divis==0){
            //Errormeldung, wenn man versucht durch 0 zu dividieren
            output.setText("Durch 0 nicht dividieren!");
        }else if(divid==0){
            //Ausgabe einer 0 bei z. B. 0/10, um das 0.0 wegen der Kommastellen zu umgehen
            output.setText("0");
        }else{
            //Ausgabe in Feld Output generieren
            output.setText(String.valueOf(divid/divis));

        }

    }
}
