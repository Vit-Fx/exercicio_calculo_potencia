package exercicio_calculo_potencia_VitoriaFelix;

import java.util.Scanner;
//Faça um programa que receba um número e calcule a sua potência de 0 a 15.

public class Exercicio_calculo_potencia_VitoriaFelix 
{

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double num, potencia, result;
        
        System.out.println("Digite um número:");
        num = entrada.nextDouble();
        
        potencia = 0;
                
        while (potencia <= 15)
        {
            result = Math.pow(num,potencia);
            System.out.println(num + " elevado a " + potencia + " é igual a: " + result);
            potencia++;
        }
    }    
}
