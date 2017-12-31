package a32ndbatch.rubuya09.uuproject2.travelguideuu.hotel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import a32ndbatch.rubuya09.uuproject2.travelguideuu.R;

public class HotelSylhet extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_sylhet);
        listView= (ListView) findViewById(R.id.listBar);
        // hotel= (Button) findViewById(R.id.barHotel);
//change here
        String []bar=new String[]{};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,bar);
        listView.setAdapter(adapter);
    }
}
