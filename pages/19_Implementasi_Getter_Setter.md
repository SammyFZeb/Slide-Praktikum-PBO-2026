---
layout: default
---

# Implementasi Getter Setter di Class Main

<br>

<div class="grid grid-cols-2 gap-8 items-start mt-4 text-sm">

<div>
<h3 class="text-base font-bold text-red-400">Contoh yang salah</h3>

```java {all|4-6|all}
public class Main {
    public static void main(String [] args){

        Mobil mobil1 = new Mobil();
        mobil1.merek = "Ferrari"; // error 
        System.out.println(mobil1.merek); // error
    }
}
```
</div>

<div>
<h3 class="text-base font-bold text-blue-400">Contoh yang benar</h3>

```java {all|4-6|all}
public class Main {
    public static void main(String [] args){

        Mobil mobil1 = new Mobil();
        mobil1.setMerek("Ferrari");
        System.out.println(mobil1.getMerek()); // output: Ferrari
    }
}
```
</div>

</div>