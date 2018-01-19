package DecoratorPattern;

public class RedShapeDecorator extends ShaperDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
    }

    private  void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color:Red");
    }
}
