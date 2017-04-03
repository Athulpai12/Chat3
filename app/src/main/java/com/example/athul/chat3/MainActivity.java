package com.example.athul.chat3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ProgressBar p = (ProgressBar)findViewById(R.id.progressBar1);
        p.setVisibility(View.GONE);
       Button b = (Button)findViewById(R.id.button2);
       b.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View v)
           {
               p.setVisibility(View.VISIBLE);
               Intent i = new Intent(MainActivity.this, VirtualAssistnt.class);
               startActivity(i);
           }
       });;
        Button b2 = (Button)(findViewById(R.id.button3));
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                Intent i = new Intent(MainActivity.this, Graph.class);
                startActivity(i);
            }
        });
        Button b3 = (Button)(findViewById(R.id.button));
        b3.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v)
            {
                Intent i =new Intent(MainActivity.this,Control.class);
                startActivity(i);
            }
        }





        );
    }
    @Override
    public void onResume() { // this is called by your activity before it gets visible to the user, when you leave this activity 2 and come back to
        //activity 1, because activity 1 wasn't killed it is resumed from the backstack and this function is called
        // TODO Auto-generated method stub
        super.onResume();
        // so you will check here, if your button is visible or not like the way you did in the onclick for the progressbar
        ProgressBar p = (ProgressBar) findViewById(R.id.progressBar1);
        Button b = (Button) findViewById(R.id.button1); // if you have already instantiated your button then nevermind
        if (b.getVisibility() != View.VISIBLE) { // check if it is visible
            //View.VISIBLE is an int variable which is 0
            b.setVisibility(View.VISIBLE); // if not set it to visible
            // p.setVisibility(View.INVISIBLE or View.GONE); //View.INVISIBLE is 1, and 2 is View.GONE
            // you can either use the ints or the static variables.. gone stands for when the view is invisible and is not accounted for with respect to space on the screen
            // so if you use relativeLayout and you align a view in respect to another if you use gone your viewlayout will be squashed around,
            // invisible is the when its invisible and is being accounted for
        }
    }
}
