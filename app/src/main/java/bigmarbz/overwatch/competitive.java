package bigmarbz.overwatch;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.TextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class competitive extends AppCompatActivity {


    private ViewStub stubList;
    private ListView listView;

    private ListViewAdapter listViewAdapter;

    private List<Product> productList;
    static private int currentViewMode = 0;

    static final int VIEW_MODE_LISTVIEW = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitive);

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
        productList.add(new Product(R.drawable.top500, "Top 500", "     "));
        productList.add(new Product(R.drawable.grandmaster, "GrandMaster", "4000~5000"));
        productList.add(new Product(R.drawable.master, "Master", "3500~3999"));
        productList.add(new Product(R.drawable.diamond, "Diamond", "3000~3499"));
        productList.add(new Product(R.drawable.platinum, "Platinum", "2500~2999"));
        productList.add(new Product(R.drawable.gold, "Gold", "2000~2499"));
        productList.add(new Product(R.drawable.silver, "Silver", "1500~1999"));
        productList.add(new Product(R.drawable.bronze, "Bronze", "0000~1499"));

        return productList;
    }



}


