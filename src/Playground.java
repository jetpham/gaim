public class Playground {

    private double area;
    public Playground(double area) {
        this.area = area;
    }

    public void addArea(double newArea) {
        this.area += newArea;
    }

    public double getArea() {
        return this.area;
    }

    public boolean isTrue(boolean value) {
        if (value == true) {
            return true;
        } else {
            return false;
        }
    }
}
