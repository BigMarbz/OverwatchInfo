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

public class guides extends AppCompatActivity {

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
        setContentView(R.layout.activity_guides);

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
        productList.add(new Product(R.drawable.overwatchsmall, "Beginner's Guide", "Game Introduction"));
        productList.add(new Product(R.drawable.gamespot, "Gamespot", "Hero Guides"));
        productList.add(new Product(R.drawable.overwatchsmall, "Lone Hawk", "Ultimate Guides"));
        productList.add(new Product(R.drawable.overwatchcentral, "Master Guides", "Advanced Hero Guides"));
        productList.add(new Product(R.drawable.unitlost, "Unit Lost", "Hero Guides"));
        productList.add(new Product(R.drawable.overwatchsmall, "Cynical Nerds", "Quick Guides"));
        productList.add(new Product(R.drawable.overwatchcentral, "Overwatch Central", "Quick Start Guides"));
        productList.add(new Product(R.drawable.overwatchsmall, "KANDYREW", "Essential Tips"));
        productList.add(new Product(R.drawable.generationhallow, "GenerationHallow", "Pro Tips"));
        productList.add(new Product(R.drawable.generationhallow, "Map Guides", "Overwatch"));

        return productList;
    }

    AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //Do any thing when user click to item
            Toast.makeText(getApplicationContext(), productList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            switch (productList.get(position).getTitle()) {
                case "Lone Hawk":
                    Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLXjBMavBifPix3kURx5xhJ8HRqEnxIV-D");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    break;
                case "Cynical Nerds":
                    Uri uri2 = Uri.parse("https://www.youtube.com/playlist?list=PLOW3wTM0_w5_CVjO9q3r5dlTpDf9udg8s");
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                    startActivity(intent2);
                    break;
                case "Gamespot":
                    Uri uri3 = Uri.parse("https://www.youtube.com/playlist?list=PLpg6WLs8kxGOwCOjDZVbCMuUCoLPPLW0V");
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                    startActivity(intent3);
                    break;
                case "Beginner's Guide":
                    Uri uri4 = Uri.parse("https://www.youtube.com/watch?v=q_lrilSEqOE");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                    break;
                case "Unit Lost":
                    Uri uri5 = Uri.parse("https://www.youtube.com/playlist?list=PLZVkseJlphu-g76IDcatw12i0lWLkDjR3");
                    Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
                    startActivity(intent5);
                    break;
                case "Overwatch Central":
                    Uri uri6 = Uri.parse("https://www.youtube.com/playlist?list=PLrfgw3GXHaHlD93nftqYbL8bQYHfVBOhh");
                    Intent intent6 = new Intent(Intent.ACTION_VIEW,uri6);
                    startActivity(intent6);
                    break;
                case "KANDYREW":
                    Uri uri7 = Uri.parse("https://www.youtube.com/watch?v=e9lBs0ST7vQ");
                    Intent intent7 = new Intent(Intent.ACTION_VIEW,uri7);
                    startActivity(intent7);
                    break;
                case "GenerationHallow":
                    Uri uri8 = Uri.parse("https://www.youtube.com/watch?v=_JUvSWmGvGI");
                    Intent intent8 = new Intent(Intent.ACTION_VIEW,uri8);
                    startActivity(intent8);
                    break;
                case "Master Guides":
                    Uri uri9 = Uri.parse("https://www.youtube.com/playlist?list=PLrfgw3GXHaHneVGBr9UhrDwTnRP3VOAhD");
                    Intent intent9 = new Intent(Intent.ACTION_VIEW,uri9);
                    startActivity(intent9);
                    break;
                case "Map Guides":
                    Uri uri10 = Uri.parse("https://www.youtube.com/watch?v=JFM-JRJfcsY&list=PLrfgw3GXHaHlrRIZxKrwqahhMC5NKs6Xl");
                    Intent intent10 = new Intent(Intent.ACTION_VIEW,uri10);
                    startActivity(intent10);
                    break;
            }

        }
    };
}
