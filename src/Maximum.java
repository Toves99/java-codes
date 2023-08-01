import java.util.Scanner;

public class Maximum implements Numbers {
    int x,y,z;
    int number;
    @Override
    public void maximumNumber() {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter X please::");
        x=input.nextInt();
        System.out.println("Enter X please::");
        y=input.nextInt();
        System.out.println("Enter X please::");
        z=input.nextInt();
        if(x>y){
            System.out.println("X is the maximum value");
        } else if (y>x) {
            System.out.println("Y is the maximum value");
        } else if (x>z) {
            System.out.println("x is the maximum value");
        }
        else if (y>z) {
            System.out.println("y is the maximum value");
        }
        else if (z>x) {
            System.out.println("z is the maximum value");
        }
        else if (z>y) {
            System.out.println("z is the maximum value");
        }
        else {
            System.out.println("Error occurred");
        }
    }
    public static void main(String[] args) {
        Maximum num=new Maximum();
        num.maximumNumber();
    }


}
