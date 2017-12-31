package a32ndbatch.rubuya09.uuproject2.travelguideuu.PlaceDetalsPojo;

/**
 * Created by mks on 11/15/2017.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;


public class AdrAddress {

    @SerializedName("#text")
    @Expose
    private List<String> text = null;
    @SerializedName("span")
    @Expose
    private List<String> span = null;

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public List<String> getSpan() {
        return span;
    }

    public void setSpan(List<String> span) {
        this.span = span;
    }

}