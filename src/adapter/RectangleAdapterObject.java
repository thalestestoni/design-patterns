package adapter;

public class RectangleAdapterObject extends Rectangle implements Shape {
    private final Rectangle rectangle;

    public RectangleAdapterObject() {
        this.rectangle = new Rectangle();
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        rectangle.drawRectangle(x1, y1, x2, y2);
    }
}
