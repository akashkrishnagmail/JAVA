package shape;

public class circle {
    double radius,hight;
    public void getData(Double temp)
    {
        radius=temp;
    }
    public double area()
    {
        return((3.1427)*(2.0*radius)*(2.0*radius)/4.0);
    }

    
}
