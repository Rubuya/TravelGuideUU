package a32ndbatch.rubuya09.uuproject2.travelguideuu.PlaceDetalsPojo;

/**
 * Created by mks on 11/15/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;


public class Geometry
{
    private Location location;

    public Location getLocation() { return this.location; }

    public void setLocation(Location location) { this.location = location; }

    private Viewport viewport;

    public Viewport getViewport() { return this.viewport; }

    public void setViewport(Viewport viewport) { this.viewport = viewport; }
}