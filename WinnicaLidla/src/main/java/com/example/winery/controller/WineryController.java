package com.example.winery.controller;

import com.example.winery.WineService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WineryController {

    @Autowired
    WineService wineService;

    @RequestMapping(value = "/wine", method = RequestMethod.POST)
    public int Wine(@RequestParam(value = "name",
            defaultValue = "Fresco") String name) {

        wineService.saveWine();
        return Response.SC_OK;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String getHello() {

        return "model";
    }

}
