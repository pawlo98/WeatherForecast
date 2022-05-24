import com.google.gson.Gson;
import json.Weather;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class WeatherRun {

    public void run() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write city:");
        String city = scanner.nextLine();

        if (city.contains(" ")){
            city=city.replace(" ","&");
        }

        URL url = new URL("http://api.weatherstack.com/current?access_key=f6a1136aecab15fbfccd3b16f94f48d2&query="+city);
        InputStreamReader reader = new InputStreamReader(url.openStream());

        Weather weather = new Gson().fromJson(reader,Weather.class);

        information(weather);

    }

    private void information(Weather weather) {
        StringBuilder sb = new StringBuilder();
        sb.append(weather.getLocation().getName() + "/" + weather.getLocation().getCountry());
        sb.append(" has: " + weather.getCurrent().getTemperature() + " degrees ");
        sb.append("and pressure: "+ weather.getCurrent().getPressure());
        System.out.println(sb);
    }
}
