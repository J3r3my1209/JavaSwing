import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Intereses extends JFrame {
    public Intereses() {
        setTitle("Selección de Intereses");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Seleccione sus intereses:");
        JCheckBox prog = new JCheckBox("Programación");
        JCheckBox redes = new JCheckBox("Redes");
        JCheckBox bd = new JCheckBox("Base de Datos");
        JCheckBox diseno = new JCheckBox("Diseño");
        JCheckBox seg = new JCheckBox("Seguridad Informática");

        JButton procesar = new JButton("Procesar selección");
        procesar.addActionListener(e -> {
            StringBuilder seleccion = new StringBuilder("Seleccionaste: ");
            if (prog.isSelected()) seleccion.append("Programación ");
            if (redes.isSelected()) seleccion.append("Redes ");
            if (bd.isSelected()) seleccion.append("Base de Datos ");
            if (diseno.isSelected()) seleccion.append("Diseño ");
            if (seg.isSelected()) seleccion.append("Seguridad Informática ");
            JOptionPane.showMessageDialog(this, seleccion.toString());
        });

        add(label);
        add(prog); add(redes); add(bd); add(diseno); add(seg);
        add(procesar);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Intereses();
    }
}
