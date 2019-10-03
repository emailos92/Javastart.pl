package pl.javastart.app;

import pl.javastart.data.Point;
import pl.javastart.logic.PointLogic;

public class PointApp {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        PointLogic pointLogic = new PointLogic();

        for (int i = 0; i < 40; i++) {
            if (i < 10) {
                pointLogic.addX(point);
            } else if (i < 20) {
                pointLogic.addY(point);
            } else if (i < 30) {
                pointLogic.minusX(point);
            } else {
                pointLogic.minusY(point);
            }
            pointLogic.showPoint(point);
        }
    }
}
