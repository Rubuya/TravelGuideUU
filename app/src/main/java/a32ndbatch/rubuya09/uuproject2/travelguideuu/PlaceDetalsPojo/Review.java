package a32ndbatch.rubuya09.uuproject2.travelguideuu.PlaceDetalsPojo;

/**
 * Created by mks on 11/16/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;


public class Review
{
    private String author_name;

    public String getAuthorName() { return this.author_name; }

    public void setAuthorName(String author_name) { this.author_name = author_name; }

    private String author_url;

    public String getAuthorUrl() { return this.author_url; }

    public void setAuthorUrl(String author_url) { this.author_url = author_url; }

    private String language;

    public String getLanguage() { return this.language; }

    public void setLanguage(String language) { this.language = language; }

    private String profile_photo_url;

    public String getProfilePhotoUrl() { return this.profile_photo_url; }

    public void setProfilePhotoUrl(String profile_photo_url) { this.profile_photo_url = profile_photo_url; }

    private int rating;

    public int getRating() { return this.rating; }

    public void setRating(int rating) { this.rating = rating; }

    private String relative_time_description;

    public String getRelativeTimeDescription() { return this.relative_time_description; }

    public void setRelativeTimeDescription(String relative_time_description) { this.relative_time_description = relative_time_description; }

    private String text;

    public String getText() { return this.text; }

    public void setText(String text) { this.text = text; }

    private int time;

    public int getTime() { return this.time; }

    public void setTime(int time) { this.time = time; }
}