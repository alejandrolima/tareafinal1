/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.projectduck;

import bo.com.projectduck.Interface.Implementation.FlyNoWayImpl;
import bo.com.projectduck.Interface.Implementation.SquackImple;

/**
 *
 * @author Alejandro
 */
public class DomesticDuck extends Duck{

    public DomesticDuck() {
        iFlyBahavior = new FlyNoWayImpl();
        iQuackBehavior = new SquackImple();
    }

    
    @Override
    public void display() {
        System.out.println("I´m Domestic Duck");        
    }
    
}
