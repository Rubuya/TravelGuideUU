package a32ndbatch.rubuya09.uuproject2.travelguideuu.PlaceDetalsPojo;

/**
 * Created by mks on 11/16/2017.
 */

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;


public class Result
{
    private ArrayList<AddressComponent> address_components;

    public ArrayList<AddressComponent> getAddressComponents() { return this.address_components; }

    public void setAddressComponents(ArrayList<AddressComponent> address_components) { this.address_components = address_components; }

    private String adr_address;

    public String getAdrAddress() { return this.adr_address; }

    public void setAdrAddress(String adr_address) { this.adr_address = adr_address; }

    private String formatted_address;

    public String getFormattedAddress() { return this.formatted_address; }

    public void setFormattedAddress(String formatted_address) { this.formatted_address = formatted_address; }

    private String formatted_phone_number;

    public String getFormattedPhoneNumber() { return this.formatted_phone_number; }

    public void setFormattedPhoneNumber(String formatted_phone_number) { this.formatted_phone_number = formatted_phone_number; }

    private Geometry geometry;

    public Geometry getGeometry() { return this.geometry; }

    public void setGeometry(Geometry geometry) { this.geometry = geometry; }

    private String icon;

    public String getIcon() { return this.icon; }

    public void setIcon(String icon) { this.icon = icon; }

    private String id;

    public String getId() { return this.id; }

    public void setId(String id) { this.id = id; }

    private String international_phone_number;

    public String getInternationalPhoneNumber() { return this.international_phone_number; }

    public void setInternationalPhoneNumber(String international_phone_number) { this.international_phone_number = international_phone_number; }

    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    private String place_id;

    public String getPlaceId() { return this.place_id; }

    public void setPlaceId(String place_id) { this.place_id = place_id; }

    private double rating;

    public double getRating() { return this.rating; }

    public void setRating(double rating) { this.rating = rating; }

    private String reference;

    public String getReference() { return this.reference; }

    public void setReference(String reference) { this.reference = reference; }

    private ArrayList<Review> reviews;

    public ArrayList<Review> getReviews() { return this.reviews; }

    public void setReviews(ArrayList<Review> reviews) { this.reviews = reviews; }

    private String scope;

    public String getScope() { return this.scope; }

    public void setScope(String scope) { this.scope = scope; }

    private ArrayList<String> types;

    public ArrayList<String> getTypes() { return this.types; }

    public void setTypes(ArrayList<String> types) { this.types = types; }

    private String url;

    public String getUrl() { return this.url; }

    public void setUrl(String url) { this.url = url; }

    private int utc_offset;

    public int getUtcOffset() { return this.utc_offset; }

    public void setUtcOffset(int utc_offset) { this.utc_offset = utc_offset; }

    private String vicinity;

    public String getVicinity() { return this.vicinity; }

    public void setVicinity(String vicinity) { this.vicinity = vicinity; }

    private String website;

    public String getWebsite() { return this.website; }

    public void setWebsite(String website) { this.website = website; }
}
