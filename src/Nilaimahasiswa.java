import java.util.Scanner;

public class Nilaimahasiswa {
    public static void main(String[] args){
        // objek user input
        Scanner input = new Scanner(System.in);
        // masukin nama dan nim
        System.out.print("Masukkan nama: ");
        String nama= input.nextLine();

        System.out.print("Masukkan nim: ");
        Integer nim = input.nextInt();

        // meminta memasukkan nilai - nilai 
        System.out.print("Masukkan Nilai Tugas Besar: ");
        double nialiTubes = input.nextDouble();

        System.out.print("Masukkan Nilai Quiz: ");
        double nilaiQuiz  = input.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        Nilai Nilai = new Nilai();
        double nilaiAkhir = Nilai.nilaiAkhir(nialiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);

        System.out.print("\nNama : " + nama);
        System.out.print("NIM : " + nim);
        System.out.print("Nilai  Matkul Pemograman Berorientasi Objek :" + nilaiAkhir);

        input.close();
    }   
}
