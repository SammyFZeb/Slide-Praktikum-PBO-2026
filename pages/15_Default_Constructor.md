---
layout: default
---

# Default Constructor

Default constructor tidak memiliki parameter apa pun dan digunakan untuk meng-assign nilai default ke suatu objek.
Jika tidak ada constructor yang kita deklarasikan secara *explicit*, maka Java akan secara otomatis menyediakan *default constructor*.


```java {all|1-5|all}
class Mobil {
    public void sound() {
        System.out.println("Ngeeeng!"); 
    }
}

public class Main {
    public static void main(String [] args){
        Mobil mobil1= new Mobil(); 
        mobil1.sound(); //output: Ngeeeng!
    }
}