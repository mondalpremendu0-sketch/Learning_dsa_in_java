public class Test{
  public static void main(String[] args) {
   
   //1. Question no - 1
    int p = 2, q = 5;
    int exp1 = (p * q / p);
    int exp2 = (p * (q / p));

    System.out.print(exp1 + ", ");
    System.out.print(exp2);
    
   //2. Question no - 2
   
    int x = 200, y = 50, z = 100;

    if(x > y && y > z){
        System.out.println("Hello");
    }
    
    if(z > y && z < x){
        System.out.println("Java");
    }
    
    if((y+200) < x && (y+150) < z){
        System.out.println("Hello Java");
    }
    
   //3. Question no - 3
   
    int r, o, k;

    r = o = k = 2;
    
    r += o;
    o -= k;
    k /= (r + o);
    
    System.out.println(r + " " + o + " " + k);
       
   //4. Question no - 4
    int X = 9, Y = 12;
    int A = 2, B = 4, C = 6;
    
    int exp = 4/3 * (X + 34) + 9 * (A + B * C) + (3 + Y * (2 + A)) / (A + B*Y);
    
    System.out.println(exp);
   
   
   
   
   //5. Question no - 5
   
   
   
   
   
   
   
  }
}