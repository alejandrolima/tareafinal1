/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.projectduck;

import bo.com.projectduck.Interface.Implementation.FlyNoWayImpl;
import bo.com.projectduck.Interface.Implementation.QuackImpl;

/**
 *
 * @author Alejandro
 */
public class MallarDuck extends Duck{
    
    public MallarDuck() {
        iFlyBahavior = new FlyNoWayImpl();
        iQuackBehavior = new QuackImpl();
    }
    
    @Override
    public void  display(){
        System.out.println("I´m a real Mallar Duck");
    }   
}
