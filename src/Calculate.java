public class Calculate {
    public static void printResultPlus(double num1, double num2, double sum, String str){
        sum = num1 +num2;
        System.out.print(num1 + str + num2 +" " +"= ");
        System.out.print(sum + " y esto "+ (sum < 0 ? "negativo" : "positivo") + " Número");
    }
    public static void printResultMinus(double num1,double num2, double sum, String string){
        sum = num1 - num2;
        System.out.print(num1 + string + num2 +" " +"= ");
        System.out.print(sum + " y esto "+ (sum < 0 ? "negativo" : "positivo") + " Número");
    }
    public static void printResultDivision(double num1,double num2, double sum, String string){
        sum = num1 - num2;
        System.out.print(num1 + string + num2 +" " +"= ");
        System.out.print(sum + " y esto "+ (sum < 0 ? "negativo" : "positivo") + " Número");
    }
    public static void printResultMultiplication(double num1,double num2, double sum, String string){
        sum = num1 - num2;
        System.out.print(num1 + string + num2 +" " +"= ");
        System.out.print(sum + " y esto "+ (sum < 0 ? "negativo" : "positivo") + " Número");
    }
    public static void printResultReturn(double num1,double num2, double sum, String string){
        sum = num1 % num2;
        System.out.print(num1 + string + num2 +" " +"= ");
        System.out.print(sum + " y esto "+ (sum < 0 ? "negativo" : "positivo") + " Número");
    }
    public static void compareLogic(double num1,double num2,double result,String s1){
        int count = 0;
        for(int i = 0; i<s1.length(); i++) {
            count++;
        }
        if(s1.contains("+") && count == 1){
            Calculate.printResultPlus(num1,num2,result,s1);
        }else if(s1.contains("-") && count == 1){
            Calculate.printResultMinus(num1,num2,result,s1);
        }else if(s1.contains("/") && count == 1){
            Calculate.printResultDivision(num1,num2,result,s1);
        }else if(s1.contains("*") && count == 1) {
            Calculate.printResultMultiplication(num1,num2,result,s1);
        }else if(s1.contains("%") && count == 1) {
            Calculate.printResultReturn(num1,num2,result,s1);
        }else if(count > 1){
            System.out.println("La cadena debe contener solo 1 carácter.");
        } else {
            System.out.println("Escribir solo operación matemática");
        }
    }
}
