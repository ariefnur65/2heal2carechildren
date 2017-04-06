package id.co.blogspot.blogmozink.a2heal2carechildren;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "id.co.blogspot.blogmozink.OPENEDU";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn_buku_kontak = (Button) findViewById(R.id.btn_bukuKontak);
        btn_buku_kontak.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
            openPopUpMenu(v);
            }

        });

        final Button btn_edu = (Button) findViewById(R.id.btn_eduk);
        btn_edu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openEducation(v);
            }
        }
        );

        final Button btn_idn = (Button) findViewById(R.id.btn_idn);
        btn_idn.setOnClickListener(new View.OnClickListener(){
                                public void onClick(View v){
                                    openIdent(v);
                                }
                            }
        );

        final Button btn_komun = (Button) findViewById(R.id.btn_kunciSukses);
        btn_komun.setOnClickListener(new View.OnClickListener(){
                                       public void onClick(View v){
                                           openKomun(v);
                                       }
                                   }
        );


    }


    public void openEducation(View view)
    {
        Intent intent = new Intent(this, EdukasiDampak.class);
        startActivity(intent);

    }

    public void openIdent(View view)
    {
        Intent intent = new Intent(this, IdentMasalah.class);
        startActivity(intent);

    }


    public void openKomun(View view)
    {
        Intent intent = new Intent(this, komunikasi.class);
        startActivity(intent);

    }
    public void openPopUpMenu(View v){
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.popupmenu, popup.getMenu());
        popup.show();
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.konselor:
                        Intent intent;
                        intent = new Intent(getApplicationContext(), konselormenu.class);
                        startActivity(intent);
                        break;
                    case R.id.pusatPelayanan:

                        break;

                }
                return false;
            }
        });

    }

}
