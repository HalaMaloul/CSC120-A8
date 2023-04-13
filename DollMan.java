import java.util.ArrayList;
/**
 * sub class for superhero class
 */
public class DollMan extends SuperHero {

    public int heroSize;
/**
 * constructor for a dollman
 * @param name
 * @param speed
 * @param strength
 * @param canFly
 * @param hasSheild
 * @param energyLevel
 * @param item
 * @param itemSize
 * @param heroSize
 */
    public DollMan(String name,int speed,int strength,boolean canFly,boolean hasSheild,int energyLevel,String item,int itemSize,int heroSize){
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
        this.heroSize=heroSize;
    }   
    /**
     * shrink method that checks if the hero size is more than 1 then he shrinks to 1 
     */
    public Number shrink(){
        if(this.heroSize>1){
        heroSize=1;}
        else{
            System.out.println(this.name +" is already small! ");
        }
        return heroSize;
    }
    /**
     * grow method that checks if the hero size is less than 100 then it grows to a 100
     */
    public Number grow(){
        if (this.heroSize<100){
        heroSize=100; }
        else{
            System.out.println(this.name +" is already huge! ");
        }
        return heroSize;
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
                System.out.println(this.name+" Doesn't have the energy to fly to the ");
            return false;
            }
    }
public static void main(String[] args) {
    DollMan Myhero= new DollMan("Butterfly",4,60,true,true,10,"rock",9,200);
    Myhero.grab("rock");
    // // Mybug.drop("ro");
    // Mybug.walk("north");
    // Mybug.rest();
    // Mybug.rest();
    Myhero.undo();
    Myhero.grow();
   
    
}
}
