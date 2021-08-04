// 백준 / 10870 / java / 피보나치 수 5
//문제 설명
// 숫자 n이 주어지면 주어진 횟수(n) 만큼 피보나치 수를 만들어라

// //1번 방법
// import java.util.*;
// class fibonacciFunction {

//         public static void main(String[] args) {
//             Scanner in = new Scanner(System.in);
//             int number = in.nextInt();
            
//             System.out.println(fibonacci(number));

//         }


//         static int fibonacci(int number){
//             if(number == 0) return 0;
//             if(number == 1) return 1;
            
//             return fibonacci(number-1) + fibonacci(number-2);

//         }
    
// }


//2번 방법
// BufferedReader 은 문자열을 반환하기 때문에 Integer.parseInt() 메소드를 통해 String 에서 int 형으로 변환
//시간 80ms 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class fibonacciFunction {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int number = Integer.parseInt(br.readLine());
 
		System.out.println(fibonacci(number));

    }

    static int fibonacci(int number){
        if(number == 0) return 0;
        if(number == 1) return 1;
        
        return fibonacci(number-1) + fibonacci(number-2);

    }
}

//3번 방법
