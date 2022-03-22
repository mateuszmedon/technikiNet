package com.example.winery;

import javax.persistence.*;

@Entity
@Table(name = "wine", schema = "user")
public class Wine {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "winery")
    private String winery;

    @Lob
    @Column(name = "region")
    private String region;

    @Lob
    @Column(name = "description")
    private String description;

    @Lob
    @Column(name = "country")
    private String country;

    @Column(name = "price")
    private Integer price;

    @Column(name = "points")
    private Integer points;

    @Lob
    @Column(name = "province")
    private String province;

    public Wine(Integer id, String country, String winery, String description, String name, Integer points, Integer price, String region, String province) {
        this.id=id;
        this.country=country;
        this.description=description;
        this.name=name;
        this.points=points;
        this.price=price;
        this.province=province;
        this.region=region;
        this.winery=winery;
    }

    public Wine() {

    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getWinery() {
        return winery;
    }

    public void setWinery(String winery) {
        this.winery = winery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}