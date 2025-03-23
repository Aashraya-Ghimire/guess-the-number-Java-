import java.util.*;
public class guess{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in); 
        int num=1+(int)(100*Math.random());
        int times=10;
        System.out.println("You have "+ times+" times to guess the number");
        System.out.println("A number is between 1 and 100");
        for (int i = 1; i <=times; i++) {
          System.out.print("Enter the number that you have guessed:");
          int gues=obj.nextInt();
          if(gues==num){
            System.out.println("Congratulation you have guess the number "+num);
            return;
          }
          else if(num>gues){
            System.out.println("The number is greater than "+ gues);
          }
          else{
            System.out.println("The number is smaller than "+ gues);
          }
        }
         System.out.println("Sorry you guess wrong number. The number is "+num);
        
    }
}