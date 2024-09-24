/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploproxy;

/**
 *
 * @author Win10
 */

/** A implementação concreta de um serviço conector. Métodos
* dessa classe podem pedir informações do YouTube. A velocidade
* do pedido depende da conexão do usuário com a internet, bem
* como do YouTube. A aplicação irá ficar lenta se muitos
* pedidos forem feitos ao mesmo tempo, mesmo que todos peçam a
  mesma informação. */
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{
    public VideoList listVideos() {
        // Envia um pedido API para o YouTube.
    }
    
    public VideoInfo getVideoInfo(String id) {
        // Obtém metadados sobre algum vídeo.
    }
    
    public void downloadVideo(String id) {
        // Baixa um arquivo de vídeo do YouTube.
    }
}
