package TAREAS.LayoutsJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaSwing extends JFrame
{
    private JLabel Etiqueta1;
    private JTextField txtGrados;
    private JButton Boton;
    private JLabel lblResultado;
    private FlowLayout layout;

    public VentanaSwing(String title) throws HeadlessException
    {
        super(title);
        this.setSize(800,600);
        layout = new FlowLayout();
        this.getContentPane().setLayout(layout);
        Etiqueta1 = new JLabel("Grados C.");
        this.getContentPane().add(Etiqueta1);
        txtGrados = new JTextField(10);
        this.getContentPane().add(txtGrados);
        Boton = new JButton("Convertir.");
        this.getContentPane().add(Boton);
        lblResultado = new JLabel("0.0 °F");
        this.getContentPane().add(lblResultado);
        this.Boton.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e) {
                double centigrados = Double.parseDouble(txtGrados.getText());
                double farenheit = (centigrados * 9.0/5.0) + 32.0;
                lblResultado.setText(farenheit + " °F.");
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Adios...");
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}
