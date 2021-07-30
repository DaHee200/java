// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// 1. U+L 값과 C배열의 합이 같아야 함 => 값이 다를 시에 "IMPOSSIBLE" 출력하기
// 2. C 배열의 각 인덱스 의 값을 계산하기 
// 3. C배열의 각 인덱스에 속해 있는 값대로 한 행마다 값을 배치하기
class Solution {
    public String solution(int U, int L, int[] C) {
        int num =0;
        String No = "IMPOSSIBLE";
        for(int i=0; i < C.length; i++){
            num += C[i];

        }
        if((U+L) != num){ 
            return No;
        }

        int[][] array;
        array = new int [0][0];

        for(int i=0; i < C.length; i++){
            if(C[i] == 2){
                L--;
                U--;
                array[0][i] = 1;
                array[1][i] = 1;
            }
            if(C[i] == 1){
                if(U >= L) {
                    U--;
                    array[0][i] = 1;

                }else{
                    L--;
                    array[1][i] =1;
                }
            }
            if (U ==0 && L == 0 ){
            return Arrays.toString(array);
            }
        }
        
     return  Arrays.toString(array);
    }
}
