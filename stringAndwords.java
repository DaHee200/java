import java.util.*;

class stringAndwords {
    // public int solution(String s) {
    //     int answer = 0;
    //     String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    //     String[] num = {"0", "1", "2", "3", "4", "5","6","7","8","9"};
    //     for(int i=0; i<str.length; i++){
    //         s = s.replace(str[i], num[i]);
    //     }

    //     answer = Integer.parseInt(s);
    //     return answer;
    // }
    public static void main(String[] args) {
        NumberStringWord numberStringWord = new NumberStringWord();
        String s = "1zerotwozero3";
        int res = numberStringWord.solution(s);
        System.out.println("res = " + res);
    }
    public int solution(String s) {
        int answer = 0;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Map<String, Integer> map = new HashMap<>();
        
        int i=0;
        for(String a : arr){
            map.put(a, i++);
        }
        for(String a: arr){
            s = s.replace(a, map.get(a).toString());
        }
    
    answer = Integer.valueOf(s);
    return answer;

    }
}
