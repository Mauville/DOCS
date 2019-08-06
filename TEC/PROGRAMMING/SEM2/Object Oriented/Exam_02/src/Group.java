class Group extends Element {
    private String color;
    private double area;
    private Basic[] basics;

    double calculateArea(double[] data) {
        double totalarea = 0;
        for (Basic currentBasic : basics ) {
            totalarea += currentBasic.getArea();
        }
        return totalarea;
    }

    String calculateColor(Basic[] basics) {
        String instanceColor = basics[1].getColor();
        for (Basic currentBasic : basics )
            if (instanceColor.equals(currentBasic.getColor())) {
                instanceColor = "Multiple";
                break;
            }
        return instanceColor;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    double getArea() {
        return area;
    }

    void setArea(double area) {
        this.area = area;
    }

    Basic[] getBasics() {
        return basics;
    }

    void setBasics(Basic[] basics) {
        this.basics = basics;
    }

}
