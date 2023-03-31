/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaSwing.controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import javaSwing.modelo.ImageModel;
import javaSwing.vista.ImageView;
import javax.imageio.ImageIO;

/**
 *
 * @author golden
 */
public class ImageController {

        private ImageModel model;
        private ImageView view;

        public ImageController(ImageModel model, ImageView view) {
            this.model = model;
            this.view = view;
            view.addRefreshListener((ActionEvent e) -> {
                view.repaint();
            });
        }

        public void loadImage(String imageUrl) throws IOException {
            URL url = new URL(imageUrl);
            Image image = ImageIO.read(url);
            model.setImage(image);
            view.repaint();
        }
    }