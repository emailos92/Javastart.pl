package pl.javastart.logic;

import pl.javastart.data.Point;

public class PointLogic {

    public void addX(Point p){
        p.setX(p.getX() + 1);
    }

    public void minusX(Point p){
        p.setX(p.getX() - 1);
    }

    public void addY(Point p){
        p.setY(p.getY() + 1);
    }

    public void minusY(Point p){
        p.setY(p.getY() - 1);
    }

    public void showPoint(Point p){
        System.out.println("X: " + p.getX() + ", Y: " + p.getY());
    }
}
