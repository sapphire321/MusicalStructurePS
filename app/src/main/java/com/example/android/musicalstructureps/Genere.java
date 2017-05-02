package com.example.android.musicalstructureps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.android.musicalstructureps.R.id.electronic;


public class Genere extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genere_activity);

        GenereChoice();
    }

    /**
     * Choosing Genere and executing the code using setOnClickListener
     * */
    private void GenereChoice()
    {
        Button classicalBtn = (Button) findViewById(R.id.classical);
       classicalBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent classical = new Intent(Genere.this, NowPlaying.class);
               startActivity(classical);
           }
       });

        Button popBtn = (Button) findViewById(R.id.pop);
        popBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pop = new Intent(Genere.this, NowPlaying.class);
                startActivity(pop);
            }
        });

        Button electronicBtn = (Button) findViewById(electronic);
        electronicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent electro = new Intent(Genere.this, NowPlaying.class);
                startActivity(electro);
            }
        });
    }
}
