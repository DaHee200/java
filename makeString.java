//프로그래머스

public class makeString {
    class Solution {
        public String solution(String s) {
      
              String answer = "";
              int cnt = 0;
              String[] array = s.split("");
      
              for(String i : array) {
                  cnt = i.contains(" ") ? 0 : cnt + 1;
                  System.out.println("cnt : "+ cnt);
                  answer += cnt%2 == 0 ? i.toLowerCase() : i.toUpperCase(); 
                  System.out.println("answer : " + answer);
              }
            return answer;
        }
      }
}
