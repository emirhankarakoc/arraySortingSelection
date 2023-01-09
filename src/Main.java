import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]dizi = new int[n];
        int gecici=0;
        int i = 0;
        for(i = 0;i<n;i++){
            System.out.print("dizinin"+""+ i+1+". elemanini giriniz.\t");
            dizi[i] = scanner.nextInt();
        }
        int min = dizi[0];
        for(i = 0;i<dizi.length;i++){
            for(int j = i+1;j<dizi.length;j++){
                if(dizi[i]>dizi[j]){
                    gecici = dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=gecici;
                }
            }
        }
        for (i = 0;i<dizi.length;i++){
            System.out.println(dizi[i]);
        }












    }
}