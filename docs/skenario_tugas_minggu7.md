# Skenario Tugas: Mesin Kasir Sederhana (Point of Sales)

**Fokus Materi:** Pembuatan hirarki Custom Exception, delegasi exception dengan `throws`, dan penanganan multiple exceptions.

## Konsep Dasar
Mahasiswa merancang modul kasir yang mengintegrasikan pengecekan stok barang dan pemrosesan pembayaran. Ini mengajarkan bahwa layanan yang berbeda memunculkan anomali yang berbeda, dan semuanya harus dirangkai dan ditangkap pada satu muara (Controller/Main).

---

## Spesifikasi Boilerplate (Untuk Disediakan ke Mahasiswa)

### 1. Hirarki Custom Exception
Semua exception dibuat berbasis `RuntimeException`.
```java
// TODO: Buat class induk TransactionException extends RuntimeException
// Wajib memiliki atribut String errorCode. Sediakan getter.

// TODO: Buat class OutOfStockException extends TransactionException
// Di constructor, set errorCode ke "ERR-STOCK"

// TODO: Buat class PaymentDeclinedException extends TransactionException
// Di constructor, set errorCode ke "ERR-PAY"
```

### 2. Service Layer (Pendelegasian dengan `throws`)
```java
public class InventoryService {
    // TODO: Tambahkan deklarasi throws OutOfStockException pada method ini
    public void checkStock(int qty) {
        if (qty > 10) { // Anggap stok maksimum hanya 10
            // TODO: Lempar OutOfStockException dengan pesan "Stok barang tidak mencukupi"
        }
    }
}

public class PaymentService {
    // TODO: Tambahkan deklarasi throws PaymentDeclinedException pada method ini
    public void processPayment(double amount) {
        if (amount <= 0) {
            // TODO: Lempar PaymentDeclinedException dengan pesan "Nominal pembayaran tidak valid"
        }
    }
}
```

### 3. Controller Layer (Penggabungan & Penanganan)
```java
public class Cashier {
    private InventoryService inventory;
    private PaymentService payment;
    
    // Asumsi constructor sudah di-inject
    
    public void checkout(int qty, double amount) {
        // TODO: Gunakan try-catch
        // Di dalam try:
        // 1. Panggil inventory.checkStock(qty)
        // 2. Panggil payment.processPayment(amount)
        // 3. Print "Checkout berhasil!"
        
        // Di dalam catch:
        // Tangkap OutOfStockException -> Cetak "[ERR-STOCK]: Stok Habis"
        // Tangkap PaymentDeclinedException -> Cetak "[ERR-PAY]: Pembayaran Gagal"
    }
}
```

---

## Skenario Unit Test (TDD)
Skenario pengujian yang lebih ekstensif untuk memvalidasi hirarki dan penanganan spesifik.

1. **Test Struktur Hirarki (`testExceptionHierarchy`)**
   - **Assert:** Memastikan melalui *Reflection* bahwa `OutOfStockException` benar-benar turunan dari `TransactionException`.
   
2. **Test Error Code Assignment (`testErrorCode`)**
   - **Action:** Menginstansiasi `PaymentDeclinedException`.
   - **Assert:** Memanggil `.getErrorCode()` dan memverifikasi nilainya adalah `"ERR-PAY"`.

3. **Test Skenario Kehabisan Stok (`testCheckoutOutOfStock`)**
   - **Action:** Memanggil `cashier.checkout(15, 100000)`.
   - **Assert:** Memastikan bahwa blok penanganan menangkapnya dengan spesifik (melalui pemantauan *console output* atau simulasi spy/mock) dan metode tidak crash.

4. **Test Skenario Pembayaran Ditolak (`testCheckoutPaymentDeclined`)**
   - **Action:** Memanggil `cashier.checkout(5, -50000)`.
   - **Assert:** Memastikan bahwa eksekusi berhenti setelah validasi *payment* dan menangkap respons `"ERR-PAY"`.
