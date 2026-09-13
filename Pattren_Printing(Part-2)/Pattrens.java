
public class Pattrens {
    public static void main(String[] args){
    
      //HOLLOW RECTANGLE PATTREN.....
        int line = 4;
        int cols = 4;

        for (int i = 1; i <= line; i++) {

            for(int j = 1; j <= cols; j++){
                if(i == 1 || j == 1 || i == line || j == cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }

      //INVERTED & ROTATED HALF-PYRAMID.....

      for(int i =1; i <= line; i++){
        for(int j = 1; j <= line-i; j++){
            System.out.print(" ");

        }for(int j = 1; j <= i; j++){
            System.out.print("*");

        }

        System.out.println();

      }


     // INVERTED HALF-PYRAMID wŤth Numbers pattern...... 

     for(int i = 1; i <= 5; i++){

        for(int j = 1; j <= 5-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
     }

     //FLOYD'S TrŤangle pattern.......

     int a = 1;
     for(int i = 1; i <= 5; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(a);
            a++;
        }
        System.out.println();
     }

     //0-1 TrŤangle pattern.......
        // 1
        // 01
        // 101
        // 0101
        // 10101

     for(int i = 1; i <= 5; i++){
        
        for(int j = 1; j <= i; j++){
            if ((i+j) % 2 == 0) {
                System.out.print('1');
            }else{
                System.out.print('0');

            }
        }
        System.out.println();


     }

     // BUTTERFLY pattern .......

     //upper half
     for(int i = 1; i <= 5; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        for(int j = 1; j <= 2*5 - 2*i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
     }

     //lower half
     for(int i = 1; i <= 5; i++){
        
        for(int j = 1; j <= 5-i; j++){
            System.out.print("*");
        }
        for(int j = 1; j <= 2*i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= 5-i; j++){
            System.out.print("*");
        }

        System.out.println();
     }

     //SOLID RHOMBUS pattern.......

     for(int i = 1; i <= line; i++){
        for(int j = 1; j <= line-i;j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= cols; j++){
            System.out.print("*");
        }

        System.out.println();
     }

     //HOLLOW RHOMBUS........

     for(int i = 1; i <= line; i++){

        for(int j = 1; j <= line-i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= cols; j++){
           if (i == 1 || j == 1 || i == line || j == cols) {
                System.out.print("*");
           }else {
            System.out.print(" ");
           }

        }
        System.out.println();
     }


    // NUMBER PYRAMID pattern 
        // ----1 
        // ---2 2 
        // --3 3 3 
        // -4 4 4 4 
        // 5 5 5 5 5

    for(int i = 1; i <= 5; i++){
        for(int j = 1; j <= 5 - i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
 
 
    //PALINDROMIC Pattern wŤth Numbers pattern 
    //         1 
    //       2 1 2 
    //     3 2 1 2 3 
    //   4 3 2 1 2 3 4 
    // 5 4 3 2 1 2 3 4 5 

    for(int i = 1; i <= 5; i++){
        
        for(int j = 1; j <= 5-i; j++){
            System.out.print(" ");
        }

        for(int j = i; j >= 1; j--){
            System.out.print(j + " ");
        }
        for(int j = 2; j <= i; j++){
            System.out.print(j + " ");
        }

        System.out.println();
    }
 

 

    }
    
}
