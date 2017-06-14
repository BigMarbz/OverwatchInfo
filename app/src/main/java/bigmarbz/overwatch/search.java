package bigmarbz.overwatch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class search extends AppCompatActivity implements View.OnClickListener {
    Button search;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        editText = (EditText) findViewById(R.id.editText);
        search = (Button) findViewById(R.id.search33);
        search.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String searchinfo = editText.getText().toString();
        switch (v.getId()) {
            case R.id.search33:
                Uri uri = Uri.parse("https://www.overbuff.com/search?q="+searchinfo);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
        }
    }
}