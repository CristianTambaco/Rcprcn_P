package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formUsuario {
    private JTabbedPane tabbedPane1;
    private JList list1;
    private JList list2;
    private JPanel formUsuario;
    private JButton visualizarButton;
    private JButton btnSalir;
    private JFrame frame;
    private JFrame loginFrame;

    public formUsuario(JFrame loginFrame){
        this.loginFrame = loginFrame;
        visualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list1.setModel(conexion.obtenerProductos());
            }
        });
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int opcion = JOptionPane.showConfirmDialog(frame,
                        "¿Estás seguro que deseas salir?",
                        "Confirmar salida",
                        JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    // Si el usuario presiona "Sí", cerrar la ventana
                    frame.dispose();
                    // Mostrar ventana  login
                    form1 Login1 = new form1();
                    Login1.ventanaLogin();


                }

            }
        });
    }




    public void ventanaUsuario(){
        frame = new JFrame("Usuario");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(formUsuario);
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        }
}
