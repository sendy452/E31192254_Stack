/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192254_stack;

/**
 *
 * @author Sendy
 */
public class Stack {
    private boolean empty,full;
    private int pos, max_data = 5;
    private String teks[] = new String[max_data];

    public void Stack() {
        full = false;
        empty = true;
        pos = 0;
    }
    
    public boolean isFull(){
        return full;
    }
    public boolean isEmpty(){
        return empty;
    }
    
    public void Push(String data){
        if (!isFull()) {
            teks[pos++]=data;
            empty=false;
            if(pos==max_data){
                full=true;
            }
            System.out.println("Data sukses ditambahkan");
        }else{
            System.out.println("Isi stack sudah penuh");
        }
        return;
    }
    
    public String Pop(){
        String x = null;
        if(!isEmpty()){
            x = teks[--pos];
            full = false;
            System.out.print("Data yang di POP adalah " + teks[pos]);
            System.out.println("");
            teks[pos] = null;
            if (pos == 0) {
                empty = true;
                System.out.println("Isi Stack kosong");
            }else{
                System.out.println("Data sudah dihapus");
            }
        }else{
            System.out.println("Isi Stack kosong");
        }
        return x;
    }
    
    public void Display(){
        System.out.print("Isi Stack saat ini adalah : ");
        for (int i = 0; i < pos; i++) {
            System.out.print(teks[i] + " | ");
        }System.out.println("\n");
    }
}
