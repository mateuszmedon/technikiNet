package com.example.winery;

import java.io.Serializable;
import java.util.Objects;

public class WineDto implements Serializable {
    private final Integer id;
    private final String name;
    private final String winery;
    private final String region;
    private final String description;
    private final String country;
    private final Integer price;
    private final Integer points;
    private final String province;

    public WineDto(Integer id, String name, String winery, String region, String description, String country, Integer price, Integer points, String province) {
        this.id = id;
        this.name = name;
        this.winery = winery;
        this.region = region;
        this.description = description;
        this.country = country;
        this.price = price;
        this.points = points;
        this.province = province;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWinery() {
        return winery;
    }

    public String getRegion() {
        return region;
    }

    public String getDescription() {
        return description;
    }

    public String getCountry() {
        return country;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getPoints() {
        return points;
    }

    public String getProvince() {
        return province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WineDto entity = (WineDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.winery, entity.winery) &&
                Objects.equals(this.region, entity.region) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.country, entity.country) &&
                Objects.equals(this.price, entity.price) &&
                Objects.equals(this.points, entity.points) &&
                Objects.equals(this.province, entity.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, winery, region, description, country, price, points, province);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "winery = " + winery + ", " +
                "region = " + region + ", " +
                "description = " + description + ", " +
                "country = " + country + ", " +
                "price = " + price + ", " +
                "points = " + points + ", " +
                "province = " + province + ")";
    }
}
