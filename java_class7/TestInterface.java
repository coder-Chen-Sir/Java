interface rec_Area_Peri{
    int getArea();
    int getPerimeter();
}
class Rectangle implements rec_Area_Peri{
    int width,length;
    Rectangle(int w,int l){
        width = w;
        length = l;
    }
   public int getArea(){
        return width * length;
    }
    public int getPerimeter(){
        return 2 * (width + length);
    }
}
public class TestInterface {
    public static void main(String[] srgs){
        Rectangle rect = new Rectangle(10,20);
        System.out.println("矩形面积=" + rect.getArea());
        System.out.println("矩形周长=" + rect.getPerimeter());
    }
}
