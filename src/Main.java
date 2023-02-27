import anonymus.Circle;
import anonymus.*;

public class Main {

    static void renderShape(shape shape){

    }
    public static void main(String[] args) {
        Shapeform shape = new Shapeform();
        Shapeform circle = new Circle();

        Shapeform otherShape = new Shapeform(){
            @Override
            public void render() {
                System.out.println("Other Shape");
            }
        };
        shape otherShape2 = () -> System.out.println("Other Shape 2");


        shape.render();
        circle.render();
        otherShape.render();
        otherShape2.render();





        Countable countable = (int a) -> System.out.println();

        Sum sum = (x, z) ->  x - z;
        int t = sum.sum(2, 5);
        System.out.println(t);



        renderShape(() -> System.out.println("Other Shape maybe not a Shape"));
        renderShape(circle);
    }
}