package id.co.blogspot.blogmozink.a2heal2carechildren;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class konselormenu extends Activity {
    Spinner pilihKabupaten;
    Spinner pilihKecamatan;
    ArrayAdapter<CharSequence> adapterKota;
    ArrayAdapter<CharSequence> adapterKecamatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konselormenu);
        pilihKabupaten = (Spinner) findViewById(R.id.kota);
        pilihKecamatan = (Spinner) findViewById(R.id.kecamatan);
    // Create an ArrayAdapter using the string array and a default spinner layout
        adapterKota = ArrayAdapter.createFromResource(this,
                R.array.kabupatenOption, android.R.layout.simple_spinner_item);
        adapterKecamatan = ArrayAdapter.createFromResource(this,R.array.kecamatanKosong,android.R.layout.simple_spinner_item);
    // Specify the layout to use when the list of choices appears
        adapterKota.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterKecamatan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    // Apply the adapter to the spinner
        pilihKabupaten.setAdapter(adapterKota);
        pilihKecamatan.setAdapter(adapterKecamatan);

        pilihKabupaten.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (parent.getSelectedItemPosition())
                {
                    case 0:
//                        Toast.makeText(getApplicationContext(),"Yoiii",Toast.LENGTH_SHORT).show();
                        adapterKecamatan = ArrayAdapter.createFromResource(getBaseContext(),R.array.kecamatanSemarang,android.R.layout.simple_spinner_dropdown_item);
                        pilihKecamatan.setAdapter(adapterKecamatan);
                        break;
                    case 1:
                        adapterKecamatan = ArrayAdapter.createFromResource(getBaseContext(),R.array.kecamatanKendal,android.R.layout.simple_spinner_dropdown_item);
                        pilihKecamatan.setAdapter(adapterKecamatan);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        pilihKecamatan.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        /*
        pilihKabupaten.setOnItemClickListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });*/

    }

}
