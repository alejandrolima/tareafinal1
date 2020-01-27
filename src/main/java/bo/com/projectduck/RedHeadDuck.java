/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.projectduck;

import bo.com.projectduck.Interface.Implementation.FlyWithWingsImpl;
import bo.com.projectduck.Interface.Implementation.MuteQuackImpl;

/**
 *
 * @author Alejandro
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        iFlyBahavior = new FlyWithWingsImpl();
        iQuackBehavior = new MuteQuackImpl();        
    }

    
    
    @Override
    public void display() {
        System.out.println("I´m redhead Duck ");
    }
    
}
