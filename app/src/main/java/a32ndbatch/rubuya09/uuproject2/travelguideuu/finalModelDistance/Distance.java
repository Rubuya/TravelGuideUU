package a32ndbatch.rubuya09.uuproject2.travelguideuu.finalModelDistance;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mks on 12/28/2017.
 */

public class Distance {
    @SerializedName("legs")
    private List<Text> legs = null;

    public List<Text> getLegs() {
        return legs;
    }

    public void setLegs(List<Text> legs) {
        this.legs = legs;
    }
}