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

public class SylhetInfoListActivity extends AppCompatActivity {
ListView listView;Button  button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet_info_list);
        listView= (ListView) findViewById(R.id.listSylhet);
        button= (Button) findViewById(R.id.barHotel);

        String []bar=new String[]{"Balaganj Upazila","Akhra of Gauranga Mahaprabhu","remnants of Nagendra Das Chowdhury’s residenceTemple of Chandranath Sharma (Babnobazar)","Sylhet Sadar","Hazrat Shahjalal Mazar Sharif","Ghardoar Nawabi Mosque",
                "Statue made of black basalt at Bishwamvar Akhra","stone inscription of Shahi Eidgah","Keane Bridge","Lakkatura Tea Garden","Malnichara Tea Estate","Shahi Eidgah Maydan","Tilagar Eco Park – Tilagar","Shah Paran Darga Sharif","House of Ali Amzad","Beanibazar Upazila","Sree Sree Basu Deva Bari  at village Supatala","Six copper plates of king Bhaskar Barma (7th century)","Ruins of Rajbari at Tengra","Bishwanath Upazila","Sitla Devi Mandir","Residence of Hasan Raja","Satpari Dighi","ship-shaped house of Gaura Govinda","Gour Gobinda Fort","Jaintiapur Upazila","Haripur Gas Field","Megalithic Stone Jaintiapur","remnants of Jaintiaswari Temple","remnants of Jaintia Rajbari","Sarighat Temple","Lalakhal,which is another top tourist attraction in Jaintapur","Golapganj Upazila","Mazar of Hazrat Bahauddin (R)","Sri Chaitanya Dev Skon Temple","Kailash Tila and Dewan Bridge","Dream Land Park","Gowainghat Upazila","Panthumai","Pang Thu Mai and Barahill Falls","Ratargul Swamp Forest",
                "Bisnakandi","Jaflong","Kanaighat Upazila","Patharkoari","Tamabil Land Port","Fenchuganj Upazila","Ferry ghat of the east india company","Hakaluki Haor","Osmani Nagar Upazila","General MAG Osmani Home","Old warranty","Unseen mosque","Ancient inscription","Zakiganj Upazila","Nawabi Mosque at Khilgram","Sajid Bazar Mosque","Gayibi Dighi at Bara Thakuri","Others","Khadimnagar National Park – KHADIMNAGAR, SYLHET"," Jalalpur zamindar bari- South Surma"," Nearest Tourist Destinations"," Madhbkundu"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,bar);
        listView.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HotelBarisal.class));
            }
        });
    }
}
