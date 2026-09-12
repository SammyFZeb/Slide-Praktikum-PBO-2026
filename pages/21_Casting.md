# Casting


<br>

Casting merupakan aksi ketika kita mengubah suatu tipe data menjadi tipe data yang lain.

Misal hirarki **Food -> Fruit -> Apple**

Downcasting: Mengubah tipe class ke yang lebih rendah hirarkinya

```java
Fruit fruit = new Apple();
Apple castedApple = (Apple) fruit;
```

Apa output dari **fruit instanceof Fruit?**

Apa output dari **castedApple instanceof Fruit?**