package a32ndbatch.rubuya09.uuproject2.travelguideuu.interfaces;



import a32ndbatch.rubuya09.uuproject2.travelguideuu.MapPojoModels.NearbyPlacesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mks on 11/15/2017.
 */

public interface Map_API_Interface {
    @GET("api/place/nearbysearch/json?&key=AIzaSyBkNQq0uTqkVWT414WyUdQ5nqbiXCrgHtg")
    Call<NearbyPlacesResponse> getNearbyPlaces(
            @Query("location") String locationString,
            @Query("rankby") String rankby,
//            @Query("radius") int rad,
            @Query("types") String type);
}
