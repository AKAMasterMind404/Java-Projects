public class Wall {
    private double height;
    private double width;

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        height = height < 0 ? 0 : height;
        this.height = height;
    }

    public void setWidth(double width) {
        width = width < 0 ? 0 : width;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public Wall() {

    }

    public Wall(double width, double height) {
        this.height = height < 0 ? 0 : height;
        this.width = width < 0 ? 0 : width;
    }
}
