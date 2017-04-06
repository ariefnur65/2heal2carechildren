package id.co.blogspot.blogmozink.a2heal2carechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menyangkal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menyangkal);
        final Button btn_ada = (Button) findViewById(R.id.btn_adaGejala1);
        btn_ada.setOnClickListener(new View.OnClickListener(){
                                         public void onClick(View v){
                                             openAdaGejala(v);
                                         }
                                     }
        );

        final Button btn_tdk = (Button) findViewById(R.id.btn_tdkadagejala1);
        btn_tdk.setOnClickListener(new View.OnClickListener(){
                                         public void onClick(View v){
                                             openTdkGejala(v);
                                         }
                                     }
        );

    }

    public void openAdaGejala(View v)
    {
        Intent intent = new Intent(this, GejalaSatuActivivy.class);
        startActivity(intent);
    }


    public void openTdkGejala(View v)
    {
        Intent intent = new Intent(this, IdentMasalah.class);
        startActivity(intent);
    }
}
