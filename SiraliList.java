import java.util.Scanner;
import java.util.Arrays;
public class SiraliList {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
        System.out.print("Dizinin Boyutu:");
        int lenght=in.nextInt();
        int []arr=new int[lenght];
        System.out.println("Dizinin Elemanlarini Giriniz:");
        for (int i=0;i<lenght;i++)
        {
            System.out.print(i+1+".Elemani:");
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Siralama:");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
