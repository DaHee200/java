class coordinate {
    
        public int[] solution(int[][] v) {
        //     int[] answer = new int[2];
        // for(int i=0;i<answer.length;i++){
        //      if(v[0][i]==v[1][i]){
        //          System.out.println(v[0][i]==v[1][i]);
        //         answer[i] = v[2][i];
        //     }else if(v[0][i]==v[2][i]){
        //          System.out.println(v[0][i]==v[2][i]);
        //         answer[i] = v[1][i];
        //     }else if(v[1][i]==v[2][i]){
        //          System.out.println(v[1][i]==v[2][i]);
        //         answer[i] = v[0][i];
        //     }
    
        //     }
        // return answer;
            

            int[] answer = new int[2];
            answer[0] = v[0][0]^v[1][0]^v[2][0];
            System.out.println(answer[0] = v[0][0]^v[1][0]^v[2][0]);
            answer[1] = v[0][1]^v[1][1]^v[2][1];
    
            return answer;
        }

        
}
