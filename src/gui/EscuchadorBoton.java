package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EscuchadorBoton implements ActionListener {

    private JFramePrueba frame;

    public EscuchadorBoton(JFramePrueba frame){
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        if(btn.getText().equals("Boton A")){
            frame.getCajaTexto().setText(frame.getCajaTexto().getText()+" pablito");
        }
        if(btn.getText().equals("Boton B")){
            frame.getCajaTexto().setText(frame.getCajaTexto().getText()+" reprobe ecuaciones");
        }
    }
    
}
