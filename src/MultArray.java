public class MultArray {
    public static void main(String[] args) {
        int sum=0;
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for(int i=0; i< myNumbers.length;i++){
            for(int j=0;j<myNumbers[i].length;j++){
                sum=sum+myNumbers[i][j];
            }
            System.out.println("Sum is"+sum);
        }
        ;
    }
}
