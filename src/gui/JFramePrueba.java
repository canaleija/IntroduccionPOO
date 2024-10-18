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
        EscuchadorBoton pedrito = new EscuchadorBoton(this);
        this.botonA.addActionListener(pedrito);
        this.botonB = new JButton("Boton B");
        this.botonB.addActionListener(pedrito);
        this.cajaTexto = new JTextField("None");
        // definir el layout
        setLayout(new GridLayout(3,1));
        add(this.cajaTexto);
        add(this.botonA);
        add(this.botonB);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(rootPaneCheckingEnabled);

    }

    public JTextField getCajaTexto() {
        return cajaTexto;
    }

    public void setCajaTexto(JTextField cajaTexto) {
        this.cajaTexto = cajaTexto;
    }

    public JButton getBotonA() {
        return botonA;
    }

    public void setBotonA(JButton botonA) {
        this.botonA = botonA;
    }

    public JButton getBotonB() {
        return botonB;
    }

    public void setBotonB(JButton botonB) {
        this.botonB = botonB;
    }

    
}
