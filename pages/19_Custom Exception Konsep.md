# Implementasi Custom Exception

<div class="space-y-6 mt-8 text-sm leading-relaxed">

<p class="text-base">
Meskipun Java menyediakan beragam class exception bawaan, pada <strong>arsitektur perangkat lunak tingkat lanjut</strong>, pengembang sering kali perlu merancang hierarki exception yang berorientasi pada konteks domain spesifik (domain-specific exceptions).
</p>

<div class="border-l-4 border-emerald-500 pl-5 space-y-3">
<p class="font-bold text-emerald-400 text-base">Metode Implementasi</p>
<p>Pembuatan class exception kustom dilakukan dengan mengimplementasikan konsep pewarisan (<strong>inheritance</strong>) dari hirarki <code>RuntimeException</code> (untuk unchecked) atau <code>Exception</code> (untuk checked).</p>
</div>

<div class="mt-4 w-full">

```java
// Melakukan pewarisan dari basis RuntimeException (bisa juga dari Exception langsung)
public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String message) {
        super(message);
    }
}
```

</div>

</div>
