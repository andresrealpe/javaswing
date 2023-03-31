/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaSwing.vista;

import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import javaSwing.modelo.ImageModel;
import javaSwing.vista.ImagePanel;

/**
 *
 * @author golden
 */
public class ImageView extends JFrame {

        private ImagePanel imagePanel;

        public ImageView() {
            setTitle("Visor de Imágenes");
            setSize(400, 400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            imagePanel = new ImagePanel(null);
            add(imagePanel);
        }

        public void setImage(Image image) {
            imagePanel.setImage(image);
        }

        public void addRefreshListener(ActionListener listener) {
            Timer timer = new Timer(1000 / 60, listener);
            timer.start();
        }
    }
