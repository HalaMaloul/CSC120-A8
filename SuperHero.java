import java.util.ArrayList;
import java.util.Hashtable;
/**
* An abstract class SuperHero that implements the interface
*/

public abstract class SuperHero implements Contract {
 public int speed;
 public String name;
 public int strength  ;
 public boolean canFly;
 public boolean hasSheild;
 public int energyLevel;
 public int itemSize;
 public String itemType;
 public ArrayList<String> items;
 public ArrayList<String> grabbedItems;
 Hashtable<String, String> inverse;
 public String undoAction;

/**
 *  grabs an item 
 * @param item
 */
    public void grab(String item){
        /**checks if the item exists */
        if (items.contains(item)){ 
        /** checks if the superhero has a larger strength than the item size*/
            if (itemSize<strength){
                grabbedItems.add(item);
                energyLevel-=itemSize;
                System.out.println("I grabbed the "+ item +", I am very strong!");
              
            }
            else{         
                throw new RuntimeException("I guess I am not strong enough :(");}
          
        }
        else{         
            throw new RuntimeException("This item doesn't exist");}
          
          

        }
 
    
       
    /**
     * drops an item
     * @param item
     */
    public String drop(String item){
        /**
         * checks if the item was grabbed
         *  */
        if (grabbedItems.contains(item)){
            System.out.println( this.name  + " dropped the " + item);
        }
        else{ 
            throw new RuntimeException("I am not holding the item");
            
        }

        return item;       
    }
    /**
     * examins an item by grabbing it then dropping it 
     * @param item
     */
    public void examine(String item){
        
        this.grab(item);
        System.out.println("this is such an intresting "+item);
        this.drop(item);

      
    }

    /**
    * uses an item by examining it 
    *@param item
    */
    public void use(String item){
        this.examine(item);
    }
    

    /**
     * walks to a certian direction (checks if the energy level is above 0 first)
     * @param direction 
     */
    public boolean walk(String direction){
        if (this.energyLevel>0){
        System.out.println(this.name+" is walking to the "+direction);
        return true;}
        else{
            System.out.println(this.name+" Doesn't have the energy to walk to the "+direction);
        return false;
        }
    }

    public abstract boolean fly(int x, int y);

    public abstract Number shrink();
    
    public abstract Number grow();

    /**
     * rest method that increses the energy level to 100 if it was less than 30
     */
    public void rest(){

        if (this.energyLevel<30){
            this.energyLevel=100;
            System.out.println(this.name+" is resting and the energy level is now  "+this.energyLevel);}
            else{
                System.out.println(this.name+" has enough energy");
            }
        
    }
    /**
     * undo method prints out that me and the superhero are tired but we will work on this more later 
     */
    public void undo(){
        System.out.println(this.name+" is so tired  but he will work harder later ");
        
    }
    
    
}
