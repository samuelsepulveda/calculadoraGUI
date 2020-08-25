package guis;

// package que contiene la Calculadora para la dependencia
import modelo.Calculadora;

// packages requeridos para uso de JFrame y los eventos
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCalculadora extends JFrame  {

    // Atributos de la ventana, son elementos Java Swing
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumarButton;
    private JButton limpiarButton;
    private JButton salirButton;
    private JLabel labelNum1;
    private JLabel labelNum2;
    private JLabel labelResultado;
    private JPanel panel;



   public  VentanaCalculadora() {
       JPanel panel = new JPanel();

       JLabel labelNum1 = new JLabel();
       labelNum1.setText("Numero 1: ");

       JLabel labelNum2 = new JLabel();
       labelNum2.setText("Numero 2: ");

       JLabel labelResultado = new JLabel();
       labelResultado.setText("Resultado: ");

       JTextField textField1 = new JTextField(10);

       JTextField textField2 = new JTextField(10);

       JButton sumarButton = new JButton();
       sumarButton.setText("Sumar");

       // Se agregan los elementos al panel
       panel.add(labelNum1);
       panel.add(textField1);
       panel.add(labelNum2);
       panel.add(textField2);
       panel.add(labelResultado);
       panel.add(sumarButton);

       // El panel se agrega con todos su elementos a la ventana
       this.add(panel);

       // Otras caracaterísticas de la ventana
       // Configirar su tamaño inicial y que se detenga la app al salir
       setSize(600,400);
       setDefaultCloseOperation(EXIT_ON_CLOSE);

       // Implementación de la Interface ActionListener para el boton sumarButton
       sumarButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                   /*
                    Se puede apreciar la dependencia con clase Calculadora
                    OJO con parser a INT, nol olvidar que los contenidos de los Textfield son String
                   */
                   Calculadora calculadora = new Calculadora (Integer.parseInt (textField1.getText ()) , Integer.parseInt (textField2.getText ()));
                   int result = calculadora.sumar();
                   labelResultado.setText("Resultado: "+ result);
           }
       });
   }

}
