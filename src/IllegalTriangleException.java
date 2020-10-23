import java.util.Scanner;

public class IllegalTriangleException {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        double side1 = inputSide(1);
        double side2 = inputSide(2);
        double side3 = inputLastSide(side1,side2);

        System.out.println("triangle perimetter: "+ (side1+side2+side3));


    }
    static boolean isTriangle(double side1,double side2,double side3){
        return !(side1 + side2 <= side3) && !(side2 + side3 <= side1) && !(side3 + side1 <= side2);
    }

    static double inputLastSide(double side1,double side2){
        double side3 = inputSide(3);
        if(!isTriangle(side1,side2,side3)){
            System.out.println("ko phai la tam giac!\nhay nhap lai canh 3");
            side3 = inputLastSide(side1,side2);
        }
        return side3;
    }


    static double inputSide(int a){
        double side = 0;
        try {
            System.out.println("Enter side"+a+":");
            side = Double.parseDouble(input.nextLine());
            if (side <= 0) {
                System.out.println("side must be greater than 0");
                side = inputSide(a);
            }
        } catch (Exception e) {
            System.out.println("Need enter a number! ");
            side = inputSide(a);
        }
        return side;
    }
}
