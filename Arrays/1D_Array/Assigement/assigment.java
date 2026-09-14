
public class assigment {
    
    public static boolean Check_Dublicate(int arr[]){

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        //Question 1: Gven an integer array nums, return true if any value appears at east twice in the
                        //array, and return false if every element is distinct.

        int numbers[] = {3,3,3,1,1,3,2,3,4};
        System.out.println(Check_Dublicate(numbers));


    }
    
}
