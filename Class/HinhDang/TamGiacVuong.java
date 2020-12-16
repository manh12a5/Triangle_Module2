package Class.HinhDang;

import Class.Triangle.Triangle;

public class TamGiacVuong extends Triangle {

    public TamGiacVuong() {
    }

    public TamGiacVuong(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }

    public double getArea() {
        if (getSide1() > getSide2() && getSide1() > getSide3()) {
            return 0.5 * getSide2() * getSide3();
        } else if (getSide2() > getSide1() && getSide2() > getSide3()) {
            return 0.5 * getSide1() * getSide3();
        } else {
            return 0.5 * getSide1() * getSide2();
        }
    }

    @Override
    public String toString() {
        return "Tam giác vuông" + "\n" +
                "Chiều dài cạnh 1 = " + getSide1() + "\n" +
                "Chiều dài cạnh 2 = " + getSide2() + "\n" +
                "Chiều dài cạnh 3 = " + getSide3();
    }

}
