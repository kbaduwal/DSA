import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of items purchased: ");
        int number = scn.nextInt();

        System.out.print("Enter the total bill amount: ");
        double billAmount = scn.nextDouble();

        double discountPercentage = 0;
        if (number < 5) {
            discountPercentage=0;
        }else if(number<=9){
            discountPercentage = 0.1;
        }else if(number<=19){
            discountPercentage =  0.15;
        } else if (number<=29) {
            discountPercentage = 0.20;
        }else if(number>=30){
            discountPercentage =  0.25;
        }

        double discountAmount = billAmount * discountPercentage;
        double billAmountAfterDiscount = billAmount - discountAmount;

        System.out.println("Discount percentage offered: " + (discountPercentage * 100) + "%");
        System.out.println("Bill amount after discount: " + billAmountAfterDiscount);

    }
}
