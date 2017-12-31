package a32ndbatch.rubuya09.uuproject2.travelguideuu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import a32ndbatch.rubuya09.uuproject2.travelguideuu.info.BarisalInfoListActivity;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.info.ChittagongInfoListActivity;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.info.DhakaInfoListActivity;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.info.KhulnaInfoListActivity;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.info.MymensinghInfoListActivity;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.info.RajsahiInfoListActivity;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.info.RangpurInfoListActivity;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.info.SylhetInfoListActivity;

public class HistoricalLandMarkActivity extends AppCompatActivity {
Button barisal,dhaka,raj,rang,mymen,khul,sylhet,chitt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_land_mark);
        barisal= (Button) findViewById(R.id.barisal);
        dhaka= (Button) findViewById(R.id.dhaka);
        raj= (Button) findViewById(R.id.rajsahi);
        mymen= (Button) findViewById(R.id.mymensingh);
        khul= (Button) findViewById(R.id.khulna);
        sylhet= (Button) findViewById(R.id.Sylhet);
        chitt= (Button) findViewById(R.id.chittagong);
        rang= (Button) findViewById(R.id.rangpur);

        barisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BarisalInfoListActivity.class));
            }
        });

        dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),DhakaInfoListActivity.class));
            }
        });

        khul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),KhulnaInfoListActivity.class));
            }
        });

        raj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RajsahiInfoListActivity.class));
            }
        });

        chitt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ChittagongInfoListActivity.class));
            }
        });

        sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SylhetInfoListActivity.class));
            }
        });

        mymen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MymensinghInfoListActivity.class));
            }
        });

        rang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RangpurInfoListActivity.class));
            }
        });
    }
}
