import java.util.Scanner;
public class Kadai {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("戦艦ゲーム");

        int [][] arr = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};

        Random rnd = new Random();
        int value = rnd.nextInt(5);
        System.out.println("value");

        if(arr == 1){
            System.out.println("いる！よって波高し");
        }else if(arr==0){
            System.out.println("いない");

        }
    }
}