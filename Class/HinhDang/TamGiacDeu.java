package Class.HinhDang;

import Class.Triangle.Triangle;

public class TamGiacDeu extends Triangle {

    public TamGiacDeu() {
    }

    public TamGiacDeu(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }

    //@Override
    public double getArea() {
        return ((getSide1() * getSide1()) * Math.pow(3, 0.5)) / 4;
    }

    @Override
    public String toString() {
        return "Tam giác đều" + "\n" +
                "Chiều dài cạnh 1 = " + getSide1() + "\n" +
                "Chiều dài cạnh 2 = " + getSide2() + "\n" +
                "Chiều dài cạnh 3 = " + getSide3();
    }
}
