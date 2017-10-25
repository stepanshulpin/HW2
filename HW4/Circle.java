package HW4;

public class Circle implements Comparable<Circle> {

    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public int compareTo(Circle c) {
        if (this.radius<c.radius) return -1;
        else {
            if (this.radius>c.radius) return 1;
            else {
                return 0;
            }
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        return color != null ? color.equals(circle.color) : circle.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Сircle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }

    public double getArea(){
        return Math.PI*radius*radius;

    }


}
