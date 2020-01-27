/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.projectduck.Interface.Implementation;

import bo.com.projectduck.Interface.IFlyBahavior;

/**
 *
 * @author Alejandro
 */
public class FlyWithWingsImpl implements IFlyBahavior{

    @Override
    public void fly() {
        System.out.println("Fly FlyWithWings() ");
    }
    
}
