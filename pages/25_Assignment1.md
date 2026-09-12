# Assignment 5 Soal 1

<div class="text-sm">
implementasikan UML berikut dengan class Test dan perbaiki class Test tersebut:
</div>
<div class="flex">

<div class="">

```java
class Test {

  public static void main(String[] args) {
    CaesarCipher Cipher1 = new CaesarCipher();
    System.out.println(Cipher1.encrypt("PemrogramanBerorientasiObjek", 5));
    System.out.println(Cipher1.decrypt("WIVKBHWBSBOKBHLTWHA", 7));

    Cipher Cipher2 = new CaesarCipher(3,2);
    // Change line of code below to fix the problem without change declaration code!
    Cipher2.encrypt("KAGIQDQQJBQOFUZSMFQJFNGFUFIMEYQPUA", 12);
  }
}
```

Dengan ketentuan :
- `Cipher` adalah class interface
- `CaesarCipher` adalah class implement `Cipher`
</div>

<div>

<img src="/asset/uml1.png" class="w-2/3 m-auto" />

</div>
</div>



