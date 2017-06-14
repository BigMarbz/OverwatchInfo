package bigmarbz.overwatch;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tiers extends AppCompatActivity implements View.OnClickListener {
    Button tierbutton, lucio, reinhardt, ana, soldier76, mei, zenyatta, zarya, sombra, roadhog, dva, genji, mercy, symmetra, junkrat, mccree, pharah, tracer, reaper, winston, torbjorn, bastion, hanzo, widowmaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiers);

        tierbutton = (Button) findViewById(R.id.tierbutton);

        tierbutton.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tierbutton:
                Uri uri = Uri.parse("https://www.boostards.com/overwatch/news/overwatch-tier-list-season-3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
        }
    }
}
