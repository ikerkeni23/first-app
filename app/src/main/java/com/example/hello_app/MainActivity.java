package com.example.hello_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alerter("ici");

        Button butt = (Button)findViewById(R.id.butt);

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView  nom= (TextView) findViewById(R.id.Name);

                System.out.println(nom.getText());
            }
        });


    }

    private void alerter(String s){
        android.widget.Toast myToast = Toast.makeText(this,"hello",Toast.LENGTH_LONG);
        myToast.show();
        Log.i("Mon activité ",s);
    }
}
