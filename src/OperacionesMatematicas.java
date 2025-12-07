import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OperacionesMatematicas extends JFrame {
    private JTextField txtValor1, txtValor2, txtResultado;
    private JButton btnSumar, btnRestar, btnMultiplicar, btnDividir;

    public OperacionesMatematicas() {
        setTitle("Operaciones Matemáticas");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        txtValor1 = new JTextField();
        txtValor2 = new JTextField();
        txtResultado = new JTextField();
        txtResultado.setEditable(false);

        btnSumar = new JButton("Sumar");
        btnRestar = new JButton("Restar");
        btnMultiplicar = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");

        add(new JLabel("Valor 1:"));
        add(txtValor1);
        add(new JLabel("Valor 2:"));
        add(txtValor2);
        add(new JLabel("Resultado:"));
        add(txtResultado);

        add(btnSumar);
        add(btnRestar);
        add(btnMultiplicar);
        add(btnDividir);

        // Acción de botones
        ActionListener listener = e -> {
            try {
                double v1 = Double.parseDouble(txtValor1.getText());
                double v2 = Double.parseDouble(txtValor2.getText());
                double res = 0;

                if (e.getSource() == btnSumar) res = v1 + v2;
                else if (e.getSource() == btnRestar) res = v1 - v2;
                else if (e.getSource() == btnMultiplicar) res = v1 * v2;
                else if (e.getSource() == btnDividir) res = v1 / v2;

                txtResultado.setText(String.valueOf(res));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese solo números válidos");
            }
        };

        btnSumar.addActionListener(listener);
        btnRestar.addActionListener(listener);
        btnMultiplicar.addActionListener(listener);
        btnDividir.addActionListener(listener);

        setVisible(true);
    }

    public static void main(String[] args) {
        new OperacionesMatematicas();
    }
}
