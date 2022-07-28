
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("---------------GIẢI PHƯƠNG TRÌNH BẬC HAI--------------");
        PhuongTrinhBac2 phuongTrinhBac2 = new PhuongTrinhBac2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        double a = scanner.nextDouble();
        while (a<0){
            System.out.println("Nhập lại a, a phải là số lớn hơn 0: ");
            a = scanner.nextDouble();
        }
        phuongTrinhBac2.setA(a);
        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();
        phuongTrinhBac2.setB(b);
        System.out.println("Nhập vào c: ");
        double c = scanner.nextDouble();
        phuongTrinhBac2.setC(c);
        double delta = phuongTrinhBac2.getDiscriminant();
        System.out.println("delta === "+delta);
        if(delta<0){
            System.out.println("Phương trình vô nghiệm");
        } else if(delta==0){
            System.out.println("Phương trình có nghiệm kép: ");
            double x = phuongTrinhBac2.getRoot1();
            System.out.println("x = "+x);
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            System.out.println("x1 = "+ phuongTrinhBac2.getRoot1());
            System.out.println("x2 = "+ phuongTrinhBac2.getRoot2());
        }
    }
}
