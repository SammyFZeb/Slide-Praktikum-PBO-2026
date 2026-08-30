---
layout: default
---

# Getter dan Setter

<div class='grid grid-cols-2 gap-x-8'>

<div>

  Salah satu syarat implementasi enkapsulasi adalah menerapkan getter dan setter untuk setiap atribut yang ada dalam suatu class. Getter dan setter dibuat agar kita bisa mengakses dan mengupdate nilai dari atribut dengan modifier `private`.


- **Syntax:** Diawali dengan `get` atau `set` dan diikuti oleh nama atributnya dengan huruf pertama kapital.
- **Getter:** Mengembalikan nilai dari suatu atribut.
- **Setter:** Mengubah nilai dari suatu atribut.
</div>

<div>

```java {all|1-3|4-12|13-20}
class Mobil {
    private String merek;
    private int kapasitas;

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getKapasitas() {
        return kapasitas;
    }
   
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}  
```

</div>
</div>