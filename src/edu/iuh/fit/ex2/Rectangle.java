/*
 * @ (#) Rectangle.java       1.0     Aug 28, 2024
 * Copyright (c) 2024    IUH. All rights reserved.
 */
package edu.iuh.fit;
/*
 * @description:
 * @author: Le Van Quang
 * @date: Aug 28, 2024
 * @version: 1.0
 */
public class Rectangle {
    private double length;
    private double width;


    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }


    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }


    public double getArea() {
        return length * width;
    }


    public double getPerimeter() {
        return 2 * (length + width);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}