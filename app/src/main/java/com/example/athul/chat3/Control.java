package com.example.athul.chat3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Control extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        Button b1= (Button)findViewById(R.id.light);
        Button b2 = (Button)findViewById(R.id.Gas_leakage);
        Button b3 = (Button)findViewById(R.id.Temperature);
        assert b1 != null;
        b1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Intent i =new Intent(Control.this,lighttog.class);
                startActivity(i);
            }



        }
        );
        assert b2!=null;
        b2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Control.this,temperature.class);
                startActivity(i);
            }



        }



        );
        assert b3!=null;
        b3.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v)
            {
                Intent i =new Intent(Control.this,GasLeak.class);
                startActivity(i);

            }

        }

        );
    }
}
