package com.example.movieinformation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener{

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.jodi, "Rabne Bana Di Jodi", "Judul : Rabne Bana Di jodi",
                "Deskripsi : Tani seorang wanita yang terpaksa menikahi Suri karena ayahnya tidak merasakan adanya cinta dari Suri. Dan Suri kemudian harus menyamar menjadi rekan tarinya untuk mendapatkan cinta Tani, " +
                        "akan kah Tani menerima Suri sebagai suaminya setelah mengetahui kebohongan besar dari Suri? ",
                    "Link : https://r.search.yahoo.com/_ylt=AwrgMOv_D7xnbtIPXMdXNyoA;_ylu=Y29sbwNncTEEcG9zAzUEdnRpZAMEc2VjA3Ny/RV=2/RE=1741587711/RO=10/RU=https%3a%2f%2fwww.bilibili.tv%2fen%2fvideo%2f4794128933589504/RK=2/RS=WI6RWTRZiX0bv.joWsxd28quEXc-"));
        itemList.add(new Item(R.drawable.jab, "Jab Tak Hai Jaan","Judul : Jab Tak Hai Jaan",
                "Deskripsi : Berkisah tentang seorang penjinak bom bernama Samar Anand (Khan) yang buku catatannya ditemukan oleh Akira Rai (Sharma) seorang pembuat film. Ternyata Samar memiliki masalalu dengan kekasihnya Meera. " +
                        "Akankah mereka bertemu kembali? atau Samar akan tetap menjadi penjinak bom?",
                    "Link : https://r.search.yahoo.com/_ylt=Awr98vMrFbxn3uwQwA9XNyoA;_ylu=Y29sbwNncTEEcG9zAzEEdnRpZAMEc2VjA3Ny/RV=2/RE=1741589036/RO=10/RU=https%3a%2f%2fwww.bilibili.tv%2fen%2fvideo%2f4794184307577344/RK=2/RS=zaZbTjiWFsg.Zej4L.jdFX8Z_gY-"));
        itemList.add(new Item(R.drawable.chennai, "Chennai Express", "Judul : Chennai Express",
                "Deskripsi : Rahul seorang pemuda yang akan pergi  ke sungai Gangga untuk menaruh abu kakeknya terjebak dalam kereta yang salah. kereta dengan tujuan Chennai Express telah mempertemukannya dengan Meena, wanita cantik yang kabur dari pernikahannya. " +
                        "Akan kah Rahul menolong Meena atau tetap melanjutkan perjalanan nya ke sungai Gangga? ",
                    " Link : https://mobile-api.loklok.video/cms/web/share/detail?id=25714&category=0&episodeId=153858&language=in_ID&clientType=android_artem"));
        itemList.add(new Item(R.drawable.dhoom, "Dhoom 2", "Judul : Dhoom 2", "Deskripsi : Penjahat Internasional mr.A sedang di kejar polisi di seluruh dunia. Jai Dixit polisi dari Mumbai mencoba untuk menangkapnya juga. " +
                        "Akan tetapi mr.A bertemu dengan seorang wanita yang ingin menjadi rekan mencuri bersamanya. akankah mr.A menerimanya? atau malah mr.A tertangkap karena wanita itu?",
                    "Link : https://r.search.yahoo.com/_ylt=Awr4_.I3F7xnscEQOXlXNyoA;_ylu=Y29sbwNncTEEcG9zAzIEdnRpZAMEc2VjA3Ny/RV=2/RE=1741589559/RO=10/RU=https%3a%2f%2fwww.bilibili.tv%2fen%2fvideo%2f2046668386/RK=2/RS=SWbEOUuDG.CzKAzG5.k.I7wqLIA-"));
        itemList.add(new Item(R.drawable.koi, "Koi Mil Gaya","Judul : Koi Mil Gaya",
                "Deskripsi : Rohit  seorang anak yang memiliki kelainan bertemu dengan alien, ia  memberinya nama Jadoo. berkat kedatangan Jadoo kehidupan Rohit mulai berubah. akan tetapi kedatangan Jadoo juga membuat para ilmuan mencari keberadaannya  yang dapat  membahayakan Rohit." +
                        " Apakah yang akan terjadi pada persahabatan Jadoo dan Rohit? ",
                    " Link : https://r.search.yahoo.com/_ylt=AwrO_NolGrxnkWMQUXVXNyoA;_ylu=Y29sbwNncTEEcG9zAzIEdnRpZAMEc2VjA3Ny/RV=2/RE=1741590310/RO=10/RU=https%3a%2f%2fwww.bilibili.tv%2fid%2fvideo%2f2044358693/RK=2/RS=TFk4xDz1EOlbrUpOQpWTtWzMBVg-"));
        itemList.add(new Item(R.drawable.bang, "Bang Bang","Judul : Bang Bang",
                "Deskripsi : Seorang wanita sederhana yang bekerja sebagai resepsionis bank, Harlein secara tidak sengaja bertemu Rajveer pria menawan dan misterius.Pertemuan mereka membuat dia selalu dalam masalah seperti orang asing yang secara sengan menembakan peluru pada mereka serta banyak nya orang yang mencari keberadaan mereka." +
                        "Rajveer berusaha  meyakinkan nya sementara peluru mengejar Harlein.",
                "Link : https://r.search.yahoo.com/_ylt=AwrOrCjdG7xnF8IPXfJXNyoA;_ylu=Y29sbwNncTEEcG9zAzIEdnRpZAMEc2VjA3Ny/RV=2/RE=1741590750/RO=10/RU=https%3a%2f%2fwww.bilibili.tv%2fid%2fvideo%2f2009363382/RK=2/RS=.U2UMC9f7Og5hVxe3jPy.kvkc7s-"));
        itemList.add(new Item(R.drawable.love, "Loveyatri","Judul : Loveyatri",
                "",""));
        itemList.add(new Item(R.drawable.sty, "Student Of The Year","","",""));
        itemList.add(new Item(R.drawable.sty2, "Student Of The Year 2","","",""));
        itemList.add(new Item(R.drawable.dilwale, "Dilwale","","",""));

        adapter = new MyAdapter(this, itemList, this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onItemClick(Item item) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("image", item.getImage());
        intent.putExtra("title", item.getName());
        intent.putExtra("description", item.getDescripsi());
        intent.putExtra("link",item.getLink());
        startActivity(intent);    }

}