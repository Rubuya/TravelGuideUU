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
import a32ndbatch.rubuya09.uuproject2.travelguideuu.hotel.HotelChittagong;

public class ChittagongInfoListActivity extends AppCompatActivity {
 ListView listView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chittagong_info_list);
        listView= (ListView) findViewById(R.id.listChit);
        button= (Button) findViewById(R.id.barHotel);

        String []bar=new String[]{"Chittagong Sadar", "Chittagong General Hospital","Bayejid Bostami Shrine","Central Railway Building","Court Building","Chittagong City Corporation Building","Circuit House","Cheragee Pahad","Chittagong College","Kadam Mubarak mosque, Andorkilla","Chittagong Port – Located near the mouth of Karnaphuli","Foy’s Lake","The Makkah Madina Trade Centre","Ethnological Museum","Chandanpura Mosque","Roman Catholic Diocese","Chittagong Medical College and Hospital","New Karnaphuli Bridge","Shah Amanat International Airport","Chittagong University of Engineering & Technology","Asgar Ali Chowdhury Mosque","War Cemetery","Fouzdarhat Cadet College","Hajji Mohsin College","Hazrat Shah Amanat Dargah Sharif","Patenga Beach","Anwara Upazila","Parki Sea Beach","Akbari Mosque","Church Bibi Mosque","Dhala Bibi Mosque","Monu Miah’s canon (now preserved in the National Museum)"," Banshkhali Upazila"," Baksi Hamid Mosque (1558)"," Jatebi Jami Mosque"," Nabi Mosque (eighteenth century)"," Nim Kalibari (1710)"," Sikh Temple (Banigram)"," Boalkhali Upazila"," Sreepura Bura Mosque"," Dewan Vita (c. 1711)"," Mazar of Hzrat Bu-ali Kalandar (R) at Karaldanga"," Kalachan Thakur Bari (Popadia)"," Lalar Dighi (Kandhurkhil)"," Kanungopara Shyam Roy Mandir","MedosHermitage"," Chandanaish Upazila","Three domed Khan Mosque (Bagicha Hat)","Nabaratna Bihar (Satbaria)","Buri Kali Mandir (Barama)","Khan Dighi (Bagicha Hat)","Fatikchhari Upazila","Company Tila","Ahsan Ullah Gomasta Mosque","Courtpar Buddhist Vihara","Adullapur Buddhist Vihara","Kalibari Mandir (Nanupur)","Hazari Khil Jangal","Hathazari Upazila","Alaul Mosque (1473-74)","Fakir Mosque (1474-80)","Wali Khan Mosque (1714-19)","Hamja Khan Mosque (1682)","Panchkari Chowdhury Bari","Lakshmi Saha Zamindar Bari","Lohagara Upazila","Machhdia Buddhist Temple (Adhunagar, 18th century)","Buddhist Temple and other royal establishments at Chendirpuni","Gupta Zamindar Bari at Padua","Adhunagar Budhist Temple","Magadeshwari Temple at Maghdighi","Mirsharai Upazila","Dhum Shila Pathar (Shantir Hat)","Chhuti Khan Mosque","Paragal Khan Dighi","Nai Duari Mosque","Jagannath Dham (Abu Torab)","Kali Mandir (Karerhat)","Shantiniketan Vihara","Abhay Charan Vihara","Patiya Upazila","Musa Khan Mosque (1658)","Kura Katni Mosque at Harin Khain (1806)","Kala Mosque at Kachuai (seventeenth century)","Akbar Jami Mosque","Syed Kutub Tomb at Baralia","Bura Gosai’s Mandir","Jagannath Temple at Suchakradandi","Annapurna Temple","Jonardan Mandir, Shiva Mandir,","Buddhist Monastery at Haidgaon","Buddha Padochinha Temple at Unainpura","Rangunia Upazila","Remnants of the palace Shukbilash (18th century)",
                "Ranir Pukur (Raja Hat)","Pagla Mama Dargah (19th century)","Shahen Shah Dargah (Pomara)","Dharma Chakra Vihara (1750)","Jagadhatri Mandir","Sree Sree Ramakrishna Mandir (Santiniketan)","Shiva Chaturdashi Mandir (Parua)","Krishna Mandir (Majumdarkhil)","Sagar Dighi (Rajanagar)","Mahamuni Buddhist Monastery","Simaghar","Raozan Upazila","Jagannath Debaloy and the Gateway at Dabua","Koileswra Shiva M" +
                "andir and Shiva Statue at Dabua (19th century)","Mohamuni Buddhist Temple at Pahartali","Chulamoni Buddhist Vihara at Lathichhari, Aburkhil Buddhist Vihara","Aryan Moitra Buddhist Vihara (sleeping statue)","Isa Khan Dighi at Noajispur","Laskar Uzir Dighi at Kadalpur","Nabin Chandra Sen’s residenceand Memorial Monument at Guzara","Noa Para, Jagatpur Asrama","Sandwip Upazila","Satkania Upazila","Dargaon Mosque (Satkania union)","Deputy Mosque (15th century AD,Sonakania union)","coins engraved with figure (13th century AD),Thakur Dighi (Satkania), Kotwal Dighi (Sonakania)","Shiva Mandir (Dhemsa)","Bomang Hat Church (Bazalia)","Hindu Mandir (Kanchana)","Sitakunda Upazila"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,bar);
        listView.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HotelChittagong.class));
            }
        });
    }
}
