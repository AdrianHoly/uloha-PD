package sk.fri.uniza.api;

import retrofit2.Call;
import retrofit2.http.*;
import sk.fri.uniza.model.Location;
import sk.fri.uniza.model.Token;
import sk.fri.uniza.model.WeatherData;

import java.util.List;
import java.util.Map;


public interface WeatherStationService {

    @GET("/weather/{station}/current")
    Call<Map<String, String>> getCurrentWeatherAsMap(
            @Path("station") String station);


    @GET("/weather/{station}/current")
    Call<Map<String, String>> getCurrentWeatherAsMap(
            @Path("station") String station,
            @Query("fields") List<String> fields);

    @GET("/weather/locations")
    Call<List<Location>> getStationLocations();


    @GET("/weather/{station}/current")
    Call<WeatherData> getCurrentWeather(@Path("station") String station);

    @GET("/weather/{station}/current")
    Call<WeatherData> getCurrentWeather(@Path("station") String station,
                                        @Query("fields") List<String> fields);


    // ... getCurrentWeather(station);


    // ... getCurrentWeather(station, fields);


    // ... getHistoryWeather(station, from, to);


    // ... getHistoryWeather(  station, from, to, fields);

    // ... getToken(authorization, claims);


    // ... getStationLocationsAuth(authorization);


    // ... getCurrentWeatherAuth(authorization, station);


    // ... getCurrentWeatherAuth(authorization, station, fields);


    // ... getHistoryWeatherAuth(authorization, station, from, to);


    // ... getHistoryWeatherAuth(authorization, station, from, to, fields);

}
