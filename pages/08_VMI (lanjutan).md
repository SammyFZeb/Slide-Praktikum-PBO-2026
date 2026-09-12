# Virtual Method Invocation (lanjutan)


<br>

Ketika melakukan polimorfisme pada suatu objek, **atribut dan method pada tipe data yang dideklarasikan**-lah yang diketahui oleh objek tersebut.

```java
Parent test = new Child();
```

Object **test** hanya mengetahui atribut dan method pada **Parent** saja.

Tetapi ketika ada method parent yang di-override pada **Child** class, maka JVM akan memanggil method tersebut (konsep VMI)
