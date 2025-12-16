 class CircleArea {
    double area(int radius) {
        return Math.PI * radius * radius;
    }
    
    double area(float radius) {
        return Math.PI * radius * radius;
    }
}
class MethodOverloading {
    public static void main(String args[]) {
        CircleArea c = new CircleArea();
        double result1 = c.area(20.0f);
        double result2 = c.area(10);  
        System.out.println("The area of circle (float radius 20.0): " + result1);
        System.out.println("The area of circle (int radius 10): " + result2);
    }
}
