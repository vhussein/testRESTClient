package com.azlan.test.service;


import com.azlan.test.model.Station;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("stationService")
public class StationServiceImpl implements StationService {

    private static String URI = "http://api.wunderground.com/api/249fab9755e4ad90/geolookup/conditions/forecast/q/Australia/Sydney.json";

    @Override
    public List getStation(String cityName) {

        Station station = new Station();
        System.out.println("This is the city name " + cityName);

        RestTemplate restTemplate = new RestTemplate();
        station = restTemplate.getForObject(URI, Station.class);

        System.out.println(station.toString());

        return null;
    }
}
