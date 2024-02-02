/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

/**
 *
 * @author hp
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Beverag b1=new Dark();
        System.out.println(b1.getdescreption());
        System.out.println(b1.coast());
        
        b1=new Soy(b1);
        System.out.println(b1.getdescreption());
        System.out.println(b1.coast());
        
        b1=new Milk(b1);
        System.out.println(b1.getdescreption());
        System.out.println(b1.coast());
        
        
    
        
        
    }
    
}
