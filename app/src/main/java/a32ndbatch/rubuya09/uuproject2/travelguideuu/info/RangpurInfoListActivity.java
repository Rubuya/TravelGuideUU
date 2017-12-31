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
import a32ndbatch.rubuya09.uuproject2.travelguideuu.hotel.HotelRangpur;

public class RangpurInfoListActivity extends AppCompatActivity {
ListView listView;Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur_info_list);
        listView= (ListView) findViewById(R.id.listRang);
button= (Button) findViewById(R.id.barHotel);
        String []bar=new String[]{"Rangpur Sadar","Karmaikel College College Building","Kajitari Mosque in Mahiganj","Maulana Keramat Ali Jainpuri Mazar","Tomb of Shah Jalal Bokheri at Mahiganj","Tajhat Royal Palace","Homestead of Rroquiah Sakhawat Hossain at Pairabandh","Zila Parishad Building","Sree Sree Karunamayee Kali Mandir","Public Library","Monument on the Martyr of 71","Dimlaraj Kali Mandir","Bishawar Shiva Mandir","Gosaibari Nandi Mandir","Pareshnath Mandir at Mahiganj","Tepa Zamindar Bari","Khasbagh archaeological relics","Dewanbari main gate","Manthana Zamindar Bari","Rangpur Town Hall","Gosaibari Nandi Mandir","Pareshnath Mandir at Mahiganj","Tepa Zamindar Bari","Khasbagh archaeological relics","Dewanbari main gate","Manthana Zamindar Bari","Zoo","Rangpur Town Hall","Chiiklir Bil","মদার পুকুর দীঘি – হরিদেবপুর ইউনিয়নের","প্রাচীন বট গাছ – চন্দনপাট","Mithapukur Upazila","House of Begum Rokeya (Pairaband)","Turka Mosque at Latifpur union (Mughal period)","three domed Jami Mosque at village Mithapukur","mazar and mosque of Gazi Pir at Bairagiganj","three domed mosque at village Bhangni","house of Raja Bhavachandra and Bagdevi Mandir (extinct) at Dhap Udaypur","Benuban Buddhist Vihara","Ancient mandir of Aladipur","Zamindar Bari at Phulchawki","Baldipukur Mission and Church","Mithapukur (pond, excavated during the Mughal period)","Badarganj Upazila","Nine-domed Mosque at Lal Dighir Par of Radhanagar union (Mughal period)","Tomb of Kutub Shah at Kutubpur union","Bakhtyar Danga","Bhim Garh at Mansinghapur","Madai Khamar","Zamindar Bari at Dilalpur","Baroari Kali Mandir (BS. 1305)","Sree Sree Praneswari Kali Mandir (BS. 1310)","Gopinathpur Ashram and Mandir (BS. 1335)","Ruins of Jalubar Mandir","Ghatabeel Mandir","Burir Mandap","Shiva Mandir at Sekher Hat","Pirgachha Upazila","Manthana Zamidar Bari","Shibchandra Roy Royal Palace and Shiva Mandir at Itakumari","Pirgacha Debi Chowdhurani Royal Palace","Secret Fort at Chandipur","Tri-vigraha Mandir at Manthana","Bhabtarini Ma Kali Mandir","Shiva Mandir at Pirgachha","Chhota Taraf Durga Mandir","Pirganj Upazila","Remnants of the palace of Raja Nilambar at Patgram","Tomb of Shah Ismail Ghazi","Seven forts at Satgara","Poet Hayat Mahmud House (medieval period) at village Jhar Bishla","Khalashpur Hat Jami Mosque","Three domed Mosque at Dariapur","Hatibanda Mosque","Zamindar Bari and Mandir at Roypur","Khalisha Church","Kaunia Upazila","Ananda Moth","Historic White Mosque","Bhayarhat Shiva Mandir","Zamindar Bari of Tepa","Ancient temple at Tepa Madhupur","Burir Dighi","Railway Bridge over the Tista","Teesta Barrege","Gangachara Upazila","Coleconda Mosque","Mandail Mosque at Barabil","Mosque at Mahipur Zamindar Bari","Sharif Pir Saheb Mazar at Pakuria","Hari Mandir at Chandanhat","Thakurdaha Mandir","Taraganj Upazila","Four domed Taraganj Mosque (Mughal period)","Tthree domed Ghanirampur Mosque (Mughal period)","Menanagar Bara Jami Mosque",
                "Three domed Sayar Kuthipara Mosque (1358)","Three domed Sayar Kazipara Mosque","Akhra of Biswamvar Sadhu","Shyamganj Kachari (revenue office)","Zamindarbari and Debottar Kali Mandir","Iskon Mandir","Baman Dighi on Dhaka-Dinajpur road"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,bar);
        listView.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HotelRangpur.class));
            }
        });
    }
}
