/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.exemploproxy;

/**
 *
 * @author Win10
 */
public interface ThirdPartyYouTubeLib {
    VideoList listVideos();
    VideoInfo getVideoInfo(String id);
    void downloadVideo(String id);
}