package bigmarbz.overwatch;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tiers extends AppCompatActivity implements View.OnClickListener {
    Button lucio, reinhardt, ana, soldier76, mei, zenyatta, zarya, sombra, roadhog, dva, genji, mercy, symmetra, junkrat, mccree, pharah, tracer, reaper, winston, torbjorn, bastion, hanzo, widowmaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiers);

        lucio = (Button) findViewById(R.id.Lucio);
        reinhardt = (Button) findViewById(R.id.reinhardt);
        reaper = (Button) findViewById(R.id.reaper);
        ana = (Button) findViewById(R.id.Ana);
        tracer = (Button) findViewById(R.id.tracer);
        zarya = (Button) findViewById(R.id.zarya);
        soldier76 = (Button) findViewById(R.id.soldier76);
        mei = (Button) findViewById(R.id.mei);
        zenyatta = (Button) findViewById(R.id.zenyatta);
        sombra = (Button) findViewById(R.id.sombra);
        roadhog = (Button) findViewById(R.id.roadhog);
        dva = (Button) findViewById(R.id.dva);
        genji = (Button) findViewById(R.id.genji);
        mercy = (Button) findViewById(R.id.mercy);
        symmetra = (Button) findViewById(R.id.symmetra);
        junkrat = (Button) findViewById(R.id.junkrat);
        mccree = (Button) findViewById(R.id.mccree);
        pharah = (Button) findViewById(R.id.Pharah);
        winston = (Button) findViewById(R.id.winston);
        torbjorn = (Button) findViewById(R.id.torbjorn);
        bastion = (Button) findViewById(R.id.bastion);
        widowmaker = (Button) findViewById(R.id.widowmaker);
        hanzo = (Button) findViewById(R.id.hanzo);

        lucio.setOnClickListener(this);
        reinhardt.setOnClickListener(this);
        reaper.setOnClickListener(this);
        ana.setOnClickListener(this);
        tracer.setOnClickListener(this);
        zarya.setOnClickListener(this);
        soldier76.setOnClickListener(this);
        mei.setOnClickListener(this);
        zenyatta.setOnClickListener(this);
        sombra.setOnClickListener(this);
        roadhog.setOnClickListener(this);
        dva.setOnClickListener(this);
        genji.setOnClickListener(this);
        mercy.setOnClickListener(this);
        symmetra.setOnClickListener(this);
        junkrat.setOnClickListener(this);
        mccree.setOnClickListener(this);
        pharah.setOnClickListener(this);
        winston.setOnClickListener(this);
        torbjorn.setOnClickListener(this);
        bastion.setOnClickListener(this);
        widowmaker.setOnClickListener(this);
        hanzo.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

    }
}
