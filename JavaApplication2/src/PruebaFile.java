// Fig. 17.4: PruebaFile.java
// Demostracio de la clase File.
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class PruebaFile extends JFrame
   implements ActionListener {

   private JTextField campoEntrada;
   private JTextArea areaSalida;
   
   // configurar GUI
   public PruebaFile()
   {
      super( "Prueba de la clase File" );

      campoEntrada = new JTextField( "Escriba aqui el nombre del archivo o directorio" );
      campoEntrada.addActionListener( this );
      areaSalida = new JTextArea();

      ScrollPane panelDesplazable = new ScrollPane();
      panelDesplazable.add( areaSalida );

      Container contenedor = getContentPane();
      contenedor.add( campoEntrada, BorderLayout.NORTH );
      contenedor.add( panelDesplazable, BorderLayout.CENTER );

      setSize( 400, 400 );
      setVisible( true );

   }
