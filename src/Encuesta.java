import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Encuesta extends JFrame {
    public Encuesta() {
        setTitle("Encuesta");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Pregunta 1
        JLabel pregunta1 = new JLabel("¿Deseas seguir una maestría?");
        JRadioButton si1 = new JRadioButton("Sí");
        JRadioButton aveces1 = new JRadioButton("A veces");
        JRadioButton no1 = new JRadioButton("No");
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(si1); grupo1.add(aveces1); grupo1.add(no1);

        JPanel panel1 = new JPanel();
        panel1.add(pregunta1);
        panel1.add(si1); panel1.add(aveces1); panel1.add(no1);

        // Repite para preguntas 2 y 3...
        // (puedes duplicar el bloque anterior cambiando el texto)

        JButton enviar = new JButton("Enviar respuestas");
        enviar.addActionListener(e -> {
            String resumen = "Pregunta 1: " + (si1.isSelected() ? "Sí" : aveces1.isSelected() ? "A veces" : "No");
            JOptionPane.showMessageDialog(this, resumen);
        });

        add(panel1);
        add(enviar);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Encuesta();
    }
}
