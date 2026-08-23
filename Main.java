import java.util.Scanner;

class Barang {
    public String namaBarang;
    public double hargaSatuan;
    public int jumlah;

    public Barang() {

    }
}

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Barang[] arrayBarang = new Barang[20];
        int index = 0;

        System.out.println("Simulasi Kasir");
        while (index < 20) {
            System.out.print("Nama Barang: ");
            String namaBarang = scanner.nextLine();
            System.out.print("Harga Satuan: ");
            double hargaSatuan = Double.parseDouble(scanner.nextLine());
            System.out.print("Jumlah: ");
            int jumlah = Integer.parseInt(scanner.nextLine());
            System.out.print("Tambah Barang (Y/n): ");
            String flag = scanner.nextLine();

            Barang barang = new Barang();
            barang.namaBarang = namaBarang;
            barang.hargaSatuan = hargaSatuan;
            barang.jumlah = jumlah;

            arrayBarang[index] = barang;
            index += 1;

            if (flag.equalsIgnoreCase("n")) break;
        }

        // double grandTotal = 0.0; // untuk soal 3
        for (int i = 0; i < index; i++) {
            String namaBarang = arrayBarang[i].namaBarang;
            double hargaSatuan = arrayBarang[i].hargaSatuan;
            int jumlah = arrayBarang[i].jumlah;
            double subTotal = hargaSatuan * jumlah;

            // grandTotal += subTotal; // untuk soal 3

            System.out.printf("%s (%dx), Subtotal: Rp. %.1f\n",
                    namaBarang, jumlah, subTotal);
        }

        // System.out.printf("Grand total: Rp. %.1f", grandTotal); // untuk soal 3
    }
}
