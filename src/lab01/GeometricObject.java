package lab01;
public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
  
    /** Construct a default geometric object */
    protected GeometricObject() {
      dateCreated = new java.util.Date();
    }
  
    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
      dateCreated = new java.util.Date();
      this.color = color;
      this.filled = filled;
    }
  
    /** Return color */
    public String getColor() {
      return color;
    }
  
    /** Set a new color */
    public void setColor(String color) {
      this.color = color;
    }
  
    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() {
      return filled;
    }
  
    /** Set a new filled */
    public void setFilled(boolean filled) {
      this.filled = filled;
    }
  
    /** Get dateCreated */
    public java.util.Date getDateCreated() {
      return dateCreated;
    }
  
    @Override
    public String toString() {
      return "created on " + dateCreated + "\nColor: " + color +
        "\nFilled: " + filled;
    }
  
    /** Abstract method getArea */
    public abstract double getArea();
  
    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}

class Triangle extends GeometricObject {
  private double side1;
  private double side2;
  private double side3;

  protected Triangle(String color, boolean filled, double s1, double s2, double s3) {
    super(color, filled);
    this.side1 = s1;
    this.side2 = s2;
    this.side3 = s3;
  }

  public double getSide1() {
    return side1;
  }

  public double getSide2() {
    return side2;
  }

  public double getSide3() {
    return side3;
  }

  @Override
  public double getArea() {
    double semiPerimeter = (side1 + side2 + side3) / 2;
    return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
  }

  @Override
  public double getPerimeter() {
    return side1 + side2 + side3;
  }

  @Override
    public String toString() {
        // Calling super.toString() to include the GeometricObject details
        return "Triangle: " + super.toString() + 
               "\nSides: " + side1 + ", " + side2 + ", " + side3 + 
               "\nArea: " + getArea() + 
               "\nPerimeter: " + getPerimeter();
    }
}