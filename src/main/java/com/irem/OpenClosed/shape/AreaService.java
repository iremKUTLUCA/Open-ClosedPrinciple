package com.irem.OpenClosed.shape;

import java.util.List;

public class AreaService<List> {
    public double calculateArea(java.util.List<Shape> shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }

}
