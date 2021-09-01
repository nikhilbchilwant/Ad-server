package com.adtech.creative.controllers;

import com.adtech.creative.model.CreativeAd;
import com.adtech.creative.services.CreativeAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/ad-server/creativeAd")
public class CreativeServiceController {

    @Autowired
    private CreativeAdService creativeAdService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CreativeAd getCreativeAd(@PathVariable("id") String id){
        return null;//new CreativeAd(1, "http://www.google.com");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String saveCreativeAd(@PathVariable("id") String id){
        return String.format("POST requested");
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteCreativeAd(@PathVariable("id") String id){
        return String.format("DELETE requested");
    }

}
