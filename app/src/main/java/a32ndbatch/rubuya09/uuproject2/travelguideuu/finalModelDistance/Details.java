package a32ndbatch.rubuya09.uuproject2.travelguideuu.finalModelDistance;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mks on 12/28/2017.
 */

public class Details {
    @SerializedName("routes")
    private List<Distance> routes = null;

    public List<Distance> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Distance> routes) {
        this.routes = routes;
    }
}