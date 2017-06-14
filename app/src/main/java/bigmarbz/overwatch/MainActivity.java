package bigmarbz.guardianangel;

import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static final int VIEW_MODE_LISTVIEW = 0;
    static final int VIEW_MODE_GRIDVIEW = 1;
    Intent intenthero;
    private ViewStub stubGrid;
    private ViewStub stubList;
    private ListView listView;
    private GridView gridView;
    private ListViewAdapter listViewAdapter;
    private GridViewAdapter gridViewAdapter;
    private List<Product> productList;
    AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //Do any thing when user click to item
            Toast.makeText(getApplicationContext(), productList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            switch (productList.get(position).getTitle()) {
                case "Heroes":
                    Intent intent1 = new Intent(MainActivity.this, heroes.class); //Done
                    MainActivity.this.startActivity(intent1);
                    break;
                case "Intro":
                    Intent intent2 = new Intent(MainActivity.this, intro.class);  //Done
                    MainActivity.this.startActivity(intent2);
                    break;
                case "Rank":
                    Intent intent3 = new Intent(MainActivity.this, competitive.class); //Done
                    MainActivity.this.startActivity(intent3);
                    break;
                case "Lore":
                    Intent intent4 = new Intent(MainActivity.this, lore.class); //Done
                    MainActivity.this.startActivity(intent4);
                    break;
                case "Github":
                    Uri uri2 = Uri.parse("https://github.com/BigMarbz/OverwatchInfo");
                    Intent intent23 = new Intent(Intent.ACTION_VIEW, uri2);
                    startActivity(intent23);
                    break;
                case "Maps":
                    Intent intent6 = new Intent(MainActivity.this, maps.class);
                    MainActivity.this.startActivity(intent6);
                    break;
                case "Tiers":
                    Intent intent7 = new Intent(MainActivity.this, tiers.class);  //Done
                    MainActivity.this.startActivity(intent7);
                    break;
                case "Youtube":
                    Intent youtube = new Intent(MainActivity.this, youtube.class);
                    MainActivity.this.startActivity(youtube);
                    break;
                case "Search":
                    Intent search = new Intent(MainActivity.this,search.class); //Done
                    MainActivity.this.startActivity(search);
                    break;
            }
        }
    };
    private int currentViewMode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stubList = (ViewStub) findViewById(R.id.stub_list);
        stubGrid = (ViewStub) findViewById(R.id.stub_grid);

        //Inflate ViewStub before get view

        stubList.inflate();
        stubGrid.inflate();

        listView = (ListView) findViewById(R.id.mylistview);
        gridView = (GridView) findViewById(R.id.mygridview);

        //get list of product
        getProductList();

        //Get current view mode in share reference
        SharedPreferences sharedPreferences = getSharedPreferences("ViewMode", MODE_PRIVATE);
        currentViewMode = sharedPreferences.getInt("currentViewMode", VIEW_MODE_LISTVIEW);//Default is view gridview
        //Register item lick
        listView.setOnItemClickListener(onItemClick);
        gridView.setOnItemClickListener(onItemClick);

        switchView();

    }

    private void switchView() {

        if (VIEW_MODE_LISTVIEW == currentViewMode) {
            //Display listview
            stubList.setVisibility(View.VISIBLE);
            //Hide gridview
            stubGrid.setVisibility(View.GONE);
        } else {
            //Hide listview
            stubList.setVisibility(View.GONE);
            //Display gridview
            stubGrid.setVisibility(View.VISIBLE);
        }
        setAdapters();
    }

    private void setAdapters() {
        if (VIEW_MODE_LISTVIEW == currentViewMode) {
            listViewAdapter = new ListViewAdapter(this, R.layout.list_item, productList);
            listView.setAdapter(listViewAdapter);
        } else {
            gridViewAdapter = new GridViewAdapter(this, R.layout.grid_item, productList);
            gridView.setAdapter(gridViewAdapter);
        }
    }

    public List<Product> getProductList() {
        //pseudo code to get product, replace your code to get real product here
        productList = new ArrayList<>();
        productList.add(new Product(R.drawable.launcherlogo, "Intro", "Description")); //done
        productList.add(new Product(R.drawable.tracer, "Heroes", "Details")); //done
        productList.add(new Product(R.drawable.scripticon, "Lore", "Hero Story")); //done
        productList.add(new Product(R.drawable.map, "Maps", "Map Layout"));
        productList.add(new Product(R.drawable.tiericon, "Tiers", "Hero Rank")); //done
        productList.add(new Product(R.drawable.youtubeicon, "Youtube", "Channels"));
        productList.add(new Product(R.drawable.searchicon2, "Search", "Player Info"));
        productList.add(new Product(R.drawable.grandmaster, "Rank", "Elo Info"));  //done
        productList.add(new Product(R.drawable.githubicon, "Github", "Source Code")); //done

        return productList;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_menu_1:
                if (VIEW_MODE_LISTVIEW == currentViewMode) {
                    currentViewMode = VIEW_MODE_GRIDVIEW;
                } else {
                    currentViewMode = VIEW_MODE_LISTVIEW;
                }
                //Switch view
                switchView();
                //Save view mode in share reference
                SharedPreferences sharedPreferences = getSharedPreferences("ViewMode", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("currentViewMode", currentViewMode);
                editor.commit();

                break;
        }
        return true;
    }
}
