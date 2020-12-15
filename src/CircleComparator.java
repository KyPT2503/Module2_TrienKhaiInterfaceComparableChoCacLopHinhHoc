import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle circle, Circle t1) {
        if(circle.getRadius()>t1.getRadius()) return 1;
        else if(circle.getRadius()<t1.getRadius()) return -1;
        return 0;
    }
}
