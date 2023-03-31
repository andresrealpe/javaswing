/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswing;

import javaSwing.vista.ImageView;
import java.io.IOException;
import javaSwing.controlador.ImageController;
import javaSwing.modelo.ImageModel;

/**
 *
 * @author golden
 */
public class main {
    
    public static void main(String[] args) throws IOException {
        ImageModel model = new ImageModel();
        ImageView view = new ImageView();
        ImageController controller = new ImageController(model, view);
        controller.loadImage("https://as01.epimg.net/diarioas/imagenes/2022/04/20/actualidad/1650466413_240889_1650466661_noticia_normal_recorte1.jpg");
        view.setVisible(true);
    }

}
    

