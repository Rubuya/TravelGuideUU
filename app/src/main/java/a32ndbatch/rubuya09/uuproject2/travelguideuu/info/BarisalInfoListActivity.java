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

public class BarisalInfoListActivity extends AppCompatActivity {
 ListView listView;
    Button hotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal_info_list);
        listView= (ListView) findViewById(R.id.listBar);
        hotel= (Button) findViewById(R.id.barHotel);
//change here
        String []bar=new String[]{"Barisal sadar","Aswini kumar town hall","BM college university", " Baptist Church", "Badho  – Vumi on river Bank, Medical College", "Bells Park", "Oxford Church – The best among Barisal Tourist Spots","Catholic Church", "Kali Bari of Mukunda Das –  Near Notullabad Bus Stand", "Hindu Shaosan Ghat", "Rammohan Samadhi Mandir", "Girja Mahalla", "Dopdopia bridge on the river Kittonkhola", "Kittonkhola River", "Shankar Math", "Muktijoddha Park", "Brass image of Manasa weighing three maunds (Char Bania Bari)", "Shohel Chattar, Bibir Pukur Par","Bakerganj Upazila", "KalashKathi Jamider Bari", "Padri Shibpur Churches","Banaripara Upazila","Chakar college","Wazirpur","Gutiamashjid/ Masque",
                "Babuganj Upazila","Durgasagor Dighi – at Madhbpasha","Charkella","Others","Ebadullah Mosque","Joint Mosque at Bhatikhana","Kasai Mosque","One domed Mosque (Kasba)","Sujabad Kella","Sangram Kella","Sharkal Fort","Sandha Nadi/River"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,bar);
        listView.setAdapter(adapter);

        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
startActivity(new Intent(getApplicationContext(), HotelBarisal.class));
            }
        });
    }
}
