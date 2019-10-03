package pl.javastart.app;

import pl.javastart.data.Point;
import pl.javastart.logic.PointLogic;

public class PointApp {

    private static final int ADD_X = 0;
    private static final int ADD_Y = 1;
    private static final int MINUS_X = 2;
    private static final int MINUS_Y = 3;

    public static void main(String[] args) {
        Point point = new Point(0, 0);
        PointLogic pointLogic = new PointLogic();

        int option = ADD_X;

        switch (option) {
            case ADD_X:
                pointLogic.addX(point);
                break;
            case ADD_Y:
                pointLogic.addY(point);
                break;
            case MINUS_X:
                pointLogic.minusX(point);
                break;
            case MINUS_Y:
                pointLogic.minusY(point);
                break;
            default:
                System.out.println("Podano błędną wartość");
        }
        pointLogic.showPoint(point);


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
