/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author hp
 */
public class Dark extends Beverag{
    
    public Dark() {
        this.descreption="Dark";
    }    
    @Override
    double coast() {
      this.coast=10.5;
       return coast;
    }
    
}
