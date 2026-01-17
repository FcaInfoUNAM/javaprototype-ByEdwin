public class GraphicElement implements Cloneable {
    private String shape;
    private String color;
    private int x, y;

    // Expensive constructor (simulated with a Thread.sleep)
    public GraphicElement(String shape, String color, int x, int y) {
        this.shape = shape;
        this.color = color;
        this.x = x;
        this.y = y;
        try {
            // Simulate expensive setup (e.g., loading resources, complex calculations)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Expensive GraphicElement constructor called");
    }

    @Override
    public GraphicElement clone() {
        try {
            return (GraphicElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

     @Override
    public String toString() {
        return String.format("GraphicElement [shape=%s, color=%s, x=%d, y=%d]", shape, color, x, y);
    }
    
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}