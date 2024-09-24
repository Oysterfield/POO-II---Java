package com.mycompany.exemploproxy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Win10
 */
// A aplicação pode configurar proxies de forma fácil e rápida.
public class Application {
    public static void init(String[] args) {
        ThirdPartyYouTubeClass aYouTubeService = new ThirdPartyYouTubeClass();
        CachedYouTubeClass aYouTubeProxy = new CachedYouTubeClass(aYouTubeService);
        YouTubeManager manager = new YouTubeManager(aYouTubeProxy);
        manager.reactOnUserInput();
    }
}
