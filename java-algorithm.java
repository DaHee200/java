"console": "integratedTerminal"

public class Recursion_Test {
    public static void main(String[] args) {
        Fucntion(5);
    }
    public static void Function(int num){

        if(num == 0){
            return;
        }
        else{
            System.out.pringln("반갑습니다.");
            Function(num-1);
        }
        
    }
}
