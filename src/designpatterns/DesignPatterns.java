/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

/**
 *
 * @author Flavia
 */
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Car Factory
            CarFactory cf = new CarFactory();
            
            //Making a car by car factory
            Car c = cf.makeCar("Gol");
            
            //Making optionals by Optional builder
            Optional optional = new BuilderOptional()
                    .ar()
                    .direcaoHidraulica()
                    .build();
            //Making car rental with car, days and optionals.
            CarRental cr = new CarRental(c, 10, optional);
            
            //Get total price if rental is finished.
            cr.getTotalPrice();
            
            //Set the state of rental to finished.
            cr.finishRental();
            
            //Get total price if rental is finished.
            cr.getTotalPrice();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
