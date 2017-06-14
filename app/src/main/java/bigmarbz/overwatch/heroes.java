package bigmarbz.overwatch;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
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

        listView.setOnItemClickListener(onItemClick);

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
                    Intent ana = new Intent(heroes.this,ana.class);
                    heroes.this.startActivity(ana);
                    MediaPlayer mediaPlayerana = MediaPlayer.create(heroes.this, R.raw.anasound1);
                    mediaPlayerana.start();
                    break;
                case "Bastion":
                    Intent bastion = new Intent(heroes.this,bastion.class);
                    heroes.this.startActivity(bastion);
                    MediaPlayer mediaPlayerbas = MediaPlayer.create(heroes.this, R.raw.bastionsound);
                    mediaPlayerbas.start();
                    break;
                case "D.Va":
                    Intent dva = new Intent(heroes.this,dva.class);
                    heroes.this.startActivity(dva);
                    MediaPlayer mediaPlayerdva = MediaPlayer.create(heroes.this, R.raw.dvasound1);
                    mediaPlayerdva.start();
                    break;
                case "Genji":
                    Intent gen = new Intent(heroes.this,genji.class);
                    heroes.this.startActivity(gen);
                    MediaPlayer mediaPlayergen = MediaPlayer.create(heroes.this, R.raw.genjisound1);
                    mediaPlayergen.start();
                    break;
                case "Hanzo":
                    Intent han = new Intent(heroes.this,hanzo.class);
                    heroes.this.startActivity(han);
                    MediaPlayer mediaPlayerhan = MediaPlayer.create(heroes.this, R.raw.hanzosound1);
                    mediaPlayerhan.start();
                    break;
                case "Junkrat":
                    Intent han1 = new Intent(heroes.this,junkrat.class);
                    heroes.this.startActivity(han1);
                    MediaPlayer mediaPlayerj = MediaPlayer.create(heroes.this, R.raw.junkratsound1);
                    mediaPlayerj.start();
                    break;
                case "Lucio":
                    Intent l = new Intent(heroes.this,lucio.class);
                    heroes.this.startActivity(l);
                    MediaPlayer mediaPlayerl = MediaPlayer.create(heroes.this, R.raw.luciosound1);
                    mediaPlayerl.start();
                    break;
                case "McCree":
                    Intent mc = new Intent(heroes.this,mccree.class);
                    heroes.this.startActivity(mc);
                    MediaPlayer mediaPlayermc = MediaPlayer.create(heroes.this, R.raw.mccreesound1);
                    mediaPlayermc.start();
                    break;
                case "Mei":
                    Intent mei = new Intent(heroes.this,mei.class);
                    heroes.this.startActivity(mei);
                    MediaPlayer asdf = MediaPlayer.create(heroes.this, R.raw.meisound1);
                    asdf.start();
                    break;
                case "Mercy":
                    Intent mer = new Intent(heroes.this,mercy.class);
                    heroes.this.startActivity(mer);
                    MediaPlayer as = MediaPlayer.create(heroes.this, R.raw.mercysound1);
                    as.start();
                    break;
                case "Pharah":
                    Intent ewf = new Intent(heroes.this,pharah.class);
                    heroes.this.startActivity(ewf);
                    MediaPlayer ase = MediaPlayer.create(heroes.this, R.raw.pharahsound1);
                    ase.start();
                    break;
                case "Reaper":
                    Intent rea = new Intent(heroes.this,reaper.class);
                    heroes.this.startActivity(rea);
                    MediaPlayer rrea = MediaPlayer.create(heroes.this, R.raw.reapersound1);
                    rrea.start();
                    break;
                case "Reinhardt":
                    Intent re = new Intent(heroes.this,reinhardt.class);
                    heroes.this.startActivity(re);
                    MediaPlayer ree = MediaPlayer.create(heroes.this, R.raw.reinhardtsound1);
                    ree.start();
                    break;
                case "Roadhog":
                    Intent hgg = new Intent(heroes.this,roadhog.class);
                    heroes.this.startActivity(hgg);
                    MediaPlayer hg = MediaPlayer.create(heroes.this, R.raw.roadhogsound2);
                    hg.start();
                    break;
                case "Soldier76":
                    Intent e1 = new Intent(heroes.this,soldier.class);
                    heroes.this.startActivity(e1);
                    MediaPlayer ase3 = MediaPlayer.create(heroes.this, R.raw.soldiersound1);
                    ase3.start();
                    break;
                case "Sombra":
                    Intent somb = new Intent(heroes.this,sombra.class);
                    heroes.this.startActivity(somb);
                    MediaPlayer ase4 = MediaPlayer.create(heroes.this, R.raw.pharahsound1);
                    ase4.start();
                    break;
                case "Symmetra":
                    Intent somb3 = new Intent(heroes.this,symmetra.class);
                    heroes.this.startActivity(somb3);
                    MediaPlayer ase45 = MediaPlayer.create(heroes.this, R.raw.symsound1);
                    ase45.start();
                    break;
                case "Torbjorn":
                    Intent hack = new Intent(heroes.this,torbjorn.class);
                    heroes.this.startActivity(hack);
                    MediaPlayer torbgb = MediaPlayer.create(heroes.this, R.raw.torbjornsound1);
                    torbgb.start();
                    break;
                case "Tracer":
                    Intent adff4565 = new Intent(heroes.this,tracer.class);
                    heroes.this.startActivity(adff4565);
                    MediaPlayer zen34544 = MediaPlayer.create(heroes.this, R.raw.tracersound1);
                    zen34544.start();
                    break;
                case "Widowmaker":
                    Intent adff456 = new Intent(heroes.this,widowmaker.class);
                    heroes.this.startActivity(adff456);
                    MediaPlayer zen345 = MediaPlayer.create(heroes.this, R.raw.widowsound1);
                    zen345.start();
                    break;
                case "Winston":
                    Intent adf33f = new Intent(heroes.this,winston.class);
                    heroes.this.startActivity(adf33f);
                    MediaPlayer zen = MediaPlayer.create(heroes.this, R.raw.winstonsound1);
                    zen.start();
                    break;
                case "Zarya":
                    Intent zar = new Intent(heroes.this,zarya.class);
                    heroes.this.startActivity(zar);
                    MediaPlayer zarr = MediaPlayer.create(heroes.this, R.raw.zaryasound1);
                    zarr.start();
                    break;
                case "Zenyatta":
                    Intent adff3 = new Intent(heroes.this,zenyatta.class);
                    heroes.this.startActivity(adff3);
                    MediaPlayer zeny = MediaPlayer.create(heroes.this, R.raw.zenyattasound1);
                    zeny.start();
                    break;
            }
        }
    };


}
