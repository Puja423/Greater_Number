import java.util.*;
public class GreaterNumber {
    public static void main(String[] args) {
        CheckGreaterNumber();
    }
    public static  void  CheckGreaterNumber(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter Your first Number");
        int first_num=sc.nextInt();
        System.out.println("Please Enter Your Second Number");
        int sec_num = sc.nextInt();

        if(first_num > sec_num){
            System.out.println( first_num+ "is greater than "+sec_num);
        }
        else{
            System.out.println( sec_num+ "is greater than "+first_num);

        }
    }
}
