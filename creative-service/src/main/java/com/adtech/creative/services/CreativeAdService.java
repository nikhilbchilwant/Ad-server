package com.adtech.creative.services;

import com.adtech.creative.model.CreativeAd;
import org.springframework.stereotype.Service;

@Service
public class CreativeAdService {

    private CreativeAd creativeAd;

    public CreativeAd getCreativeAd(String id){
        return new CreativeAd(1,"test");
    }

    public void saveCreativeAd(CreativeAd creativeAd){

    }

    public void updateCreativeAd(CreativeAd creativeAd){

    }

    public void deleteCreativeAd(CreativeAd creativeAd){

    }

}
