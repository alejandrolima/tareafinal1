/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.projectduck.Interface.Implementation;

import bo.com.projectduck.Interface.IQuackBehavior;

/**
 *
 * @author Alejandro
 */
public class QuackImpl implements IQuackBehavior{

    
    @Override
    public void quack() {
        System.out.println("quack QuackImpl ");
    }
    
}
