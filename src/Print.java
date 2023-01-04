import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Print {
    static BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
    static double number1;
    static double number2;
    static String info;
    public static void prtint1() {
        System.out.println("Tu calculadora está lista: ");
        try {
            System.out.print("Ingrese numero 1 -> ");
            number1 = Double.parseDouble(reader2.readLine());
            System.out.print("Ingrese numero 2 -> ");
            number2 = Double.parseDouble(reader2.readLine());
            System.out.print("Ingrese el método matemático (\"+\",\"-\",\"*\",\"/\",\"%\") -> ");
            info = reader2.readLine();
            Calculate.compareLogic(number1,number2,0,info);
        }
        catch(Exception e) {
            System.out.println("Pedí Número, pero no un String");
        }
    }

}
