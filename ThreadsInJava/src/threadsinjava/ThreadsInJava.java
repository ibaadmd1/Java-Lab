/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadsinjava;

/**
 *
 * @author Ibaad Mohammed
 **/

        
public class ThreadsInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        
        Thread2 t2 = new Thread2();
        t2.start();
    }   
}
