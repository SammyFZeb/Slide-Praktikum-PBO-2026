# Casting


<br>

Casting merupakan aksi ketika kita mengubah suatu tipe data menjadi tipe data yang lain.

Misal hirarki **Food -> Fruit -> Apple**

Upcasting:
```java
Fruit fruit = new Apple();
```
Memasukkan objek Apel ke dalam wadah bertuliskan Buah.

Downcasting:
```java
Apple castedApple = (Apple) fruit;
```
Melihat kembali isi wadah Buah tersebut sebagai Apel.

Apa output dari **fruit instanceof Fruit?**

Apa output dari **castedApple instanceof Fruit?**