package a32ndbatch.rubuya09.uuproject2.travelguideuu.interfaces;



import a32ndbatch.rubuya09.uuproject2.travelguideuu.PlaceDetalsPojo.PlaceDetails;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mks on 11/15/2017.
 */

public interface Map_PlaceDetails_Interface {
    @GET("api/place/details/json?&key=AIzaSyCs5XQwhs4ROQD7arGorZsIbSD-aZjwhhc")

    Call<PlaceDetails> getPlaceDetails(
            @Query("placeid") String placeId);
           // @Query("reference") String placeId);
           // @Query("rankby") String rankby,
//            @Query("radius") int rad,
           // @Query("types") String type);
}
