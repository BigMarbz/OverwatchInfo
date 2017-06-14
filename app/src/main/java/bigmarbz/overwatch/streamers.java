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

public class streamers extends AppCompatActivity {

    private ViewStub stubList;
    private ListView listView;
    private ListViewAdapter listViewAdapter;
    private List<Product> productList;
    private int currentViewMode = 0;

    static final int VIEW_MODE_LISTVIEW = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_streamers);

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
        productList.add(new Product(R.drawable.stylosa, "Stylosa", "  "));
        productList.add(new Product(R.drawable.loserfruit, "Loserfruit", " "));
        productList.add(new Product(R.drawable.fenn3r, "Fenn3r", "  "));
        productList.add(new Product(R.drawable.overwatchsymbol, "Seltzer", "  "));
        productList.add(new Product(R.drawable.moon2, "Moon Moon", "  "));
        productList.add(new Product(R.drawable.kephrii, "Kephrii", "  "));
        productList.add(new Product(R.drawable.mercyup, "Shayed", "  "));
        return productList;
    }

    AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //Do any thing when user click to item
            Toast.makeText(getApplicationContext(), productList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            switch (productList.get(position).getTitle()) {
                case "Stylosa":
                    Uri uri = Uri.parse("https://www.youtube.com/user/unitlosttube");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                    break;
                case "Loserfruit":
                    Uri uri2 = Uri.parse("https://www.youtube.com/user/TheLoserfruit");
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                    startActivity(intent2);
                    break;
                case "Fenn3r":
                    Uri uri3 = Uri.parse("https://www.youtube.com/user/fenn3r");
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                    startActivity(intent3);
                    break;
                case "Seltzer":
                    Uri uri4 = Uri.parse("https://www.twitch.tv/seltzer");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                    break;
                case "Moon Moon":
                    Uri uri5 = Uri.parse("https://www.twitch.tv/moonmoon_ow");
                    Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
                    startActivity(intent5);
                    break;
                case "Kephrii":
                    Uri uri6 = Uri.parse("https://www.youtube.com/user/Kephri1");
                    Intent intent6 = new Intent(Intent.ACTION_VIEW, uri6);
                    startActivity(intent6);
                    break;
                case "Shayed":
                    Uri uri7 = Uri.parse("https://www.twitch.tv/shayed_");
                    Intent intent7 = new Intent(Intent.ACTION_VIEW, uri7);
                    startActivity(intent7);
                    break;

            }

        }
    };
}
