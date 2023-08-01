import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        int[] numbers={1,2,3,4,5,6,7,8,9};
        for(int i :numbers){
            sum=sum+numbers[i];
            System.out.println("Sum is:"+sum);
        }

    }
}