package apresentacao;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Painel extends JPanel{
    private static final long serialVersionUID = 1L;

    public void paintComponent(Graphics g){
       
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 1024, 500); // Céu

        g.setColor(Color.GREEN);
        g.fillRect(0, 500, 1024, 268); // Chão



        g.setColor(Color.orange);
        g.fillOval(850,50,120, 120); // ao redor do sol
        g.setColor(Color.yellow);
        g.fillOval(870,70,80, 80);// Sol

        g.setColor(Color.black);
        g.drawRect(100, 580, 50,100);// Frente da casa

        g.drawLine(100, 580, 125, 530);
        g.drawLine(150, 580, 125, 530);// Telhado da frente da casa 

        g.drawLine(150,680,300, 630); 
        g.drawLine(300,530,300,630); //Lateral da casa
        g.drawLine(150,580,300,530);


        g.drawLine(300,530,270,490);
        g.drawLine(125,530,270,490); //telhado da lateral da casa


        g.setColor(Color.BLACK);  //Boneco cabeçudo
        g.fillOval(650, 600, 20,20); // Cabeça 
        g.drawLine(660,620, 660,670); // Tronco
        g.drawLine(630,630, 690,630); //Braço
        g.drawLine(660,670, 630,700); //Perna esquerda
        g.drawLine(660,670, 690,700); // Perda direita 
    }
}
