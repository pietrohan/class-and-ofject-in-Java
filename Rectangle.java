public class Rectangle {
    double width, height;
    public Rectangle(){
    }

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }
    public double getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return (height+width)*2;
    }
    public String display(){
        return "Rectangle{ " + " width = "+ width+" , height = "+ height + "}";
    }

}
