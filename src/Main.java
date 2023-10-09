import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sumArray(scanner);
    }

    public static void sumArray(Scanner scanner) {
        System.out.println("Nhập số hàng mảng A: ");
        int rowA = Integer.parseInt(scanner.nextLine());
        System.out.println( "Nhập số cột mảng A: ");
        int columnA = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số hàng mảng B: ");
        int rowB = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột mảng B: ");
        int columnB = Integer.parseInt(scanner.nextLine());

        int[][] arrA = new int[rowA][columnA];
        int[][] arrB = new int[rowB][columnB];
        int[][] resultArr = new int[rowA][columnA];

        if (rowA!=rowB || columnA!=columnB) {
            System.out.println("Không thể thực hiện");
        } else {
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.println("Mời bạn nhập giá trị dòng thứ "+i+" cột thứ "+j +" của ma trận A");
                    arrA[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.println("Mời bạn nhập giá trị dòng thứ "+i+" cột thứ "+j +" của ma trận B");
                    arrB[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            System.out.println("Mảng A");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.print(+arrA[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println("Mảng B");
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.print(arrB[i][j]+"\t");
                }
                System.out.println();
            }
            for (int i = 0; i < rowA ; i++) {
                for (int j = 0; j < columnA; j++) {
                    resultArr[i][j] = arrA[i][j] +arrB[i][j];
                }
            }
            System.out.println("Tổng 2 mảng A + B");
            for (int i = 0; i < rowA ; i++) {
                for (int j = 0; j < columnA; j++){
                    System.out.print(resultArr[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}
