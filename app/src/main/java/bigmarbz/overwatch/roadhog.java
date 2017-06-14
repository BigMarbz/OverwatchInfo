package bigmarbz.overwatch;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class roadhog extends AppCompatActivity implements View.OnClickListener{
    Button next,previous,lore;
    ViewFlipper viewflipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roadhog);

        next = (Button) findViewById(R.id.next);
        previous = (Button) findViewById(R.id.previous);
        viewflipper = (ViewFlipper) findViewById(R.id.viewflipper);
        lore = (Button) findViewById(R.id.lore);

        next.setOnClickListener(this);
        previous.setOnClickListener(this);
        lore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next:
                viewflipper.showNext();
                break;
            case R.id.previous:
                viewflipper.showPrevious();
                break;
            case R.id.lore:
                Intent intentana = new Intent(roadhog.this, roadhoglore.class);
                roadhog.this.startActivity(intentana);
                MediaPlayer mediaPlayeran = MediaPlayer.create(roadhog.this, R.raw.roadhogsound2);
                mediaPlayeran.start();
                break;
        }
    }
}
