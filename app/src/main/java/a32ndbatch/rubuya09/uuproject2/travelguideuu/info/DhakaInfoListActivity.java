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
import a32ndbatch.rubuya09.uuproject2.travelguideuu.hotel.HotelDhaka;

public class DhakaInfoListActivity extends AppCompatActivity {
 ListView listView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka_info_list);
        listView= (ListView) findViewById(R.id.listDha);
        button= (Button) findViewById(R.id.barHotel);

        String []bar=new String[]{"Ahsan Manzil (1872) on The Bank of Buriganga river","American Embassy – At Notun Bazar","Bahadur Shah Park – Near Bangla Bazar","Bangabandhu Memorial Museum","Bangabandhu Novo Theater","Bangla Academy","Baldha Garden","Bangladesh Supreme Court","Bara Katra (1641) – Chak Bazar","Chhota Katra – and the tomb of Bibi Champa (1663) – Chak Bazar","Curzon Hall – In Dhaka University","Public Library","Dhaka University","Dhaka Zoo","Hatir Jeel","Husaini Dalan (1642)","Lalbagh fort – and the tomb of Bibi Pari (1668)","Muktijuddha Museum","National Museum Shahabag","National Assembly","National Memorial Saver","Nimtali Deuri – Asiatic Society of Bangladesh, 1765","Raja Harish Chandra Home(eighteenth century, Savar)","Shahid Minar Dhaka","Rosary Church (1678)","Rayer Bazaar Bodho Bhumi","Soroardi Uddan","Bridge","Banani Airport Fly over","Buriganga Setu","Medford Chakbazaar Sethu","Khilgoan Over Bridge","Mohakhali Over Bridge","Sadaybad Over Bridge","Hospital","BARDEM Hospital","Dhaka Medical","Mitford Hospital","Dhaka National Hospital","PG at Sahabag","Mosque/ Mazar","Armanitola Mosque(1716)","Bibi Meher Mosque (1814)","Binod Bibi Mosque (1456 AD)","Baitul Mokarram","Chowk Mosque (1676)","Farrukh Shayar Mosque (1703-1704)","Kartalab Khan Mosque (1700-1704)","Khawaja Shahbaz Mosque (1679)","Khawja Ambar Mosque (1677-78)","Moriam Saleh Mosque (1706)","Seven Domed Mosque (1676)","Shayesta KhanMosque (1664-78)","Sitara Begum Mosque (1815)","Tara Mosque, Azimpur Mosque (1746)","Tin Netar Shrine – Near Karjon Hall","Parks","Fantasy Kingdom","Nandan Park","Ramna Park","Shisu Park – Near Shahabag","Shroardy Uddayn – Near Shahabag","Sports Ground","Army Stadium – Near Banani Kakoli","Vashani Stadium – Near Gulisthan","Mirpur Stadium","Temple / Math / Pagoda","Bagmara Math (Nawabganj)","Boresshwari Kali Mandir – Rajar Bag",
                "Dhakeshwari Mandir ( 1100 century) – Near Azimpur","Jaykali Mandir – Wari","Kamlapur Buddhist Temple – Bashaboo","Ramna Kali Mandir – in Shwroardi Park","Shree Shree Sani Ashram and Math (1199 AD) – Jatrabari"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,bar);
        listView.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HotelDhaka.class));
            }
        });
    }
}
