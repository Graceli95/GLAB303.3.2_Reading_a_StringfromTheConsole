import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(1);
        System.out.println(ch);



    }
}
