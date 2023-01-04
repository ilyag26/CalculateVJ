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
    public static void compareLogic(double num1,double num2,double result,String s1){
        if(s1.contains("+")){
            Calculate.printResultPlus(num1,num2,result,s1);
        }else if(s1.contains("-")){
            Calculate.printResultMinus(num1,num2,result,s1);
        }else if(s1.contains("/")){
            Calculate.printResultDivision(num1,num2,result,s1);
        }else if(s1.contains("*")) {
            Calculate.printResultMultiplication(num1,num2,result,s1);
        }else{
            System.out.println("Escribir solo operación matemática");
        }
    }
}
