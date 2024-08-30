package edu.iuh.fit;

public class TestRectangle {
    public TestRectangle() {
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.5, 5.0);

        try {
            r1.setLength(-10.5);
        } catch (IllegalArgumentException var4) {
            IllegalArgumentException e = var4;
            System.out.println("Error setting length of r1: " + e.getMessage());
        }

        System.out.println("Length of r1: " + r1.getLength());
        System.out.println("Length of r2: " + r2.getLength());
        System.out.println("Area of r2: " + r2.getArea());
    }
}
