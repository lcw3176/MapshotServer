package com.joebrooks.mapshotserver.global.common;

public enum UriInfo {
    scheme("https"),
    host("herokuapp.com"),
    kakaoMapCrawler("/map/kakao/crawl");

    private String param;

    private UriInfo(String param){
        this.param = param;
    }

    @Override
    public String toString() {
        return this.param;
    }
}