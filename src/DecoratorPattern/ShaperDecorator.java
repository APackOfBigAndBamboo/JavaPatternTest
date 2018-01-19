package DecoratorPattern;

public abstract class ShaperDecorator implements Shape {
    protected Shape decoratedShape;

    public ShaperDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
