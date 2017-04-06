package id.co.blogspot.blogmozink.a2heal2carechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class EdukasiDampak extends AppCompatActivity {
    WebView webView;
    Button btnSiap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edukasi_dampak);
        btnSiap = (Button) findViewById(R.id.btn_siap);
        btnSiap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        webView = (WebView) findViewById(R.id.artikeltext);
        String text = "<html><body style=\"text-align:justify\"> %s </body></Html>";

        String data = " Tahukah Anda bahwa anak yang menjadi korban kekerasan seksual sangat menderita?\n" +
                "        Bisa bayangkan masa kanak-kanak yang ceria dan indah tiba-tiba berubah hanya dengan\n" +
                "        sebuah kejadian yang tidak diingikan. Tidak hanya itu, anak-anak korban kekerasan seksual\n" +
                "        mengalami banyak kehilangan. Bukan hanya dari segi keperawanan bagi anak perempuan, tetapi juga kehilangan kepolosan, masa kecil yang riang, keamanan dan\n" +
                "        kepercayaan, nafsu makan, dan hubungan normal dengan sosok orangtua-terutama bila\n" +
                "        pelaku kekerasan berasal dari keluarga sendiri. Lebih dari itu anak-anak juga merasakan\n" +
                "        kekhawatiran kehilangan masa depan. Sadarkah kalian bahwa mereka ada disekitar kita?\n\n\n" +
                "\n" +
                "        Ya, dalam jangka 4 tahun saja, lebih dari 21 juta anak-anak Indonesia mengalami\n" +
                "        kekerasan seksual. Itu berarti dalam setahun sudah dapat memenuhi seluruh kepualauan\n" +
                "        Maluku hingga Papua. Lalu, akankah kita masih diam dan tidak peduli dengan keberadaannya?\n\n\n" +
                "\n" +
                "\n" +
                "        Mereka membutuhkan kita-sanak keluarga, guru, teman dan masyarakat- orang yang diberi keberuntungan untuk mendampingi mereka melalui masa sulit dan mengajaknya bangkit meraih masa depan. Mendampingi dan berada disisi mereka bukanlah hal yang sulit, namun juga tidak bisa seenaknya. Psikis dan persepsi yang berbeda akibat trauma membuat kita perlu untuk memahami setiap bahasa tubuhnya, melalui tanda dan gejala proses kehilangan dan berduka.\n" +
                "        Siapkah Anda memulai merangkul dan membantu mereka bangkit?";
        webView.loadData(String.format(text, data), "text/html", "utf-8");
        webView.computeScroll();
    }
}
