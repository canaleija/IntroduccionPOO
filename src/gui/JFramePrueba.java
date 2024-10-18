package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class JFramePrueba extends JFrame{
    private JTextField cajaTexto;
    private JButton botonA;
    private JButton botonB;

    public JFramePrueba (){
        setSize(80, 150);
        this.botonA = new JButton("Boton A");
        this.botonB = new JButton("Boton B");
        this.cajaTexto = new JTextField("None");
        // definir el layout
        setLayout(new GridLayout(3,1));
        add(this.cajaTexto);
        add(this.botonA);
        add(this.botonB);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(rootPaneCheckingEnabled);

    }
}
