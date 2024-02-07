/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.practicadecoratoras233013;

import Component.Beverage_DarkRoast;
import Decorator.Decorator_Chocolate;
import Decorator.Decorator_Soy;

/**
 * @author Juan Diego Sánchez Rentería 
 * ID: 00000233013
 */
public class PracticaDecoratorAS233013 {

    public static void main(String[] args) 
    {
        
        Beverage_DarkRoast bvr = new Beverage_DarkRoast("Juan","Café Negro",3.99);
        Decorator_Chocolate dc = new Decorator_Chocolate(bvr,"Chocolate",3,0.99);
        System.out.println(dc.decorate());
        
        Decorator_Soy ds = new Decorator_Soy(bvr,"Soya",2,1.5);
        System.out.println(ds.decorate());
    }
}
