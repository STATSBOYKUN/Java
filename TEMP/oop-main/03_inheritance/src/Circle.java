class Circle extends Shape {
    double radius;
    
    Circle(String color, double radius) {
       super(color);
       this.radius = radius;
    }
    
    double getArea() {
       return Math.PI * radius * radius;
    }
 }
 