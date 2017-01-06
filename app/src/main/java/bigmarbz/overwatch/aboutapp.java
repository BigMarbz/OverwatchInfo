package bigmarbz.overwatch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class aboutapp extends AppCompatActivity implements View.OnClickListener {

    ImageButton github,marbz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutapp);
        github = (ImageButton) findViewById(R.id.github);
        marbz = (ImageButton) findViewById(R.id.marbz);
        github.setOnClickListener(this);
        marbz.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.github:
                Uri uri = Uri.parse("https://github.com/BigMarbz/OverwatchInfo");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.marbz:
                break;

        }
    }
}
