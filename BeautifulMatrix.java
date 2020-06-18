import java.util.Arrays;
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] a=new int[5][5];

        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                a[i][j]=s.nextInt();
            }
        }

       int currentRow=0;
       int currentColumn=0;
        for(int i=0;i <5; i++)
        {
            for(int j = 0;j < 5; j++)
            {
                if(a[i][j]==1){
                    currentRow=i;
                    currentColumn=j;
//                    a[i][j]=0;
//                    a[2][2]=1;
                    break;
                }
            }
        }
        System.out.println(Math.abs(currentRow-2)+Math.abs(currentColumn-2));

//        for(int z = 0; z <5; z++)
//        {
//            for(int y = 0; y < 5; y++)
//            {
//                System.out.print(a[z][y]);
//            }
//            System.out.println();
//        }
        s.close();
    }
}
