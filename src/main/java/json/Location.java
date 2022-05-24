package json;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.TimeZone;


public class Location {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("timezone_id")
    @Expose
    private String timezoneId;
    @SerializedName("localtime")
    @Expose
    private String localtime;
    @SerializedName("localtime_epoch")
    @Expose
    private String localtimeEpoch;
    @SerializedName("utc_offset")
    @Expose
    private String utcOffset;




    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }


    public String getLat() {
        return lat;
    }


    public String getLon() {
        return lon;
    }

    public String getTimezoneId() {
        return timezoneId;
    }

    public String getLocaltime() {
        return localtime;
    }

    public String getLocaltimeEpoch() {
        return localtimeEpoch;
    }

    public String getUtcOffset() {
        return utcOffset;
    }
}
