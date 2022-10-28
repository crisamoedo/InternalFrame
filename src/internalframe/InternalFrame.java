/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package internalframe;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;

/**
 *
 * @author a21cristinaaf
 */
public class InternalFrame extends JFrame{

    
    JMenuBar barra = new JMenuBar();
    
    JMenu menu1 = new JMenu("Archivo");
    JMenu menu2 = new JMenu("Formato");
    JMenu menu2_1 = new JMenu("Color");
    JMenu menu2_2 = new JMenu("Tipo de letra");
  
    JRadioButtonMenuItem negro, azul, rojo, verde, serif, monospaced, sans;
    
    ButtonGroup colores= new ButtonGroup();
    ButtonGroup tipoLetra= new ButtonGroup();
    JCheckBoxMenuItem negrita, cursiva;
    
    JTextArea fondo= new JTextArea();
    Font f= new Font("Arial", Font.BOLD, 52);
    
    
    public InternalFrame(){
        

        this.setSize(600, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setJMenuBar(barra);
        
        fondo.setBackground(Color.CYAN);
        fondo.setText("Texto de ejemplo");
        
        fondo.setFont(f);
        this.add(fondo);
        
        menu1.add(new JMenuItem("Acerca de..."));      
        menu1.add(new JMenuItem("Salir"));
        menu1.add(new JMenuItem("Nuevo"));
        
        negro = new JRadioButtonMenuItem("Negro");
        azul = new JRadioButtonMenuItem("Azul");
        rojo = new JRadioButtonMenuItem("Rojo");
        verde = new JRadioButtonMenuItem("Verde");
        
        colores.add(negro);
        colores.add(azul);
        colores.add(rojo);
        colores.add(verde);
        
        menu2_1.add(negro);
        menu2_1.add(azul);
        menu2_1.add(rojo);
        menu2_1.add(verde);
        
        menu2.add(menu2_1);
        
        
        serif = new JRadioButtonMenuItem("Serif");
        monospaced = new JRadioButtonMenuItem("Monospaced");
        sans = new JRadioButtonMenuItem("SansSerif");
        
        tipoLetra.add(serif);
        tipoLetra.add(monospaced);
        tipoLetra.add(sans);
        
        menu2_2.add(serif);
        menu2_2.add(monospaced);
        menu2_2.add(sans);
        
        negrita= new JCheckBoxMenuItem("Negrita");
        cursiva= new JCheckBoxMenuItem("Cursiva");
        menu2_2.add(negrita);
        menu2_2.add(cursiva);
        
        menu2.add(menu2_2);
        
        barra.add(menu1);
        barra.add(menu2);
                

    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        InternalFrame nuevaVentana= new InternalFrame();
        nuevaVentana.setVisible(true);
        

        
    }
    
}
