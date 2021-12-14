package com.joebrooks.mapshotserver.controller;

import com.joebrooks.mapshotserver.domain.KakaoMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/proxy/kakao/crawl")
public class CrawlerController {


    @GetMapping
    public String getKakaoMap(@ModelAttribute KakaoMap kakaoMap, Model model){
        model.addAttribute("kakaoMapInfo", kakaoMap);

        return "proxy/kakao";
    }
}
