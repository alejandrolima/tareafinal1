/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.projectduck;

import bo.com.projectduck.Interface.IFlyBahavior;
import bo.com.projectduck.Interface.IQuackBehavior;
import sun.misc.PerformanceLogger;

/**
 *
 * @author Alejandro
 */
public abstract class Duck {
    IFlyBahavior iFlyBahavior;
    IQuackBehavior iQuackBehavior;

    public Duck() {
    }

    public IFlyBahavior getiFlyBahavior() {
        return iFlyBahavior;
    }

    public void setiFlyBahavior(IFlyBahavior iFlyBahavior) {
        this.iFlyBahavior = iFlyBahavior;
    }

    public IQuackBehavior getiQuackBehavior() {
        return iQuackBehavior;
    }

    public void setiQuackBehavior(IQuackBehavior iQuackBehavior) {
        this.iQuackBehavior = iQuackBehavior;
    }
    
    
    
    public void performQuark(){
       iQuackBehavior.quack();
    }
    
    public void swing (){
        System.out.println(" swimming Duck ");
    }
    
    public abstract void display();
}
