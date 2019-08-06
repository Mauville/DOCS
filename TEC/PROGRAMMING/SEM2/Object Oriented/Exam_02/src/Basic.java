class Basic extends Element {
    private double area;
    private String color;
    private double[] points;


    @Override
    double calculateArea(double[] data) {
        double totalarea = 0;
        for (double index : data) {
            totalarea += index;
        }
        return totalarea;
    }


    double getArea() {
        return area;
    }

    void setArea(double area) {
        this.area = area;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    double[] getPoints() {
        return points;
    }

    void setPoints(double[] points) {
        this.points = points;
    }
}
