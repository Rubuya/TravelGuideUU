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
import a32ndbatch.rubuya09.uuproject2.travelguideuu.hotel.HotelKhulna;

public class KhulnaInfoListActivity extends AppCompatActivity {
 ListView listView;Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna_info_list);
        listView= (ListView) findViewById(R.id.listKhul);
        button=(Button)findViewById(R.id.barHotel);

        String []bar=new String[]{"Batiaghata","খুলনা বিশ্ববিদ্যালয় খুলনা","গল্লামারী স্বাধীনতা স্মৃতিসৌধ","Dacope Upazila","The Sundarbans (located to the southern part of the Upazila)","Crocodile breeding center","Watch Tower","Dumuria Upazila","Chechuri Neel Kuthi","Chuknagar Neel Kuthi","Dakbangalow at Madhugram","Dighalia Upazila","Kali Mandir (Senhati Shiva Bari)","Basu Deva Mandir","Khan Jahan Ali Dighi at Panihati",
                "Koyra Upazila","Buro Mosque (Amadi union, 15th century)","Parimala Statue (Chamunda)","Mali Bari Mosque","Dhali Bari Mosque","Madinabad Fakirbari Mosque","Mosque Al Hera","Barabari Puja Mandir (Uttar Bedkashi)","Banskhali Bahadur Bari Mandir (Bagali)","Haripur Kali Mandir (Uttar Bedkashi)","Mathbari Durga Mandir (Maharajpur)","Radha Govinda Mandir (Bagali)","Madinabad Mandir","Paikgachha Upazila","স্যার পি,সি, রায় এর বাড়ী","সরল খাঁ দীঘি","ারুণীর স্নান ঘাট","বাঘনাথ মোহন্তের সমাধী","কপিলেশ্বরী কালী মন্দির","পীর জাফর আউলিয়ার মাজার","রায় সাহেব বিনোদ বিহারী সাধুর আবাস স্থান","কপিলমুনি বেদ মন্দির","কপিলমুনি সহচরী বিদ্যামন্দিরহরিঢালী শীব মন্দির ","Phultala Upazila","Khan Jahan Ali Mosque","Tomb and dighi of Buro Fakir","Rupsa Upazila","Khan Jahan Ali Bridge (Rupsa Bridge)","Rabindranath Tagore’s father in law’s house (Dakkhindihi, Phultala)","Khalishpur Thana","House of Mahim Das","Khalishpur Sattya Asram","Khulna Kotwali Thana","‘Kuthibari’ of Mr Charlie near the railway station","Khulna Nagar Bhaban","Khulna shipyard","Khulna Stadium","Circuit House","District Jail","Forest Office","Khulna Shilpakala Academy","Sonadanga Thana","Bangladesh Betar Khulna","Museum","Khulna Fire Service","Khulna Airport","Botanical Garden","Dakatia Bil (Fhultala-Dumuria)","Graveyard of Birshresta Ruhul Amin","Hardboard Mill","Hiron Poient","Jora-Ghet","Khulna Hadis Park","Khalishpur Wonderland Shishu Park","Jahanabad Cantonment Zoo","Paper Mill","Prem-kanon","Sundarbans"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,bar);
        listView.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HotelKhulna.class));
            }
        });
    }
}
