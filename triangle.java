package shape;

public class triangle {
    double base,hiegt;
    public void getData(double temp1,double temp2)
    {
        base=temp1;
        hiegt=temp2;
    }
    public double ar()
    {
        return((1.0/2.0)*(base*hiegt));
    }

}
