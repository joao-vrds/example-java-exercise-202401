/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_2;

/**
 *
 * @author Jovro
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex_1_ponte {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        double[ ] temperatura = new double[12];
        float media = 0;
        
        
        for ( int i = 0; i <= 11; i++ ){
            boolean aux = true;
            System.out.println("Digite a temperatura " + (i + 1) + " (entre 4 e 10): ");
            
            while(aux){
                temperatura[i] = input.nextDouble();
            
                if (temperatura[i] < 4 || temperatura[i] > 10)
                    { System.out.print("Valor inválido. Tente novamente.\n "); }
                else
                    { aux = false; }
            }
        }
         for (int i = 0; i <= 11; i++){
            media += temperatura[i];
        }
        media /= temperatura.length;
        System.out.print("A média de hoje das temperaturas é: " +  df.format(media) + "º C");
       
        input.close();
    }
}
