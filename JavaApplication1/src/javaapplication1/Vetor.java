package javaapplication1;
import java.io.*;
import javax.swing.JOptionPane;

public class Vetor {
public static void main(String[] args) {
    int []v1;
    
   int v2 [];
   
   int [] v3 = new int [4];
   
   v3 [0] = 2;
   
   System.out.println (v3 [0]);
   System.out.println (v3 [2]);
   
   v3 [1] =  Integer.parseInt (JOptionPane.showInputDialog ("Digite um inteiro"));
   
   JOptionPane.showMessageDialog (null , v3 [1]);
   
   System.out.println (v3.length);
   
   v3 [0]= 2;
   v3 [1]= 3;
}
    
}
