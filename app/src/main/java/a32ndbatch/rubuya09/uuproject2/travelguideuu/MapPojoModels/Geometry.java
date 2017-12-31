package a32ndbatch.rubuya09.uuproject2.travelguideuu.MapPojoModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * Created by mks on 11/15/2017.
 */

@Generated("org.jsonschema2pojo")
public class Geometry {

    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("viewport")
    @Expose
    private Viewport viewport;

    /**
     *
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     *
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     *
     * @return
     *     The viewport
     */
    public Viewport getViewport() {
        return viewport;
    }

    /**
     *
     * @param viewport
     *     The viewport
     */
    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }

}
