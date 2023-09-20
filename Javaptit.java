package javaptit;
import java.util.Scanner;

public class Javaptit {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int n = s.length(), sum = 0, check = 1;
            for(int i = 0; i < n; i++){
                sum += s.charAt(i) - '0';
                if(s.charAt(i) != s.charAt(n - i - 1)){
                    check = 0;
                    break;
                }
                if(s.charAt(i) != '2' && s.charAt(i) != '4' && s.charAt(i) != '6' && s.charAt(i) != '8' && s.charAt(i) != '0'){
                    check = 0;
                    break;
                }
            }
            if(check == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}