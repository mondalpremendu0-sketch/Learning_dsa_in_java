
public class func {
    //Function Overloading---
    //Func name same and return type but no of parameters and type change...
    public static int sum(int a,int b){
        return a + b;
    }
    public static int sum(int a,int b,int c){
        return a + b + c;
    }

    //parameter type...
    public static int prod(int a,int b){
        return a * b;
    }
    public static float prod(float a,float b){
        return a * b;
    }





    public static void main (String[] args){
        System.out.println(sum(5, 4));
        System.out.println(sum(5, 2,2));

        System.out.println(prod(2,3));
        System.out.println(prod(2.3f, 2.7f));


    }
    
}
