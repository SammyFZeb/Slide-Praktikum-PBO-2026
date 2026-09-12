# Casting

<br>

Casting merupakan aksi ketika kita mengubah suatu tipe data menjadi tipe data yang lain.  
Misal hirarki: **Food &rarr; Fruit &rarr; Apple**

<div class="grid grid-cols-2 gap-6 mt-4">

<div>

**Upcasting:**

```java
Fruit fruit = new Apple();
```

Memasukkan objek Apel ke dalam wadah bertuliskan Buah.

<div class="mt-4 text-sm font-semibold text-orange">
Apa output dari fruit instanceof Fruit?
</div>

</div>

<div>

**Downcasting:**

```java
Apple castedApple = (Apple) fruit;
```

Melihat kembali isi wadah Buah tersebut sebagai Apel.

<div class="mt-4 text-sm font-semibold text-orange">
Apa output dari castedApple instanceof Fruit?
</div>

</div>

</div>