import Class.HinhDang.TamGiacCan;
import Class.HinhDang.TamGiacDeu;
import Class.HinhDang.TamGiacVuong;
import Class.Triangle.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Nhập số từ bán phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính diện tích hình tam giác");
        System.out.print("Nhập cạnh 1: ");
        int size1 = scanner.nextInt();
        System.out.print("Nhập cạnh 2: ");
        int size2 = scanner.nextInt();
        System.out.print("Nhập cạnh 3: ");
        int size3 = scanner.nextInt();

        //Điều kiện để phân loại tam giác
        if (size1 == size2 && size1 == size3) {

            //Lấy phương thức tính diện tích ở lớp TamGiacDeu sang lớp Triangle
            Triangle triangle = new TamGiacDeu(size1, size2, size3);
            TamGiacDeu a = (TamGiacDeu) triangle;
            System.out.println(triangle.toString());
            System.out.println("Diện tích hình tam giác đều là: " + a.getArea());

        } else if (size1 == size2 || size1 == size3 || size2 == size3) {

            //Lấy phương thức tính diện tích ở lớp TamGiacCan sang lớp Triangle
            System.out.print("Nhập chiều cao tam giác: ");
            int h = scanner.nextInt();
            Triangle triangle1 = new TamGiacCan(size1, size2, size3, h);
            TamGiacCan b = (TamGiacCan) triangle1;
            System.out.println(triangle1.toString());
            System.out.println("Diện tích tam giác cân là: " + b.getArea());

        } else if (size1 * size1 > size2 * size2 + size3 * size3 ||
                size2 * size2 > size1 * size1 + size3 * size3 ||
                size3 * size3 > size1 * size1 + size2 * size2) {

            //Lấy phương thức tính diện tích ở lớp TamGiacVuong sang lớp Triangle
            Triangle triangle2 = new TamGiacVuong(size1, size2, size3);
            TamGiacVuong c = (TamGiacVuong) triangle2;
            System.out.println(c.toString());
            System.out.println("Diện tích tam giác vuông là: " + c.getArea());

        } else {
            System.out.println("Tam giac thường");
        }

    }
}
