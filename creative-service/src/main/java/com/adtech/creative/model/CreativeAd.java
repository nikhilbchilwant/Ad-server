package com.adtech.creative.model;

import com.fasterxml.jackson.annotation.JsonProperty;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

//@Entity
public class CreativeAd {

//    @Id
    private Integer id;

    private String contentURL;

    protected CreativeAd(){
        //for testing
    }

    public CreativeAd(Integer id, String contentURL){
        this.id = id;
        this.contentURL = contentURL;
    }

    public int getId() {
        return id;
    }

    public String getContentURL() {
        return contentURL;
    }

    public void setContentURL(String contentURL) {
        this.contentURL = contentURL;
    }
}
