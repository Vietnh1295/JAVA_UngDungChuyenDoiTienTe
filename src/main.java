import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner =new Scanner(System.in);
        final int RATE=23000;
        double USD=scanner.nextDouble();
        System.out.println("VND = "+USD/RATE);
    }
}
