package a32ndbatch.rubuya09.uuproject2.travelguideuu.PlaceDetalsPojo;

/**
 * Created by mks on 11/15/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import javax.annotation.Generated;


public class AddressComponent
{
    private String long_name;

    public String getLongName() { return this.long_name; }

    public void setLongName(String long_name) { this.long_name = long_name; }

    private String short_name;

    public String getShortName() { return this.short_name; }

    public void setShortName(String short_name) { this.short_name = short_name; }

    private ArrayList<String> types;

    public ArrayList<String> getTypes() { return this.types; }

    public void setTypes(ArrayList<String> types) { this.types = types; }
}
