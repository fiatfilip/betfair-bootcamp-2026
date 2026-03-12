package ro.digitalstack.betfair.session02.shapes;

public class Square extends Rectangle{
   // private double edge;

    public Square(double edge){
        super(edge, edge);
       // this.edge = edge;
    }

    public double getEdge(){
        return getLength();
    }
//    @Override
//    public double getArea() {
//        return edge * edge;
//    }

}
