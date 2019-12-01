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
public class Rented implements State{

    @Override
    public void getTotalPrice(int days) {
        System.out.println("The car is rented. Please change the state to finished to get the value of rent.");
    }
    
}
