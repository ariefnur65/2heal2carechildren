package id.co.blogspot.blogmozink.a2heal2carechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GejalaSatuActivivy extends AppCompatActivity {

    String caraSatu = "Motivasi korban untuk berbicara ketika korban siap";
    String caraDua = "Perasaan korban butuh diperhatikan. Dengarkan dengan konsentrasi dan diam";
    String caraTiga = "Dalam percapakan dan gerak-geriknya, korban biasanya menunjukan beberapa tanda-tanda ketidakberdayaannya. Kenali tanda tanda-tanda yang menunjukkan tanda bahaya seperti menyakiti diri sendiri, memukul benda disekitarnya, menjambak-jambak rambut dll.";
    String caraEmpat = "Selamat Mencoba";
    WebView caraSatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gejala_satu_activivy);
        final Button btn_satu = (Button) findViewById(R.id.btn_selamat);
        btn_satu.setOnClickListener(new View.OnClickListener(){
                                        public void onClick(View v){openMain(v);
                                        }
                                    }
        );
       /* caraSatus = (WebView) findViewById(R.id.c1);
        String text = String.valueOf(Html
                .fromHtml("<![CDATA[<body style=\"text-align:justify;color:#222222; \">"
                        + getResources().getString(R.string.cmenyangkal1)
                        + "</body>]]>"));


        caraSatus.loadData(text, "text/html", "utf-8");*/
    }
    public void openMain(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
