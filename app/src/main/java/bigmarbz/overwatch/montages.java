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

public class montages extends AppCompatActivity {

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
        setContentView(R.layout.activity_montages);

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
        productList.add(new Product(R.drawable.overwatchsymbol, "Overwatch Montage", "  "));
        productList.add(new Product(R.drawable.funnyicon, "Funny Moments", "  "));
        productList.add(new Product(R.drawable.bronze, "Top Fails", " "));
        productList.add(new Product(R.drawable.lassiz, "Pro Plays", " "));
        productList.add(new Product(R.drawable.grandmaster, "Insane Plays", " "));
        productList.add(new Product(R.drawable.surefour, "Pro Montages", " "));


        return productList;
    }

    AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //Do any thing when user click to item
            Toast.makeText(getApplicationContext(), productList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            switch (productList.get(position).getTitle()) {
                case "Overwatch Montage":
                    Uri uri2 = Uri.parse("https://www.youtube.com/playlist?list=PLGHuqrC70JKyi2qxyr4L_GLpmD7h7Kb56");
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                    startActivity(intent2);
                    break;
                case "Funny Moments":
                    Uri uri3 = Uri.parse("https://www.youtube.com/playlist?list=PLGHuqrC70JKxtI3ojCAY3oBL4PC5SNTVz");
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                    startActivity(intent3);
                    break;
                case "Top Fails":
                    Uri uri4 = Uri.parse("https://www.youtube.com/playlist?list=PLGHuqrC70JKztnbNwgNhZPofZopEtYIhs");
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, uri4);
                    startActivity(intent4);
                    break;
                case "Pro Plays":
                    Uri uri5 = Uri.parse("https://www.youtube.com/playlist?list=PLGHuqrC70JKwMT7LJod_57J1QhpEhdVki");
                    Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
                    startActivity(intent5);
                    break;
                case "Insane Plays":
                    Uri uri6 = Uri.parse("https://www.youtube.com/watch?v=Nr2mhxkXJCM");
                    Intent intent6 = new Intent(Intent.ACTION_VIEW,uri6);
                    startActivity(intent6);
                    break;
                case "Pro Montages":
                    Uri uri7 = Uri.parse("https://www.youtube.com/playlist?list=PLsn-dTYLmGITlnqyNTcVnVzyotbCG7Td_");
                    Intent intent7 = new Intent(Intent.ACTION_VIEW,uri7);
                    startActivity(intent7);
                    break;
            }

        }
    };
}
