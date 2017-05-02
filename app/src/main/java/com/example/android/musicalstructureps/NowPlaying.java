package com.example.android.musicalstructureps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class NowPlaying extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstaneState)
    {
        super.onCreate(savedInstaneState);
        setContentView(R.layout.now_playing);

        ArtistDetails();
    }

    /**
     * Sets OnCLickListener on Artist Logo and opens Detail.java which contains
     * Details about the current played song
     * */
    private void ArtistDetails()
    {
        ImageView about = (ImageView) findViewById(R.id.artistLogo);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowPlaying.this, Detail.class);
                startActivity(intent);
            }
        });
    }

}
