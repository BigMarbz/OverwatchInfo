package bigmarbz.overwatch;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

import bigmarbz.overwatch.ListViewAdapter;
import bigmarbz.overwatch.Product;

public class heroes extends AppCompatActivity {


    private ViewStub stubList;
    private ListView listView;
    private ListViewAdapter listViewAdapter;
    private List<Product> productList;
    private int currentViewMode = 0;

    static final int VIEW_MODE_LISTVIEW = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);

        stubList = (ViewStub) findViewById(R.id.stub_list);


        //Inflate ViewStub

        stubList.inflate();

        listView = (ListView) findViewById(R.id.mylistview);
        //get list of product
        getProductList();

        //Get current view mode in share reference
        SharedPreferences sharedPreferences = getSharedPreferences("ViewMode", MODE_PRIVATE);
        currentViewMode = sharedPreferences.getInt("currentViewMode", VIEW_MODE_LISTVIEW);//Default is view listview
        //Register item lick

        switchView();

    }

    private void switchView() {

        //Display listview activity
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
        productList.add(new Product(R.drawable.ana, "Ana", "Support"));
        productList.add(new Product(R.drawable.bastion, "Bastion", "Defense"));
        productList.add(new Product(R.drawable.dva, "D.Va", "Tank"));
        productList.add(new Product(R.drawable.genji, "Genji", "Offense"));
        productList.add(new Product(R.drawable.hanzo, "Hanzo", "Defense"));
        productList.add(new Product(R.drawable.junkrat, "Junkrat", "Defense"));
        productList.add(new Product(R.drawable.lucio, "Lucio", "Support"));
        productList.add(new Product(R.drawable.mccree, "McCree", "Offense"));
        productList.add(new Product(R.drawable.mei, "Mei", "Defense"));
        productList.add(new Product(R.drawable.mercy, "Mercy", "Support"));
        productList.add(new Product(R.drawable.pharah, "Pharah", "Offense"));
        productList.add(new Product(R.drawable.reaper, "Reaper", "Offense"));
        productList.add(new Product(R.drawable.reinhardt, "Reinhardt", "Tank"));
        productList.add(new Product(R.drawable.roadhog, "Roadhog", "Tank"));
        productList.add(new Product(R.drawable.soldier76, "Soldier76", "Offense"));
        productList.add(new Product(R.drawable.sombra, "Sombra", "Offense"));
        productList.add(new Product(R.drawable.symmetra, "Symmetra", "Support"));
        productList.add(new Product(R.drawable.torbjorn, "Torbjorn", "Defense"));
        productList.add(new Product(R.drawable.tracer, "Tracer", "Offense"));
        productList.add(new Product(R.drawable.widowmaker, "Widowmaker", "Defense"));
        productList.add(new Product(R.drawable.winston, "Winston", "Tank"));
        productList.add(new Product(R.drawable.zarya, "Zarya", "Tank"));
        productList.add(new Product(R.drawable.zenyatta, "Zenyatta", "Support"));

        return productList;
    }

    AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //Do any thing when user click to item
            Toast.makeText(getApplicationContext(), productList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            switch(productList.get(position).getTitle()){
                case "Ana":
                    break;
                case "Bastion":
                    break;
                case "D.Va":
                    break;
                case "Genji":
                    break;
                case "Hanzo":
                    break;
                case "Junkrat":
                    break;
                case "Lucio":
                    break;
                case "McCree":
                    break;
                case "Mei":
                    break;
                case "Mercy":
                    break;
                case "Pharah":
                    break;
                case "Reaper":
                    break;
                case "Reinhardt":
                    break;
                case "RoadHog":
                    break;
                case "Soldier76":
                    break;
                case "Sombra":
                    break;
                case "Symmetra":
                    break;
                case "Torbjorn":
                    break;
                case "Tracer":
                    break;
                case "Widowmaker":
                    break;
                case "Winston":
                    break;
                case "Zarya":
                    break;
                case "Zenyatta":
                    break;
            }
        }
    };


}
