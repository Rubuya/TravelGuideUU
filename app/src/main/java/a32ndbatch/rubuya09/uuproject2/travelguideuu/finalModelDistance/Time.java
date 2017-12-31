package a32ndbatch.rubuya09.uuproject2.travelguideuu.finalModelDistance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mks on 12/28/2017.
 */

public class Time {
    @SerializedName("text")
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}