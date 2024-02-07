package Decorator;

import Component.Beverage;

/**
 * @author Juan Diego Sánchez Rentería 
 * ID: 00000233013
 */
public class Decorator_Chocolate  extends Decorator
{
    /**Clase que implementa la clase abstracta de Decorator, con la cual 
     * podemos añadir ciertas propiedades a la otra clase que estemos referenciando, 
     * en este caso las bebidas tendrán algún aditamento.
     */
     
    public Decorator_Chocolate(Beverage beverage,String decoratorName,int amount,Double extraCost)
    {
        super(beverage,decoratorName,amount,extraCost);
    };
    
    @Override
    public String decorate()
    {
        beverage.setDescription(decorateDescription());
        beverage.setCost(decorateCost());
        return beverage.decorate();        
    };
    
    public String decorateDescription()
    {
        String previousDescription = beverage.getDescription();
        return previousDescription+". Extra de "+this.decoratorName+", cantidad = "+this.amount;
    };
    
    public Double decorateCost()
    {
        Double previousCost = beverage.getCost();
        return previousCost + totalExtraCharge();
    };
    
}