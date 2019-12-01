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
public class Finished implements State{

    @Override
    public void getTotalPrice(int days) {
        //Value of day: R$ 3,65
        //Tax: 0.3%
        double value;
        double tax = (days * 3.65) * 0.003;
        value = (days * 3.65) + tax;
        System.out.println("The value total: " + value);
    }
    
}
