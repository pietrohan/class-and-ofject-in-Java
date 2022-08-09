import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập chiều rộng : ");
        double width1 = sc.nextDouble();
        System.out.println(" nhập chiều dài: ");
        double height1 = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width1,height1);
        System.out.println(" hình chữ nhật của bạn là: \n"+ rectangle.display());
        System.out.println(" chu vi hình chứ nhật là : "+rectangle.getPerimeter());
        System.out.println(" diện tích hình chứ nhật là "+rectangle.getArea());

    }
}
