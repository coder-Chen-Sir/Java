import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

class Weapon{
    int cost;
}
interface Movable{
    void move();
}
interface Attacker{
    void attack();
}
class Tank extends Weapon implements Movable,Attacker{
    public void move(){
        System.out.println("move方法调用！");
    }
    public void attack(){
        System.out.println("attack方法的调用！");
    }
}
public class Test1 {
    public static void main(String[] args){
        Tank tank = new Tank();
        tank.move();
        tank.attack();
    }
}
