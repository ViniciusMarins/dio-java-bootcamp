/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência!");
        int number = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Por favor, digite a agência!");
        String agency = sc.nextLine();
        
        System.out.println("Por favor, digite o nome!");
        String client_name = sc.nextLine();
        
        System.out.println("Por favor, digite o saldo!");
        Double balance = sc.nextDouble();
        
        sc.close();
        
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque. \n"
        ,client_name,agency,number,balance);
    }
    
}
