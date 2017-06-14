package bigmarbz.overwatch;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class youtube extends AppCompatActivity implements View.OnClickListener {
Button professionals, streamers, guides, montages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        professionals = (Button) findViewById(R.id.professionals);
        streamers = (Button) findViewById(R.id.streamers);
        guides = (Button) findViewById(R.id.guides);
        montages = (Button) findViewById(R.id.montages);

        professionals.setOnClickListener(this);
        montages.setOnClickListener(this);
        guides.setOnClickListener(this);
        streamers.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.professionals:
                Intent intent4 = new Intent(youtube.this, professionals.class); //Done
                youtube.this.startActivity(intent4);
                break;
            case R.id.streamers:
                Intent intent5 = new Intent(youtube.this,streamers.class); //Done
                youtube.this.startActivity(intent5);
                break;
            case R.id.guides:
                Intent newintent = new Intent(youtube.this,guides.class);
                youtube.this.startActivity(newintent);
                break;
            case R.id.montages:
                Intent newintent2 = new Intent(youtube.this,montages.class);
                youtube.this.startActivity(newintent2);
                break;
        }
    }
}
