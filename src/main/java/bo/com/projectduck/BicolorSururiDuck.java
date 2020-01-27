/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.projectduck;

import bo.com.projectduck.Interface.Implementation.FlyWithWingsImpl;
import bo.com.projectduck.Interface.Implementation.QuackImpl;

/**
 *
 * @author Alejandro
 */
public class BicolorSururiDuck extends Duck{

    public BicolorSururiDuck() {    
        iFlyBahavior = new FlyWithWingsImpl();
        iQuackBehavior = new QuackImpl();
    }
    
    @Override
    public void display() {
        System.out.println("I´m a Bicolor Sururi Duck");  
    }
    
}
