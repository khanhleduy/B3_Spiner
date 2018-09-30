package l.com.ldk.duykhanh.b3_spiner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spnList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spnList = findViewById(R.id.spnList);

        final List<String> ds = new ArrayList<>() ;
        ds.add("Khanh");
        ds.add("Hoang");
        ds.add("Chien");
        ds.add("Luc");

        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,ds);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_multiple_choice);
        spnList.setAdapter(adapter);

        spnList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
