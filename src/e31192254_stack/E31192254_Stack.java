/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192254_stack;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sendy
 */
public class E31192254_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String data, pilih;
        Stack result = new Stack();
        System.out.println("====================================");
        System.out.println("------STACK PROGRAM INPUT KATA------");
        System.out.println("====================================");
        System.out.println("");

        do {
            System.out.println("~~~~~~~~~~~~~~MAIN MENU~~~~~~~~~~~~~");
            System.out.println("1. PUSH Item");
            System.out.println("2. POP Item");
            System.out.println("3. Keluar Program");
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan pilihan menu : ");
            pilih = input.next();
            
            if ("1".equalsIgnoreCase(pilih)) {
                System.out.print("Masukkan kata yang akan ditambahkan : ");
                data = input.next();
                result.Push(data);
            } else if ("2".equalsIgnoreCase(pilih)) {
                result.Pop();
            } else if ("3".equalsIgnoreCase(pilih)) {
                System.exit(0);
            } else {
                System.out.println("Pilihan tidak ada");
            }
            result.Display();
        } while (pilih != null);
    }
}
