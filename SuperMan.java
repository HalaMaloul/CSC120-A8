
import java.util.ArrayList;
// import java.util.Hashtable;
/**
 * sub class for superhero class
 */
public class SuperMan extends SuperHero {


/**
 * constructor for superman 
 * 
 * @param name
 * @param speed
 * @param strength
 * @param canFly
 * @param hasSheild
 * @param energyLevel
 * @param item
 * @param itemSize
 */
    public SuperMan (String name,int speed,int strength,boolean canFly,boolean hasSheild,int energyLevel,String item,int itemSize){
        this.name=name;
        this.speed=speed;
        this.strength=strength;
        this.canFly=canFly;
        this.hasSheild=hasSheild;
        this.energyLevel=energyLevel;
        this.itemSize=itemSize;
        items = new ArrayList<String>();
        items.add(item);
        grabbedItems=new ArrayList<String>();
        // Hashtable<String, String> inverse=new Hashtable<>();
        // inverse.put("shrink","grow");
        // inverse.put("grow","shrink");
        // inverse.put("grab","drop");
        // inverse.put("drop","grab");
        
        
        

        

        


    }
    /**
     *  super man can't shrink or grow but it gave an error when I didn't have those methods here
     */
    public Number shrink(){
        return 3;
    }
    public Number grow(){
        return 4;
    }

    /**
     * fly method checks if the energy level is more than 80 then the hero can fly!!!
     * @param x
     * @param y
     */
    public boolean fly(int x, int y){
        if (this.energyLevel>80){
            System.out.println(this.name+" is flying weeeeeeeeeeee  ");
            return true;}
            else{
                System.out.println(this.name+" Doesn't have the energy to fly ");
            return false;
            }
    }
      public static void main(String[] args) {
        SuperMan Mybug= new SuperMan("superman",4,60,true,true,10,"rock",9);
        Mybug.grab("rock");
        // // Mybug.drop("ro");
        // Mybug.walk("north");
        // Mybug.rest();
        // Mybug.rest();
        Mybug.undo();
       
        
    }
    
}
