package TinhHinhHoc.Tinh_Cv_Dt;

import java.util.Scanner;

public class Main   {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean checkStop = false;

        do{
            showMenu();
            System.out.println("Enter your choice...");
            int choice = Integer.parseInt(sc.nextLine()); //tranh troi lenh
            switch (choice){
                case 1:
                    System.out.println("Longs:");
                    double cd = Double.parseDouble(sc.nextLine());
                    System.out.printf("Width:");
                    double cr = Double.parseDouble(sc.nextLine());
                    Rectangle hcn = new Rectangle(cd,cr);
                    System.out.println(hcn.toString());
                    break;
                case 2:
                    System.out.println("Square edge :");
                    double c = Double.parseDouble(sc.nextLine());
                    Square hv = new Square(c);
                    System.out.println(hv.toString());
                    break;
                case 3:
                    checkStop = true;
                    System.out.println("Bye");
                    break;
            }
        }while (checkStop == false); //true == false => false
    }
    private static void showMenu(){
        System.out.println("---MENU----");
        System.out.println("1.RECTANGLE");
        System.out.println("2.SQUARE");
        System.out.println("3.EXIT!");
    }
}
