package com.joebrooks.mapshotserver.domain.map.kakao.dto;

import lombok.Data;

@Data
public class KakaoMap {
    private boolean layerMode;
    private double lat;
    private double lng;
    private String level;
    private String type;
}