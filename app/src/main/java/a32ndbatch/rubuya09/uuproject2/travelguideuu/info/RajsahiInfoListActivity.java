package a32ndbatch.rubuya09.uuproject2.travelguideuu.info;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import a32ndbatch.rubuya09.uuproject2.travelguideuu.R;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.hotel.HotelBarisal;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.hotel.HotelRajsahi;

public class RajsahiInfoListActivity extends AppCompatActivity {
ListView listView;Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajsahi_info_list);
        listView= (ListView) findViewById(R.id.listRaj);
        button= (Button) findViewById(R.id.barHotel);

        String []bar=new String[]{"Bagha Mosque","Bagdhani Mosque","Bara Kuthi","Bhuban Mohan parks Captain Mansoor Ali Park","Borendra Museum","Cadet College","Dolmancha (Putia)","Godagari Royal Palace","Govinda Mandir","Gopal Mandir","Graveyard of Mirza Alikuli Beg",
                "Hazrat Shah Sultan Bagdhani Mosque (Paba Upazila)","Jami Mosque (Tanore Upazila)","Kismat Madina Mosque","New Govt. Degree College","Porsha Royal Palace","Puthia Temple Complex","Puthia Rajbari Complex","Rajshahi Sugar Mills","Rajshahi Medical College","RU University","Sarda Police Training Center","Shahid Qumruzzaman central park","Silk Industry","University of Engineering & Technology","Talando Shiva Mandir (1860), Rajbari","Tomb of Hazrat Shah Makhdum (R)","Tomb (Mazar) of Hazrat Shah Sultan (Godagari Upazila)","One domed Ruipara (Durgapur) Jami Mosque (sixteenth century)","Two domed Kismat Madia Mosque (eighteenth century)","Three domed Bhagna Jami Mosque at Tanore Upazila (1223 AH )"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,bar);
        listView.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HotelRajsahi.class));
            }
        });
    }
}
