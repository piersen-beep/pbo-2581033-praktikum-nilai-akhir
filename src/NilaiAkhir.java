import java.util.Scanner;

public class NilaiAkhir {

    static final double BOBOT_PRAKTIKUM = 0.30;
    static final double BOBOT_TUGAS = 0.20;
    static final double BOBOT_MID = 0.20;
    static final double BOBOT_FINAL = 0.30;


    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

        System.out.print("Nilai Praktikum : ");
        double praktikum = input.nextDouble();

        System.out.print("Nilai Tugas : ");
        double tugas = input.nextDouble();

        System.out.print("Nilai Mid : ");
        double mid = input.nextDouble();

        System.out.print("Nilai Final : ");
        double finalNilai = input.nextDouble();

    double akhir = praktikum * BOBOT_PRAKTIKUM
            + tugas * BOBOT_TUGAS
            + mid * BOBOT_MID;

    //int akhir = nilaiPraktikum * 30/100 + nilaiTugas * 20/100 + nilaiMID * 20/100 + nilaiFinal * 30/100;

    akhir += finalNilai * BOBOT_FINAL;

        int dipotong = (int) akhir;

        long dibulatkan = Math.round(akhir);

        double selisih = akhir - dibulatkan;

        boolean lulus = akhir >= 60;

        System.out.println();
        System.out.println("===== NILAI AKHIR =====");
        System.out.println("Praktikum : " + praktikum + " (30%)");
        System.out.println("Tugas     : " + tugas + " (20%)");
        System.out.println("MID       : " + mid + " (20%)");
        System.out.println("Final     : " + finalNilai + " (30%)");

        System.out.println("Nilai akhir     : " + akhir);
        System.out.println("Dipotong (int)  : " + dipotong);
        System.out.println("Dibulatkan (round): " + dibulatkan);
        System.out.println("Selisih         : " + selisih);
        System.out.println("Lulus (>=60)    : " + lulus);
    }
}









