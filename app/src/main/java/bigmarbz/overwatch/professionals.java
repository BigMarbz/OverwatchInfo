package bigmarbz.overwatch;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matthew on 12/30/2016.
 */

public class professionals extends AppCompatActivity {

    private ViewStub stubList;
    private ListView listView;
    private ListViewAdapter listViewAdapter;
    private List<Product> productList;
    private int currentViewMode = 0;

    static final int VIEW_MODE_LISTVIEW = 0;
    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professionals);

        stubList = (ViewStub) findViewById(R.id.stub_list);

        //Inflate ViewStub before get view

        stubList.inflate();

        listView = (ListView) findViewById(R.id.mylistview);

        //get list of product
        getProductList();

        //Get current view mode in share reference
        SharedPreferences sharedPreferences = getSharedPreferences("ViewMode", MODE_PRIVATE);
        currentViewMode = sharedPreferences.getInt("currentViewMode", VIEW_MODE_LISTVIEW);//Default is view listview
        //Register item lick
        listView.setOnItemClickListener(onItemClick);

        switchView();

    }

    private void switchView() {
        //Display listview
        stubList.setVisibility(View.VISIBLE);
        setAdapters();
    }

    private void setAdapters() {
        listViewAdapter = new ListViewAdapter(this, R.layout.list_item, productList);
        listView.setAdapter(listViewAdapter);

    }

    public List<Product> getProductList() {
        //pseudo code to get product, replace your code to get real product here
        productList = new ArrayList<>();
        productList.add(new Product(R.drawable.surefour, "Surefour", "C9"));
        productList.add(new Product(R.drawable.seagull, "Seagull", "NRG"));
        productList.add(new Product(R.drawable.lassiz, "Lassiz", "Dignitas"));
        productList.add(new Product(R.drawable.roflgator, "Roflgator", "Fnatic"));
        productList.add(new Product(R.drawable.sdburn, "Shadowburn", "FaZe"));
        productList.add(new Product(R.drawable.envyus, "Taimou", "EnVyUs"));
        productList.add(new Product(R.drawable.gods, "Gods", "NRG"));
        productList.add(new Product(R.drawable.fnatic, "iddqd", "Fnatic"));
        productList.add(new Product(R.drawable.complexity, "Harbleu", "CompLexity"));
        return productList;
    }

    AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //Do any thing when user click to item
            Toast.makeText(getApplicationContext(), productList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            switch (productList.get(position).getTitle()) {
                case "Surefour":
                    Uri uri = Uri.parse("https://www.twitch.tv/surefour");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    break;
                case "Seagull":
                    Uri uri2 = Uri.parse("https://www.youtube.com/channel/UCaFnEJ5tWlK0TO5PWHqr8Hw");
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                    startActivity(intent2);
                    break;
                case "Lassiz":
                    Uri uri3 = Uri.parse("https://www.twitch.tv/lassiz");
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                    startActivity(intent3);
                    break;
                case "Roflgator":
                    Uri uri4 = Uri.parse("https://www.twitch.tv/roflgator");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                    break;
                case "Shadowburn":
                    Uri uri5 = Uri.parse("https://www.twitch.tv/sdburn");
                    Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
                    startActivity(intent5);
                    break;
                case "Taimou":
                    Uri uri6 = Uri.parse("https://www.twitch.tv/taimoutv");
                    Intent intent6 = new Intent(Intent.ACTION_VIEW, uri6);
                    startActivity(intent6);
                    break;
                case "Gods":
                    Uri uri7 = Uri.parse("https://www.twitch.tv/gods_live");
                    Intent intent7 = new Intent(Intent.ACTION_VIEW, uri7);
                    startActivity(intent7);
                    break;
                case "iddqd":
                    Uri uri8 = Uri.parse("https://www.twitch.tv/iddqdow");
                    Intent intent8 = new Intent(Intent.ACTION_VIEW, uri8);
                    startActivity(intent8);
                    break;
                case "Harbleu":
                    Uri uri9 = Uri.parse("https://www.twitch.tv/harbleu");
                    Intent intent9 = new Intent(Intent.ACTION_VIEW, uri9);
                    startActivity(intent9);
                    break;
            }

        }
    };
}
