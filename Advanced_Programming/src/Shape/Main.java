package Shape;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean checkStop = false; // biến điều kiện dừng vòng lặp.

        do {
            showMenu();
            System.out.println("Enter your choice...");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chieu dai: ");
                    double cd = Double.parseDouble(sc.nextLine());
                    System.out.println("Chieu rong: ");
                    double cr = Double.parseDouble(sc.nextLine());
                    HinhChuNhat hcn = new HinhChuNhat(cd, cr);
                    System.out.println(hcn.toString());
                    break;
                case 2:
                    System.out.println("Canh hinh vuong: ");
                    double c = Double.parseDouble(sc.nextLine());
                    HinhVuong hv = new HinhVuong(c);
                    System.out.println(hv.toString());
                    break;
                case 3:
                    checkStop = true;
                    System.out.println("Tạm biệt bạn nhé!");
                    break;
            }

        }while(checkStop == false);
    }

    private static void showMenu() {
        System.out.println("--- MENU ---");
        System.out.println("1. Hinh Chu Nhat");
        System.out.println("2. Hinh Vuong");
        System.out.println("3. Thoat!");
    }
}
