import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,toplam=0;
        Scanner oku=new Scanner(System.in);

        do{
            System.out.println("sayi giriniz: ");
            n=oku.nextInt();

            if(n%2==0 && n%4==0){
                toplam+=n;
            }

        }while (n>0);

        System.out.println("toplam ="+toplam);
    }
}