package bigmarbz.overwatch;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;


public class eichenwalde extends AppCompatActivity implements View.OnClickListener {
    Button maptips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eichenwalde);
        maptips = (Button) findViewById(R.id.maptips);
        maptips.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.maptips){
            Uri uri5 = Uri.parse("https://www.youtube.com/watch?v=LcoxG7LjFCU");
            Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
            startActivity(intent5);
        }
    }
}


