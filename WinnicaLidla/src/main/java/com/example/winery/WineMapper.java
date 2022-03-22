package com.example.winery;

public class WineMapper {

    public static Wine dtoToWine(WineDto dto){
        return new Wine(dto.getId(), dto.getCountry(), dto.getWinery(), dto.getDescription(),
                dto.getName(), dto.getPoints(), dto.getPrice(), dto.getProvince(), dto.getRegion());
    }
}
