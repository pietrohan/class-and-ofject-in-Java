package BuildClassQuadraticEquatinon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập a: ");
        double a1 = sc.nextDouble();
        System.out.println("nhập b: ");
        double b1 = sc.nextDouble();
        System.out.println("nhập c: ");
        double c1 = sc.nextDouble();

        BuildClassQuadraticEquation buildClassQuadraticEquation = new BuildClassQuadraticEquation(a1,b1,c1);
if (buildClassQuadraticEquation.getDiscriminant()>0){
    System.out.println(" phương trình có hai nghiệm: " + buildClassQuadraticEquation.getRoot1()+ " và "+ buildClassQuadraticEquation.getRoot2());
} else if (buildClassQuadraticEquation.getDiscriminant()<0) {
    System.out.println(" phương trình vô nghiệm ");
}else {
    System.out.println(" phương trình có nghiệm kép là: "+buildClassQuadraticEquation.getRoot2());
}
    }
}
