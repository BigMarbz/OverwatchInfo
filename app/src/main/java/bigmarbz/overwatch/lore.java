package bigmarbz.overwatch;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.media.MediaPlayer;
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

public class lore extends AppCompatActivity {

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
        setContentView(R.layout.activity_lore);

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
            switch (productList.get(position).getTitle()) {
                case "Ana":
                    Intent intentana = new Intent(lore.this,analore.class);
                    lore.this.startActivity(intentana);
                    MediaPlayer mediaPlayeran = MediaPlayer.create(lore.this, R.raw.anasound2);
                    mediaPlayeran.start();
                    break;
                case "Bastion":
                    Intent intentbastion = new Intent(lore.this,bastionlore.class);
                    lore.this.startActivity(intentbastion);
                    MediaPlayer mediaPlayer = MediaPlayer.create(lore.this, R.raw.bastionsound);
                    mediaPlayer.start();
                    break;
                case "D.Va":
                    Intent intentdva = new Intent(lore.this,dvalore.class);
                    lore.this.startActivity(intentdva);
                    MediaPlayer mediaPlayerdva = MediaPlayer.create(lore.this, R.raw.dvasound2);
                    mediaPlayerdva.start();
                    break;
                case "Genji":
                    Intent intentgenji = new Intent(lore.this,genjilore.class);
                    lore.this.startActivity(intentgenji);
                    MediaPlayer mediaPlayergenji = MediaPlayer.create(lore.this, R.raw.genjisound2);
                    mediaPlayergenji.start();
                    break;
                case "Hanzo":
                    Intent intenthanzo = new Intent(lore.this,hanzolore.class);
                    lore.this.startActivity(intenthanzo);
                    MediaPlayer mediaPlayerhanzo = MediaPlayer.create(lore.this, R.raw.hanzosound2);
                    mediaPlayerhanzo.start();
                    break;
                case "Junkrat":
                    Intent intentjunk = new Intent(lore.this,junkratlore.class);
                    lore.this.startActivity(intentjunk);
                    MediaPlayer mediaPlayerjunk = MediaPlayer.create(lore.this, R.raw.junkratsound2);
                    mediaPlayerjunk.start();
                    break;
                case "Lucio":
                    Intent intentlucio = new Intent(lore.this,luciolore.class);
                    lore.this.startActivity(intentlucio);
                    MediaPlayer mediaPlayerluc = MediaPlayer.create(lore.this, R.raw.luciosound2);
                    mediaPlayerluc.start();
                    break;
                case "McCree":
                    Intent intentmccree = new Intent(lore.this,mccreelore.class);
                    lore.this.startActivity(intentmccree);
                    MediaPlayer mediaPlayermc = MediaPlayer.create(lore.this, R.raw.mccreesound2);
                    mediaPlayermc.start();
                    break;
                case "Mei":
                    Intent intentmei = new Intent(lore.this,meilore.class);
                    lore.this.startActivity(intentmei);
                    MediaPlayer mediaPlayermei = MediaPlayer.create(lore.this, R.raw.meisound2);
                    mediaPlayermei.start();
                    break;
                case "Mercy":
                    Intent intentmercy = new Intent(lore.this,mercylore.class);
                    lore.this.startActivity(intentmercy);
                    MediaPlayer mediaPlayermer = MediaPlayer.create(lore.this, R.raw.mercysound2);
                    mediaPlayermer.start();
                    break;
                case "Pharah":
                    Intent intentpharah = new Intent(lore.this,pharahlore.class);
                    lore.this.startActivity(intentpharah);
                    MediaPlayer mediaPlayerpha = MediaPlayer.create(lore.this, R.raw.pharahsound2);
                    mediaPlayerpha.start();
                    break;
                case "Reaper":
                    Intent reaperloreintent = new Intent(lore.this,reaperlore.class);
                    lore.this.startActivity(reaperloreintent);
                    MediaPlayer mediaPlayerreap = MediaPlayer.create(lore.this, R.raw.reapersound2);
                    mediaPlayerreap.start();
                    break;
                case "Reinhardt":
                    Intent intentrein = new Intent(lore.this,reinhardtlore.class);
                    lore.this.startActivity(intentrein);
                    MediaPlayer mediaPlayerrein = MediaPlayer.create(lore.this, R.raw.reinhardtsound2);
                    mediaPlayerrein.start();
                    break;
                case "Roadhog":
                    Intent intentroad = new Intent(lore.this,roadhoglore.class);
                    lore.this.startActivity(intentroad);
                    MediaPlayer mediaPlayerr = MediaPlayer.create(lore.this, R.raw.roadhogsound2);
                    mediaPlayerr.start();
                    break;
                case "Soldier76":
                    Intent intentsoldier = new Intent(lore.this,soldierlore.class);
                    lore.this.startActivity(intentsoldier);
                    MediaPlayer mediaPlayersold = MediaPlayer.create(lore.this, R.raw.soldiersound2);
                    mediaPlayersold.start();
                    break;
                case "Sombra":
                    Intent intentsomb = new Intent(lore.this,sombralore.class);
                    lore.this.startActivity(intentsomb);
                    MediaPlayer mediaPlayersomb = MediaPlayer.create(lore.this, R.raw.sombrasound);
                    mediaPlayersomb.start();
                    break;
                case "Symmetra":
                    Intent intentsym = new Intent(lore.this,symmetralore.class);
                    lore.this.startActivity(intentsym);
                    MediaPlayer mediaPlayersy = MediaPlayer.create(lore.this, R.raw.symsound2);
                    mediaPlayersy.start();
                    break;
                case "Torbjorn":
                    Intent intenttorb = new Intent(lore.this,torbjornlore.class);
                    lore.this.startActivity(intenttorb);
                    MediaPlayer mediaPlayertr = MediaPlayer.create(lore.this, R.raw.torbjornsound2);
                    mediaPlayertr.start();
                    break;
                case "Tracer":
                    Intent intenttracer = new Intent(lore.this,tracerlore.class);
                    lore.this.startActivity(intenttracer);
                    MediaPlayer mediaPlayertc = MediaPlayer.create(lore.this, R.raw.tracersound2);
                    mediaPlayertc.start();
                    break;
                case "Widowmaker":
                    Intent intentwidow = new Intent(lore.this,widowmakerlore.class);
                    lore.this.startActivity(intentwidow);
                    MediaPlayer mediaPlayerwid = MediaPlayer.create(lore.this, R.raw.widowsound2);
                    mediaPlayerwid.start();
                    break;
                case "Winston":
                    Intent intentwinston = new Intent(lore.this,winstonlore.class);
                    lore.this.startActivity(intentwinston);
                    MediaPlayer mediaPlayerwin = MediaPlayer.create(lore.this, R.raw.winstonsound2);
                    mediaPlayerwin.start();
                    break;
                case "Zarya":
                    Intent intentzarya = new Intent(lore.this,zaryalore.class);
                    lore.this.startActivity(intentzarya);
                    MediaPlayer mediaPlayerzar = MediaPlayer.create(lore.this, R.raw.zaryasound2);
                    mediaPlayerzar.start();
                    break;
                case "Zenyatta":
                    Intent intentzenyatta = new Intent(lore.this,zenyattalore.class);
                    lore.this.startActivity(intentzenyatta);
                    MediaPlayer mediaPlayerz = MediaPlayer.create(lore.this, R.raw.zenyattasound2);
                    mediaPlayerz.start();
                    break;
            }

        }
    };
}
