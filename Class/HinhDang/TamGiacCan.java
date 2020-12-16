package Class.HinhDang;

import Class.Triangle.Triangle;

public class TamGiacCan extends Triangle {
    private int h;

    public TamGiacCan() {
    }

    public TamGiacCan(int side1, int side2, int side3, int h) {
        super(side1, side2, side3);
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    //@Override
    public double getArea() {
        if (getSide1() > getSide2() && getSide1() > getSide3()) {
            return 0.5 * h * getSide1();
        } else if (getSide2() > getSide1() && getSide2() > getSide3()) {
            return 0.5 * h * getSide2();
        } else {
            return 0.5 * h * getSide3();
        }
    }

    @Override
    public String toString() {
        return "Tam giác cân" + "\n" +
                "Chiều dài cạnh 1 = " + getSide1() + "\n" +
                "Chiều dài cạnh 2 = " + getSide2() + "\n" +
                "Chiều dài cạnh 3 = " + getSide3();
    }
}
