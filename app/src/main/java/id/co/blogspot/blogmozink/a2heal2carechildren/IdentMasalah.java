package id.co.blogspot.blogmozink.a2heal2carechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class IdentMasalah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ident_masalah);

        final ImageButton btn_satu = (ImageButton) findViewById(R.id.satuClick);
        btn_satu.setOnClickListener(new View.OnClickListener(){
                                         public void onClick(View v){openTahapPertama(v);
                                         }
                                     }
        );
    }
    public void openTahapPertama(View view)
    {
        Intent intent = new Intent(this, menyangkal.class);
        startActivity(intent);

    }
}
