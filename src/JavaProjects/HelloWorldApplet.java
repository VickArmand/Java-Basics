/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProjects;

import java.applet.Applet;
import java.awt.Graphics;
/**
 *
 * @author VICKFURY
 */
public class HelloWorldApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        
    }
    public void paint(Graphics g) {
            // TODO start asynchronous download of heavy resources
            g.drawString("Hello World", 25,50);
        }
    // TODO overwrite start(), stop() and destroy() methods
}
