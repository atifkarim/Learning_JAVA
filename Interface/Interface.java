/**
 * @Author: MD Atif Bin Karim
 * @Date:   01-01-1970 01:00:00
 * @Last Modified by:   MD Atif Bin Karim
 * @Last Modified time: 16-04-2023 16:18:43
 * @Brief: This file shows the interface property
 */
package Interface;

interface Area{
    int getArea(int width, int height);
}

interface Volume{
    double getVolume(int width, int height, int breadth);
}

class Square implements Area{
    public int getArea(int width, int height){
        return width * height;
    }
}

class Triangle implements Volume{
    public double getVolume(int width, int height, int breadth){
        return 0.5 * width * height * breadth;
    }
}

public class Interface {
    public static void main(String[] args) {
        Square sqr = new Square();
        int area_square = sqr.getArea(5,6);
        System.out.println("Area of square " + area_square);

        Triangle triangle = new Triangle();
        double tr_vol = triangle.getVolume(5,3,9);
        System.out.println("Volume of triangle " + tr_vol);
    }
}
