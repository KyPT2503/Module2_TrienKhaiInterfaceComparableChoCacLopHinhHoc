import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Square();
        shapes[1]=new Circle();
        shapes[2]=new Rectangle();
        for (Shape shape :
                shapes) {
            if (shape instanceof Square) ((Square) shape).howToColor();
        }
    }
}
