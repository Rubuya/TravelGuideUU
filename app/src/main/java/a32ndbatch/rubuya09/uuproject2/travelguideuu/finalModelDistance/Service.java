package a32ndbatch.rubuya09.uuproject2.travelguideuu.finalModelDistance;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mks on 12/28/2017.
 */

public interface Service {
    @GET("maps/api/directions/json")
    Call<Details> getDetailsInfo(@Query("origin") String origin, @Query("destination") String destination);

    //http://maps.googleapis.com/maps/api/directions/json?origin=39.004554,-76.875528&destination=39.290385,-76.612189

    //?origin=39.004554,-76.875528&destination=39.290385,-76.612189
}