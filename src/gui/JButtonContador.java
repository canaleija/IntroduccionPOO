package gui;

import javax.swing.JButton;

public class JButtonContador extends JButton {
    private int contador;

    public JButtonContador (){
        this.contador = 0;
        setText("0");
    }

    public void actualizar (){
        this.contador++;
        setText(""+this.contador);
    }

    public int getContador() {
        return contador;
    }
}
