---
layout: default
---

# Constructor Overloading

<div>

<p>
Overloading juga bisa diterapkan pada constructor. Konsep ini berarti membuat banyak constructor yang memiliki jumlah atau tipe parameter yang berbeda-beda. Pada sistem <code>Character</code> kita, terdapat tiga versi <i>constructor</i> sekaligus. Kita bisa membuat objek karakter kosongan, membuat dengan nama saja, atau membuat dengan spesifikasi yang sangat lengkap.
</p>

```java
// 1. Default constructor
public Character() {

}
// 2. Parameterized constructor (1)
public Character(String name, int currentLevel) {
  this.name = name;
  this.currentLevel = currentLevel;
}
// 3. Parameterized constructor (2)
public Character(String name, int currentLevel, double healthPoint, // ... dan parameter lainnya) {
  this.name = name;
  this.currentLevel = currentLevel;
  this.healthPoint = healthPoint;
  // ... dan atribut lainnya
}
```

</div>
