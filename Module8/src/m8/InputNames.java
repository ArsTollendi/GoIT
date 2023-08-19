package m8;

public class InputNames   {
    public static void InputName (Shape shape) {
       shape.getName();
    }
}
class GraphicableTest{
    public static void main(String[] args) {

            Circle circle =new Circle();
            Quad quad=new Quad();
            Triangle triangle= new Triangle();
            Pyramid pyramid =new Pyramid();
            Trapezium trapezium=new Trapezium();
            Shape[] s= new Shape[]{circle,quad,triangle,pyramid,trapezium};
        for (var item:s) {
           InputNames.InputName(item);
        }
    }
}
