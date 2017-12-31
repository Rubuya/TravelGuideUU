package a32ndbatch.rubuya09.uuproject2.travelguideuu.finalModelDistance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mks on 12/28/2017.
 */

public class Text {

    @SerializedName("distance")
    private Value result;

    @SerializedName("duration")
    private Time time;

    public Value getResult() {
        return result;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setResult(Value distance) {
        this.result = distance;

    }
}