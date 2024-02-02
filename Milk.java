/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author hp
 */
public class Milk extends Beverage_decorator{
    
    
    Beverag beverag;
    

    public Milk(Beverag beverag) {
        this.beverag=beverag;
    }
    
     public String getdescreption(){
        return beverag.getdescreption()+"milk";
    }
    
   
   


    @Override
    double coast() {
      return beverag.coast()+9.9;
    }
    
}
