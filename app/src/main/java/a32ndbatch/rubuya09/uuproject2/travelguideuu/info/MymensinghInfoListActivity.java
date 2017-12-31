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
import a32ndbatch.rubuya09.uuproject2.travelguideuu.hotel.HotelMymensingh;

public class MymensinghInfoListActivity extends AppCompatActivity {
 ListView listView;Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensingh_info_list);
        listView= (ListView) findViewById(R.id.listMymen);
        button= (Button) findViewById(R.id.barHotel);

        String []bar=new String[]{"Fulbaria Upazila","Anai Bazar Dighi","Bibir Ghar at Putijana Union","Bhaluka Upazila","Ruins of Neelkuthi at Birunia","Neshaiganj Mosque","Mosque at Bhaluka Bazar on the bank of river Khiru","Nandail Upazila","Muazzamabad Mosque (1493-1519)","Tomb and khanqa of Jahangir Shah at Jahangirpur village","Dhobaura Upazila","Mughal Mosque and Pathar Kata Dighi at village Darsha","Kamaksha Mandir at village Ghoshgaon","Vishnu statue of black basalt weighing 40 kg 500 gm (in the museum)","Dharma Shah Dighi at village Langal Jora","TrishalUpazila","Jami Mosque at Darirampur (Mughal period)","Rajbari at village Sankibhanga in Mokshapur union","Gauripur Upazila","Mud-built defense wall of the capital of Umar Khan (seventeenth century)","Tomb of heroin Sakina at Maoha (seventeenth century)","Kellah Bokainagar Shahi Mosque (built by Khwaja Usman Gani during the reign of Emperor Alamgir)"," +Single domed Isulia Jami Mosque (Mughal era)","Muhuria Jami Mosque (Mughal period)","Mosque at village Kumrigram (built by Dewan Umar Khan)","Muktagachha Upazila","Bhuiyanbari Mosque","Gopal and Shiva Mandir at the Atani Zamindar Bari (18th century)","Anandamoyee Kali and Shiva Mandir","Lakshmikhola Shiva Mandir","Tomb of Kutub Shah at Kutubpur","Joyen Shah tomb at Rasulpur","Tomb of Kali Shah Dewan","Muktagacha Jamidar Bari","Rajbaris of Gauripur","Ishwarganj Upazila","Bhulsoma Jami Mosque (1600)","Naluapara Jami Mosque (1625)","Gaffargaon Upazila","Tomb and Dighi of Kalu Shah","Dui Satiner Dighi (Dighi of two fellow wives)","Dighir Par Mosque (1392 AD)","Lakshmi Narayan Jeu Mandir (1335 BS)","Kali Mandir at Shibganj (Sultanate period)","Haluaghat Upazila","গোবড়াকুড়া কয়লা ডিপো","সাধু আন্দ্রিয়ের মিশন","শ্রী শ্রী কামাক্ষা মন্দির","কড়াইতলী স্থল বন্দর","হাতির বিচরনকৃত পাহাড়","সাধু আন্দ্রিয়ের মিশন","কংশ নদী","কাচার খাঁ দীঘি","ঐতিহ্যবাহী কাউলাড়া পুকুর","ধারা মিয়া বাড়ী।","Mymensingh Sadar","Collection of Joynul Abedin ","Kobi Nazrul UniversityNazrul Academy","Women Cadet College","Shashi Lodge","রাজ রাজেশ্বরী ওয়াটার ওয়ার্কস","Mymensingh Town Hall","Mymenshing Museum, Bijoypur","Anandamohan College","House of Maharaj Shashikanta","Alexandra Castle and Gospel Church","Raj Rajeswari Water Tank","Agricultural University","Institute of Nuclear Agriculture","Fisheries research institute at Mymensingh","Manuscript of the Mahabharata","Vishnu statue made of black basalt","Manuscript of the Gitagovinda of Joydev","Manuscript of the poems of chandidas","Photocopy of the first postal stamp","Sword of the zamindar of Muktagachha","World Map (1645)","Map of the greater Mymensingh (1779) by Kedarnath Majumder","Durgabari Temple (1867)","Shiva Temple (nineteenth century)","Shambhuganj Railway Bridge","Others","গারো পাহাড়-ঘোষগাঁও ইউনিয়ন, ধোবাউড়া, ময়মনসিংহ।","Graveyard of Nizamuddin Aulia","Bokaynagar Fort"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,bar);
        listView.setAdapter(adapter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HotelMymensingh.class));
            }
        });
    }
}
