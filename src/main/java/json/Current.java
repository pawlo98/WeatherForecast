package json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Current {

    @SerializedName("observation_time")
    @Expose
    private String observationTime;
    @SerializedName("temperature")
    @Expose
    private Double temperature;
    @SerializedName("weather_code")
    @Expose
    private Double weatherCode;
    @SerializedName("weather_icons")
    @Expose
    private List<String> weatherIcons = null;
    @SerializedName("weather_descriptions")
    @Expose
    private List<String> weatherDescriptions = null;
    @SerializedName("wind_speed")
    @Expose
    private Double windSpeed;
    @SerializedName("wind_degree")
    @Expose
    private Double windDegree;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure")
    @Expose
    private Double pressure;
    @SerializedName("precip")
    @Expose
    private Double precip;
    @SerializedName("humidity")
    @Expose
    private Double humidity;
    @SerializedName("cloudcover")
    @Expose
    private Double cloudcover;
    @SerializedName("feelslike")
    @Expose
    private Double feelslike;
    @SerializedName("uv_index")
    @Expose
    private Double uvIndex;
    @SerializedName("visibility")
    @Expose
    private Double visibility;
    @SerializedName("is_day")
    @Expose
    private String isDay;




    public String getObservationTime() {
        return observationTime;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getWeatherCode() {
        return weatherCode;
    }

    public List<String> getWeatherIcons() {
        return weatherIcons;
    }

    public List<String> getWeatherDescriptions() {
        return weatherDescriptions;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public Double getWindDegree() {
        return windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getPrecip() {
        return precip;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getCloudcover() {
        return cloudcover;
    }

    public Double getFeelslike() {
        return feelslike;
    }

    public Double getUvIndex() {
        return uvIndex;
    }

    public Double getVisibility() {
        return visibility;
    }

    public String getIsDay() {
        return isDay;
    }
}
