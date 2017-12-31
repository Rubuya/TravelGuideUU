package a32ndbatch.rubuya09.uuproject2.travelguideuu.finalModelDistance;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mks on 12/28/2017.
 */

public class Client {
    public static final String BASE_URL = "http://maps.googleapis.com/";

    //http://maps.googleapis.com/maps/api/directions/json?origin=39.004554,-76.875528&destination=39.290385,-76.612189

    public static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}