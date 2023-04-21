package javaapplication1;
import java.io.*;
import javax.swing.JOptionPane;

public class BuscaValorValor {
    public static void main(String[] args) 
    {
        int [] v = {1, 2, 5, 4, 3};
        int valor = Integer.parseInt (JOptionPane.showInputDialog("Qual valor deseja buscar"));
        int i;
        for (i =0; i < v.length; i++)
        {
            if (v[i] == valor)
                break;
        }
            JOptionPane.showMessageDialog(null, i < v.length ? 
                    "Achou na posição " + i : "Não achou");
    }
    
}
