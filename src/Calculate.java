public class Calculate {
    public static void printMassage(){
        System.out.println("Pedí Número, pero no un String");
    }
    public static void printMethod(double num1, double num2, double sum, String str){
        String result = sum + " y esto "+ (sum < 0 ? "negativo" : "positivo") + " Número";
        System.out.print(num1 + str + num2 +" " +"= " + result);
    }
    public static void ResultPlus(double num1, double num2, double sum, String string){
        sum = num1 +num2;
        printMethod(num1,num2,sum,string);
    }
    public static void ResultMinus(double num1, double num2, double sum, String string){
        sum = num1 - num2;
        printMethod(num1,num2,sum,string);
    }
    public static void ResultDivision(double num1, double num2, double sum, String string){
        sum = num1 - num2;
        printMethod(num1,num2,sum,string);
    }
    public static void ResultMultiplication(double num1, double num2, double sum, String string){
        sum = num1 - num2;
        printMethod(num1,num2,sum,string);
    }
    public static void ResultReturn(double num1, double num2, double sum, String string){
        sum = num1 % num2;
        printMethod(num1,num2,sum,string);
    }
    static int strCheck(String s1){
        int count = 0;
        for(int i = 0; i<s1.length(); i++) {
            count++;
        }
        return count;
    }
    
    public static void compareLogic(double num1,double num2,double result,String s1){
        int count = strCheck(s1);
        if(s1.contains("+") && count == 1){
            Calculate.ResultPlus(num1,num2,result,s1);
        }else if(s1.contains("-") && count == 1){
            Calculate.ResultMinus(num1,num2,result,s1);
        }else if(s1.contains("/") && count == 1){
            Calculate.ResultDivision(num1,num2,result,s1);
        }else if(s1.contains("*") && count == 1) {
            Calculate.ResultMultiplication(num1,num2,result,s1);
        }else if(s1.contains("%") && count == 1) {
            Calculate.ResultReturn(num1,num2,result,s1);
        }else if(count > 1){
            System.out.println("La cadena debe contener solo 1 carácter.");
        } else {
            System.out.println("Escribir solo operación matemática");
        }
    }
}
