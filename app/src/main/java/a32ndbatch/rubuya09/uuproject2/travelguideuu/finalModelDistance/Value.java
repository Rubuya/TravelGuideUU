package a32ndbatch.rubuya09.uuproject2.travelguideuu.finalModelDistance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mks on 12/28/2017.
 */

public class Value {
    @SerializedName("text")
    private String distance;

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}