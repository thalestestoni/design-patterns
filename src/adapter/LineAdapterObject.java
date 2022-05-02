package adapter;

public class LineAdapterObject implements Shape {
    private final Line line;

    public LineAdapterObject() {
        this.line = new Line();
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        line.drawLine(x1, y1, x2, y2);
    }
}
