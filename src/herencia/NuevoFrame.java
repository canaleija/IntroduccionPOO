package herencia;
import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JButton;
import java.awt.GridLayout;

public class NuevoFrame  extends JFrame{
    
    private JButton boton;
    private JButton boton2;

    public NuevoFrame(String titulo, int w, int h){
        setLayout(new GridLayout(1,2));
        this.boton = new JButton("Texto Boton");
        this.boton2 = new JButton("Texto Boton 2");
        this.boton.setBackground(new Color(23,45,134));
        this.boton2.setBackground(new Color(255,165,0));
        add(this.boton);
        add(this.boton2);
        setTitle(titulo);
        setSize(w,h);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
