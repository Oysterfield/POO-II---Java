/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploproxy;

/**
 *
 * @author Win10
 */

/** Para salvar largura de banda, nós podemos colocar os
 * resultados do pedido em cache e mantê-los por determinado
 * tempo. Mas pode ser impossível colocar tal código diretamente
 * na classe de serviço. Por exemplo, ele pode ter sido
 * fornecido como parte de uma biblioteca de terceiros e/ou
 * definida como `final`. É por isso que nós colocamos o código
 * do cache em uma nova classe proxy que implementa a mesma
 * interface que a classe de serviço. Ela delega ao objeto do
  serviço somente quando os pedidos reais foram enviados. */
public class CachedYouTubeClass implements ThirdPartyYouTubeLib{
    private ThirdPartyYouTubeLib service;
    private VideoList listCache;
    private VideoInfo videoCache;
    private boolean needReset;
    
    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }
    
    @Override
    public VideoList listVideos() {
        if (listCache == null || needReset)
            listCache = service.listVideos();
        return listCache;
    }
    
    @Override
    public VideoInfo getVideoInfo(String id) {
        if (videoCache == null || needReset)
            videoCache = service.getVideoInfo(id);
        return videoCache;
    }
    
    @Override
    public void downloadVideo(String id) {
        if (!downloadExists(id) || videoExists(id) ||  needReset)
            service.downloadVideo(id);
    }
    
    public abstract boolean downloadExists(String id);
    
    public abstract boolean videoExists(String id);
}
