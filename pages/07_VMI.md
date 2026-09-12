# Virtual Method Invocation (VMI)

<div class="text-sm">

**Virtual Method Invocation (VMI)** dapat terjadi ketika **adanya polimorfisme dan method yang di-override**. JVM secara otomatis akan **memanggil method yang sudah ter-override**.

</div>
<div class="grid grid-cols-2 gap-4">

<div v-click="1" class="">

```java
public class Parent {
    int x = 5;

    public void showInfo() {
      System.out.println("Parent");
    }
}
```

</div>

<div v-click="2" class="">

```java
public class Child extends Parent {
    int x = 10;

    @Override
    public void showInfo() {
      system.out.println("Child");
    }
}
```

</div>

<div v-click="3" class="">

```java
public class Main {
    public static void main(String[] args) {
        Parent testParent = new Child();
        System.out.println("Nilai x = " + testParent.x); // 5
        testParent.showInfo(); // Child
    }
}
```

</div>
</div>
