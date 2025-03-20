package apresentacao;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visao extends JFrame { // 1-Importa o JFrame 
    
    //Propridades da classe
    private static final long serialVersionUID = 1L;

    private JPanel objPanel = new Painel();

    //Métodos principal de execução do programa
    public static void main(String [] args){
        new Visao().setVisible(true);
    } 
    //Método construtores da classe
    public Visao(){
        //Configuração da janela
        setTitle("Minha primeira janela java !");
        setSize(1024, 768);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Configuração do painel 
        setContentPane(objPanel);
    }
}
