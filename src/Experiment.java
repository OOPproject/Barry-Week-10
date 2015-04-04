/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.ImageIcon;

/**
 *
 * @author Evan
 */
public class Experiment {
    private String name;
    private String description;
    private ImageIcon diagram;
    
    public Experiment(){
        name = new String();
        description = new String();
        diagram = new ImageIcon();
    }

    public ImageIcon getDiagram() {
        return diagram;
    }

    public void setDiagram(ImageIcon diagram) {
        this.diagram = diagram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
