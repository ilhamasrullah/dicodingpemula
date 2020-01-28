package com.example.customlistview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String mTitle[] = {
            "Jeff Bezos",
            "Bill gates",
            "amanico ortega",
            "warrent buffet",
            "mark zuckeberg",
            "carlos",
            "larry ellison",
            "michael",
            "bernand",
            "koch"};
    String mDescription[] = {
            "Jeff Bezos merupakan orang di balik kesuksesan Amazon, e-commerce terbesar di dunia saat ini. Jeff Bezos mendirikan raksasa ritel Amazon.com pada tahun 1994 setelah meninggalkan pekerjaannya di New York.",
            "Bill Gates merupakan sosok di balik kesuksesan Microsoft, yang sistem operasinya, Windows, terpasang di mayoritas komputer di dunia.",
            "Amancio Ortega, milyarder asal Spanyol, lebih dikenal sebagai sosok pendiri grup perusahaan Inditex yang bergerak di bidang fashion, induk perusahaan yang menaungi Zara dan beberapa perusahaan lainnya.",
            "Nama Warrent Buffet mungkin sudah terngiang dalam ingatan orang sebagai sosok investor jenius. CEO Berkshire Hathaway ini merupakan figur ikonik yang membeli saham pertamanya di usia 11 tahun. Saat ini, Warren Buffet memiliki 60 lebih perusahaan.",
            "Media sosial yang ia ciptakan di lingkungan kampusnya itu kini memiliki lebih dari 1 miliar pengguna di seluruh dunia. Kantor Facebook pun tersebar ke seluruh dunia. Hingga saat ini, Facebook sebagai sebuah perusahaan memiliki kekayaan sebesar $400 miliar.",
            "Taipan bisnis asal Meksiko Carlos Slim Helu adalah sosok terkaya di negara asalnya dan saat ini membawahi 200 perusahaan di bidang ritel, perbankan hingga telekomunikasi. America Movil, salah satu perusahaan miliknya, merupakan perusahaan mobile seluler terbesar di Amerika Latin.",
            "Larry Ellison, pendiri, pemimpin sekaligus mantan CEO Oracle yang merupakan perusahaan software terkemuka di dunia. Ia mendirikan perusahaan tersebut di tahun 1977, padahal sebenarnya belum pernah mengenyam pendidikan formal mengenai ilmu komputer di sekolah.",
            "Selain sebagai seorang pengusaha, ia juga merupakan seorang dermawan dan politikus. Pada tahun 1981, ia mendirikan Bloomberg L.P., sebuah perusahaan sistem teknologi informasi dan media yang nilainya saat ini sudah tumbuh menjadi $45 miliar dengan lebih dari 100 kantor perwakilan di seluruh dunia. Sebelumnya, ia merupakan seorang mitra di Salomon Brothers, bank investasi Wall Street.",
            "Bulgari dan Louis Vuitton hanyalah dua di antara brand terkemuka di bawah naungan Bernard Arnault. Milyarder berkebangsaan Prancis tersebut merupakan pemimpin dan CEP LVMH, perusahaan barang-barang mewah terbesar di dunia.",
            "Ia dan saudaranya masing-masing memiliki 42% kepemilikan Koch Industries yang memproduksi brand seperti Dixie Cup, Quilted Northern dan Stainmaster. Kedua bersaudara tersebut mewarisi Wichita, perusahaan yang berbasis di Kansas dari ayah mereka."
    };
    int images[] = {

            R.drawable.jeff,
            R.drawable.bill,
            R.drawable.zara,
            R.drawable.warren,
            R.drawable.mark,
            R.drawable.carlos,
            R.drawable.larry,
            R.drawable.michael,
            R.drawable.bernard,
            R.drawable.kosch
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", mTitle[0]);
                    intent.putExtra("description", mDescription[0]);
                    intent.putExtra("position", "" + 0);
                    startActivity(intent);


                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", mTitle[1]);
                    intent.putExtra("description", mDescription[1]);
                    intent.putExtra("position", "" + 1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", mTitle[2]);
                    intent.putExtra("description", mDescription[2]);
                    intent.putExtra("position", "" + 2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", mTitle[3]);
                    intent.putExtra("description", mDescription[3]);
                    intent.putExtra("position", "" + 3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("description", mDescription[4]);
                    intent.putExtra("position", "" + 4);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[5]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", mTitle[5]);
                    intent.putExtra("description", mDescription[5]);
                    intent.putExtra("position", "" + 5);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", mTitle[6]);
                    intent.putExtra("description", mDescription[6]);
                    intent.putExtra("position", "" + 6);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[7]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", mTitle[7]);
                    intent.putExtra("description", mDescription[7]);
                    intent.putExtra("position", "" + 7);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[8]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", mTitle[8]);
                    intent.putExtra("description", mDescription[8]);
                    intent.putExtra("position", "" + 8);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[9]);
                    intent.putExtras(bundle);
                    intent.putExtra("title", mTitle[9]);
                    intent.putExtra("description", mDescription[9]);
                    intent.putExtra("position", "" + 9);
                    startActivity(intent);
                }
            }
        });
    }


    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImages[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImages = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.row, parent, false);

            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.about){
            startActivity(new Intent(this, aboutactivy.class));

        }
        return true;

    }
}
