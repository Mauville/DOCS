abstract class Element {
   private String color;
   private double area;

   abstract double calculateArea(double[] data);

   abstract String getColor();

   abstract void setColor(String color);

   abstract double getArea();

   abstract void setArea(double area);
}
