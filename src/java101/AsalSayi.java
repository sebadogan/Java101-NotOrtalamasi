package java101;

public class AsalSayi {
    public static void main(String[] args) {

        String asal="";
        int n = 100;
        for (int i = 2; i <= n; i++) {
            int sayac = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac ==2){
                asal=asal+i+" ";
            }
        }
        System.out.println(asal);
    }
}
