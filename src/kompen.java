import java.util.Scanner;
public class kompen {
    
    public static void main(String[] args) {
        int alpa = 0;
        int totalAlpa = 0;
        int semester;
        boolean kondisi;
        Scanner sc = new Scanner(System.in);
        
            System.out.println("masukkan jumlah jam pelajaran");
            int n = sc.nextInt();
            int [] jampel = new int[n];
        for (int i = 0; i < jampel.length; i++) {
            System.out.println("masukkan jam alpa : ");
            alpa = sc.nextInt();
            totalAlpa += alpa; 
        }
         System.out.println("apakah mengerjakan semester ini?");
         kondisi = sc.nextBoolean();
         if (!kondisi) {
            if (totalAlpa <=0) {
                System.out.println("jam alpa harus lebih dari 0");
            }
            System.out.println("Masukkan semester berapa mengerjakan : ");
            semester = sc.nextInt();
            for (int i = 0; i < semester; i++) {
                totalAlpa = totalAlpa*2;
            }
             System.out.println("jumlah kompen yang harus ditanggung: "+totalAlpa);
         }
         else{
          System.out.println("jumlah kompen yang harus ditanggung: "+totalAlpa);
         }
        sc.close();

    }
}

