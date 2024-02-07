
package Component;

/**
 * @author Juan Diego Sánchez Rentería 
 * ID: 00000233013
 */
public class Beverage_HouseBlend implements Beverage 
{
    String name;
    String description;
    Double cost;
    
    public Beverage_HouseBlend(String name, String description, Double cost)
    {
        this.name = name;
        this.description = description;
        this.cost = cost; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public void setCost(Double cost) {
        this.cost = cost;
    }
    
  

    @Override
    public String decorate() {
        return this.toString();
    }
    
    @Override
    public String toString()
    {
        return "Café de "+this.name+", tipo de café: "+this.description+", precio:"+this.cost;
    };    
}
