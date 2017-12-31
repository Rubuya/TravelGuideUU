
package a32ndbatch.rubuya09.uuproject2.travelguideuu.TravelAgency;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import a32ndbatch.rubuya09.uuproject2.travelguideuu.MapPojoModels.NearbyPlacesResponse;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.MapPojoModels.Result;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.NPResponseActivity;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.PlaceDetalsPojo.PlaceDetails;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.ProfileActivity;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.R;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.WebViewActivity;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.adapters.NPResponseCustomAdapter;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.adapters.TAResponseCustomAdapter;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.constants.Constants;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.interfaces.Map_API_Interface;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.interfaces.Map_PlaceDetails_Interface;
import a32ndbatch.rubuya09.uuproject2.travelguideuu.modle.GPSTracker;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TravelAgencyResponseActivity extends AppCompatActivity {
    private ListView placesList;
    private GPSTracker gps;
    String type="food";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_agency_response);
        //for back button
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        placesList = (ListView) findViewById(R.id.listnearbyplaces);
        gps=new GPSTracker(this);
        Bundle receivedata = getIntent().getExtras();
        type = receivedata.getString("ptype");
        Toast.makeText(getApplicationContext(),""+type,Toast.LENGTH_LONG).show();


        final ProgressDialog progressDialog = new ProgressDialog(TravelAgencyResponseActivity.this);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Searching...");
        progressDialog.show();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                getNearbyPlaces();
            }
        };
        new Thread(runnable).start();

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        if(true) {
                            progressDialog.dismiss();
                        }
                    }
                },1200);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent=new Intent(getApplicationContext(),ProfileActivity.class);
        startActivityForResult(myIntent,0);
        return true;
    }
    private void getNearbyPlaces() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL_MAP)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        final Map_API_Interface service = retrofit.create(Map_API_Interface.class);

        final String location=gps.getLatitude()+","+gps.getLongitude();

        Call<NearbyPlacesResponse> call = service.getNearbyPlaces(location,"distance",type);
        call.enqueue(new Callback<NearbyPlacesResponse>() {
            @Override
            public void onResponse(final Call<NearbyPlacesResponse> call, final Response<NearbyPlacesResponse> response) {
                try {

                    final ArrayList<Result> plist = new ArrayList();
                    for(int i=0; i<response.body().getResults().size(); i++)
                        plist.add(response.body().getResults().get(i));


                    TAResponseCustomAdapter adapter=new TAResponseCustomAdapter(getApplicationContext(),plist);
                    placesList.setAdapter(adapter);
                    placesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            Toast.makeText(getApplicationContext(),""+response.body().getResults().get(i).getPlaceId(),Toast.LENGTH_LONG).show();
                            String placeid=response.body().getResults().get(i).getPlaceId();
                            String placeName=response.body().getResults().get(i).getName();

                            passId(placeid,placeName);

                        }
                    });
                } catch (Exception e) {
                    Log.d("onResponse", "There is an error");
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<NearbyPlacesResponse> call, Throwable t) {
                Log.d("onFailure", t.toString());
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0,0);
    }
    public void passId(String id, final String placeName){
        Retrofit rft= new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL_MAP)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final Map_PlaceDetails_Interface pt=rft.create(Map_PlaceDetails_Interface.class);
        Call<PlaceDetails>placeDetailsCall=pt.getPlaceDetails(id);
        // Toast.makeText(getApplicationContext(),"11"+placeDetailsCall,Toast.LENGTH_LONG).show();
        placeDetailsCall.enqueue(new Callback<PlaceDetails>() {
            // Toast.makeText(getApplicationContext(),"11"+placeDetailsCall,Toast.LENGTH_LONG).show();
            @Override
            public void onResponse(Call<PlaceDetails> call, Response<PlaceDetails> response) {
                // ArrayList<com.mapproject.mks.nearestlocation.pdetailspojo.Result>res=new ArrayList<com.mapproject.mks.nearestlocation.pdetailspojo.Result>();
                // for(int i=0;i<response.body().getResult())
                AlertDialog.Builder builder=new AlertDialog.Builder(TravelAgencyResponseActivity.this);
                LayoutInflater layoutInflater=getLayoutInflater();
                View dialogView=layoutInflater.inflate(R.layout.place_details,null);
                builder.setView(dialogView);
                TextView tvAddress=(TextView)dialogView.findViewById(R.id.tvAddressShow);
                final TextView tvMobile=(TextView)dialogView.findViewById(R.id.tvMobileShow);
                final TextView tvWeb=(TextView)dialogView.findViewById(R.id.tvWebShow);
                ImageView imCall=(ImageView)dialogView.findViewById(R.id.imcall);
                ImageView imWeb=(ImageView)dialogView.findViewById(R.id.imWeb);
                Button btClose=(Button)dialogView.findViewById(R.id.btClose);
                builder.setTitle(placeName+" Full Address ");
                final AlertDialog alertDialog=builder.create();
                tvAddress.setText(response.body().getResult().getFormattedAddress());
                tvMobile.setText(response.body().getResult().getFormattedPhoneNumber());
                tvWeb.setText(response.body().getResult().getWebsite());
                alertDialog.show();
                //for calling
                imCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String number=tvMobile.getText().toString();
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:"+number));
                        startActivity(callIntent);
                    }
                });
                //for launching web
                imWeb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String url=tvWeb.getText().toString();
//                        Intent i=new Intent(Intent.ACTION_VIEW);
//                        i.setData(Uri.parse(url));
//                        startActivity(i);
                        Intent intent=new Intent(TravelAgencyResponseActivity.this,WebViewActivity.class);
                        intent.putExtra("url",url);
                        startActivity(intent);
                    }
                });
                btClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog.dismiss();
                    }
                });

                Toast.makeText(getApplicationContext(),""+response.body().getResult().getWebsite(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<PlaceDetails> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"fail"+t,Toast.LENGTH_LONG).show();
            }
        });
}}
