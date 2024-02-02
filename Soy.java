/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author hp
 */
public class Soy  extends Beverage_decorator{
    
     
    Beverag beverag;
    

    public Soy(Beverag beverag) {
        this.beverag=beverag;
    }
    
    @Override
    public String getdescreption(){
        return beverag.getdescreption()+"soy";
    }
    
 
    @Override
    double coast() {
      return beverag.coast+5.45;
    }
    
}
