// METHODS

public class App {
    static void myMethod(){
        System.out.println("Hello!");
    }

    static void myMethod2(String fname){ //parameter
        System.out.println("Hello! " + fname);
    }

    static int sum(int x,int y){
        return x+y;
    }

    //method overloading
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }

    static int recursion(int k){
        if(k>0){
            return k + recursion(k-1);
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        myMethod();
        myMethod2("cihan"); //argument
        System.out.println(sum(5, 4));

        System.out.println("int: " + plusMethod(3, 2));
        System.out.println("double: " + plusMethod(3.2, 2.2));

        System.out.println(recursion(10));
    }
}
