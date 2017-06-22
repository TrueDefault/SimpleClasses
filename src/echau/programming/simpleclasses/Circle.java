package echau.programming.simpleclasses;

/**
 * Represents a circle.
 *
 * @author Eugene Chau
 * @version June 15, 2017
 */
public class Circle {
    private double radius;
    
    /**
     * Constructs a circle with a default radius of 0.
     */
    public Circle() {
        this.radius = 0;
    }
    
    /**
     * Constructs a circle with the specified radius.
     * 
     * @throws IllegalArgumentException If the radius is less than 0.
     */
    public Circle(final double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Negative radius: " + radius);
        }
        this.radius = radius;
    }
    
    /**
     * Calculates this circle's area with the formula <code>Area = \u03C0r^2</code>.
     * 
     * @return This circle's area.
     */
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
    /**
     * Calculates this circle's diameter with the formula <code>d = 2r</code>.
     * 
     * @return This circle's diameter.
     */
    public double diameter() {
        return this.radius * 2;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    /**
     * Sets this circle's radius.
     * 
     * @param radius The new radius.
     * @throws IllegalArgumentException If the radius is less than 0.
     */
    public void setRadius(final double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Negative radius: " + radius);
        }
        this.radius = radius;
    }
}
