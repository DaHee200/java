public class algorithm02 {
    
    public static void main(String[] args){

        int[]arr = new int[100];


        arr[1] = 1;
        arr[2] = 2;

        for(int i =3; i <= 10; i++ ) {
            
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.print(arr[i-1] + arr[i-2]);
    }
    
}

