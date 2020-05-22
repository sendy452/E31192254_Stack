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

        //"Do" untuk melakukan perintah yang pertama kasli dijalankan sebelum melanjutkan ke perulangan while
        do {
            System.out.println("~~~~~~~~~~~~~~MAIN MENU~~~~~~~~~~~~~");
            System.out.println("1. PUSH Item");
            System.out.println("2. POP Item");
            System.out.println("3. Keluar Program");
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan pilihan menu : ");
            pilih = input.next();
            
            //Pilihan menu dalam Program Stack, dimana tiap menu mengambil dari Class Stack yang diberi nama objek baru disini sebagai result
            if ("1".equalsIgnoreCase(pilih)) {                                  //Menu input/Push
                System.out.print("Masukkan kata yang akan ditambahkan : ");
                data = input.next();
                result.Push(data);
            } else if ("2".equalsIgnoreCase(pilih)) {                           //Menu Pop/hapus data
                result.Pop();
            } else if ("3".equalsIgnoreCase(pilih)) {                           //Menu keluar dari program
                System.exit(0);
            } else {
                System.out.println("Pilihan tidak ada");                        //Output yang keluar apabila salah memasukkan pilihan menu
            }
            result.Display();   //Menampilkan isi dari array Stack
        } while (pilih != null);    //Perulangan terjadi sampai inputan pilihan menu/pilih bernilai tidak kosong atau salah input              
    }
}
