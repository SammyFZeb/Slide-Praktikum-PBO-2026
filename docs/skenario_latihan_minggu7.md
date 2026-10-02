# Skenario Latihan: Sistem Ekspedisi Pengiriman Barang

**Fokus Materi:** Pengenalan `throw`, blok `try-catch-finally`, dan pemanfaatan Exception bawaan Java (`IllegalArgumentException`).

## Konsep Dasar
Mahasiswa diminta melengkapi logika pengiriman barang. Sebuah barang tidak dapat dikirim jika beratnya tidak rasional (misalnya <= 0 kg). Ini adalah contoh validasi *business logic* sederhana di mana exception harus secara eksplisit dilempar (`throw`) dan ditangkap (`catch`).

---

## Spesifikasi Boilerplate (Untuk Disediakan ke Mahasiswa)

### 1. Class `Paket`
Menyimpan data paket sederhana.
```java
public class Paket {
    private String tujuan;
    private double berat; // dalam kilogram

    public Paket(String tujuan, double berat) {
        this.tujuan = tujuan;
        this.berat = berat;
    }
    
    // TODO: Sediakan getter
}
```

### 2. Class `Ekspedisi`
```java
public class Ekspedisi {
    
    public void prosesPengiriman(Paket paket) {
        // TODO: Validasi berat paket.
        // Jika berat <= 0, lemparkan IllegalArgumentException
        // dengan pesan "Berat paket tidak valid!"
        
        System.out.println("Paket sedang diproses untuk tujuan: " + paket.getTujuan());
    }
}
```

### 3. Class `Main` (Simulasi Pemanggilan)
```java
public class Main {
    public static void main(String[] args) {
        Ekspedisi ekspedisi = new Ekspedisi();
        Paket paketBermasalah = new Paket("Jakarta", -5.0);
        
        // TODO: Bungkus pemanggilan prosesPengiriman dengan try-catch
        // Tangkap IllegalArgumentException dan cetak pesan errornya.
        // Tambahkan blok finally untuk mencetak "Sistem pengiriman selesai beroperasi."
        
        ekspedisi.prosesPengiriman(paketBermasalah);
    }
}
```

---

## Skenario Unit Test (TDD)
Bisa menggunakan JUnit untuk memvalidasi bahwa blok TODO dikerjakan dengan benar.

1. **Test Validasi Berat (`testProsesPengirimanThrowsException`)**
   - **Action:** Memanggil `ekspedisi.prosesPengiriman(new Paket("Bandung", 0))`
   - **Assert:** Memastikan bahwa pemanggilan tersebut melempar `IllegalArgumentException`.

2. **Test Pesan Error (`testExceptionMessage`)**
   - **Action:** Menangkap exception yang dilempar.
   - **Assert:** Memastikan pesan di dalam exception berisi tepat string `"Berat paket tidak valid!"`.

3. **Test Skenario Normal (`testProsesPengirimanNormal`)**
   - **Action:** Memanggil `ekspedisi.prosesPengiriman(new Paket("Surabaya", 10.0))`
   - **Assert:** Memastikan metode selesai dieksekusi tanpa melempar exception apapun (tervalidasi *Does Not Throw*).
