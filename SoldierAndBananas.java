import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String[] s = e.nextLine().split(" ");
        int k = Integer.parseInt(s[0]); //need k dollars
        int n = Integer.parseInt(s[1]); //has n dollars
        int w = Integer.parseInt(s[2]); //want to buy w bananas

        int total=0;
        for (int i=1;i<=w;i++){
            total +=i*k;
        }

        int canBuyBananas=total-n;
        if (canBuyBananas<0){
            System.out.println("0");
        }else System.out.println(canBuyBananas);

    }
}
