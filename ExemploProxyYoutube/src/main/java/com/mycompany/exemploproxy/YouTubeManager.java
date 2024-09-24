/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploproxy;

/**
 *
 * @author Win10
 */

/** A classe GUI, que é usada para trabalhar diretamente com um
* objeto de serviço, permanece imutável desde que trabalhe com
* o objeto de serviço através de uma interface. Nós podemos
* passar um objeto proxy com segurança ao invés de um objeto
* real de serviço uma vez que ambos implementam a mesma
  interface. */
public class YouTubeManager {
    protected ThirdPartyYouTubeLib service;
    private VideoInfo info;
    private VideoList list;
    
    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }
    
    public void renderVideoPage(String id) {
        info = service.getVideoInfo(id);
        // Renderiza a página de vídeos.
    }
    
    public void renderListPanel() {
        list = service.listVideos();
        // Renderiza a lista de miniaturas do vídeo.
    }
    
    public void reactOnUserInput() {
        renderVideoPage(id);
        renderListPanel();
    }
}
