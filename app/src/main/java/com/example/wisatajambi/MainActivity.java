package com.example.wisatajambi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wisatajambi.Adapter.CustomAdapter;
import com.example.wisatajambi.Adapter.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar mTopToolbar;

    RecyclerView mRecyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTopToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mTopToolbar);
        getSupportActionBar().setTitle("Planets");

        main_list = new ArrayList<>();
        mRecyclerView = findViewById(R.id.recyler);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Model(R.drawable.wisata_1, "Gentala Arasy", "Gentala Arasy adalah museum " +
                "budaya yang " +
                "populer sebagai simbol Islam di Kota Jambi. Wisata Museum di Jambi ini menjadi rumah bagi ratusan " +
                "koleksi benda bersejarah yang menjadi saksi bisu perjalanan Islam di Jambi. Koleksi-koleksi tersebut " +
                "diperoleh dari ulama-ulama yang menghibahkannya, dibeli, ataupun dipinjam dari beberapa lembaga.\n" +
                "\n" +
                "Toppers bisa berjalan-jalan sambil melihat pemandangan sore atau malam hari di sebuah jembatan yang " +
                "dibangun dekat tempat wisata di Jambi ini, Jembatan Gentala Arasy. Jembatan yang dibangun dengan anggaran " +
                "delapan puluh delapan milyar rupiah ini memiliki pemandangan yang terkenal luar biasa cantik dihiasi " +
                "lampu-lampu pada malam hari."));
        main_list.add(new Model(R.drawable.wisata_2, "Tugu Juang", "Indonesia merdeka secara de " +
                "facto pada tanggal 17 Agustus 1945. Namun kala itu, Belanda masih mencoba untuk menguasai Indonesia " +
                "hingga timbullah Agresi Militer Belanda II yang terkenal dalam sejarah pada tahun 1946.\n" +
                "\n" +
                "Tugu Juang adalah monumen yang memperingati perjuangan rakyat Jambi pada masa agresi militer " +
                "tersebut.\n" +
                "\n" +
                "Pada bagian atas monumen tempat wisata di Jambi ini terdapat patung laki-laki menodongkan bambu " +
                "runcing yang menggambarkan perjuangan rakyat kala itu."));
        main_list.add(new Model(R.drawable.wisata_3, "Tugu Pers", "Pers merupakan elemen " +
                "penting dalam bernegara. Tanpa kebebasan pers, negara akan cenderung otoriter dan sewenang-wenang " +
                "dalam mengelola negara.\n" +
                "\n" +
                "Selain itu, pers yang bebas dan bertanggungjawab juga membantu mencerdaskan publik akan isu-isu " +
                "terkini serta hal-hal penting yang luput dari perhatian.\n" +
                "\n" +
                "Maka dari itu untuk memperingati kebebasan pers di Kota Jambi, dibangunlah Tugu Pers yang terkenal ini pada " +
                "Februari 2012 silam. Toppers dapat berfoto-foto dengan latar belakang destinasi wisata Jambi ini.\n" +
                "\n"));
        main_list.add(new Model(R.drawable.wisata_4, "Jambi Paradise", "Jambi Paradise adalah " +
                "salah satu objek wisata Jambi berupa taman air yang dapat kamu kunjungi di Kota Jambi. Tidak hanya " +
                "menyediakan tempat bermain air, kamu juga dapat berjalan-jalan santai dengan view yang asri.\n" +
                "\n" +
                "Jika kamu memilih bersantai dengan keluarga, Jambi Paradise bisa jadi salah satu opsi objek wisata " +
                "Jambi terkenal dan terfavorit untukmu."));
        main_list.add(new Model(R.drawable.wisata_5, "Pasar Keramik Sitimang", "Keramik adalah " +
                "kerajinan yang dibuat dari tanah liat dengan melalui proses pembakaran setelah dibentuk oleh " +
                "pengrajin. Biasanya keramik dibuat untuk dijadikan vas, kendi, ataupun hiasan lainnya."));
        main_list.add(new Model(R.drawable.wisata_6, "Air Terjun Sigerincing", "Jika Toppers rindu " +
                "akan nuansa alami dan gemuruh air terjun yang menenangkan, Air Terjun Sigerincing jawabannya. Objek " +
                "wisata Jambi terkenal yang termasuk wisata alam ini memberikan suasana air terjun yang alami. Toppers " +
                "bisa berenang atau " +
                "sekedar bermain air dengan teman-teman atau keluargamu di tempat wisata ini."));
        main_list.add(new Model(R.drawable.wisata_7, "Museum Siginjei", "Museum ini juga jadi " +
                "salah satu daftar objek wisata Jambi yang populer apalagi saat liburan. " +
                "Museum ini mulai dibangun pada tahun 1981 oleh Masjchun Syofwan, SH yang kala itu menjabat sebagai " +
                "Gubernur Jambi."));
        main_list.add(new Model(R.drawable.wisata_8, "Air Terjun Arai Indah", "Tempat wisata air terjun di Jambi satu ini terkenal dengan pemandangannya yang sangat asri sebagai wisata alam.\n" +
                "\n" +
                "Kamu bisa berlibur ke Air Terjun Aral Indah di musim hujan karena debit airnya akan lebih banyak dari biasanya. " +
                "Namun usahakan untuk datang pada " +
                "cuaca yang cerah agar kamu dapat menikmati pemandangan sekitar air terjun dengan lebih jelas."));
        main_list.add(new Model(R.drawable.wisata_9, "Hiking di Gunung Kerinci", "Gunung " +
                "Kerinci adalah gunung berapi terkenal dengan puncak tertinggi di Indonesia. Gunung ini sekaligus " +
                "menjadi gunung tertinggi kedua di Indonesia setelah Jaya Wijaya di Papua.\n" +
                "\n" +
                "Objek wisata di Jambi ini menawarkan suasana sejuk dan pemandangan pagi hari yang memukau."));
        main_list.add(new Model(R.drawable.wisata_10, "Candi Muaro Jambi", "Kalau tadi kita " +
                "berkenalan dengan candi anaknya, sekarang mari kita berkenalan dengan candi Induknya.\n" +
                "\n" +
                "Candi Muaro Jambi adalah candi yang utama di tempat wisata komplek percandian terkenal Muaro Jambi. " +
                "Jadi jika mengunjungi candi ini, pasti kamu akan dengan mudah menemukan Candi Tinggi."));
        main_list.add(new Model(R.drawable.wisata_11, "Danau Biru Muara Tembesi", "Danau Biru " +
                "Muara Tembesi adalah tempat wisata danau cantik yang awalnya terbentuk akibat aktivitas penggalian " +
                "tanah untuk produksi batu bata.\n" +
                "\n" +
                "Tidak seperti kebanyakan danau, Danau Biru Muara Tembesi ini terkenal memiliki warna air biru " +
                "kehijauan yang sangat indah.\n" +
                "\n"));


        adapter = new CustomAdapter(main_list, getApplicationContext());
        mRecyclerView.setAdapter(adapter);

        TextView toolbarText = (TextView) findViewById(R.id.toolbar_text);
        if (toolbarText != null && toolbarText != null) {

            toolbarText.setText(getTitle());
            setSupportActionBar(mTopToolbar);

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_favorite) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}