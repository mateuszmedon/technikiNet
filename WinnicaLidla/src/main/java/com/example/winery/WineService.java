package com.example.winery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WineService {

    @Autowired
    WineRepository wineRepository;


    public void saveWine() {
        WineDto wineDto = new WineDto(12, "name", "winery", "region", "description", "country", 14, 100, "province");

        wineRepository.save(WineMapper.dtoToWine(wineDto));
    }

}
