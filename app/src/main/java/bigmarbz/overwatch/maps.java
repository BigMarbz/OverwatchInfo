package bigmarbz.overwatch;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class maps extends AppCompatActivity {


    private ViewStub stubList;
    private ListView listView;

    private ListViewAdapter listViewAdapter;

    private List<Product> productList;
    static private int currentViewMode = 0;

    static final int VIEW_MODE_LISTVIEW = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

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
        productList.add(new Product(R.drawable.mexico, "Dorado", "Payload"));
        productList.add(new Product(R.drawable.germany, "Eichenwalde", "Capture Point/Payload"));
        productList.add(new Product(R.drawable.japan, "Hanamura", "Capture Point/Capture Point"));
        productList.add(new Product(R.drawable.america, "Hollywood", "Capture Point/Payload"));
        productList.add(new Product(R.drawable.greece, "Ilios", "King of the Hill"));
        productList.add(new Product(R.drawable.china, "Lijiang Tower", "King of the Hill"));
        productList.add(new Product(R.drawable.england, "King's Row", "Capture Point/Payload"));
        productList.add(new Product(R.drawable.nepal, "Nepal", "King of the Hill"));
        productList.add(new Product(R.drawable.numbaniflag, "Numbani", "Capture Point/Payload"));
        productList.add(new Product(R.drawable.oasis, "Oasis", "King of the Hill"));
        productList.add(new Product(R.drawable.america, "Route:66", "Payload"));
        productList.add(new Product(R.drawable.egypt, "Temple of Anubis", "Capture Point/Capture Point"));
        productList.add(new Product(R.drawable.russia, "Volskaya Industries", "Capture Point/Capture Point"));
        productList.add(new Product(R.drawable.overwatchsymbol, "WatchPoint: Gibraltar", "Payload"));

        return productList;
    }
    AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //Do any thing when user click to item
            Toast.makeText(getApplicationContext(), productList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            switch(productList.get(position).getTitle()){
                case "Dorado":

                    break;
            }
        }
    };


}



