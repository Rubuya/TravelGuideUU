package a32ndbatch.rubuya09.uuproject2.travelguideuu.PlaceDetalsPojo;

/**
 * Created by mks on 11/15/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

public class Location
{
    private double lat;

    public double getLat() { return this.lat; }

    public void setLat(double lat) { this.lat = lat; }

    private double lng;

    public double getLng() { return this.lng; }

    public void setLng(double lng) { this.lng = lng; }
}