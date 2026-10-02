# Exception Handling

<div class="grid grid-cols-2 gap-8 items-center mt-2">

<div class="text-sm leading-relaxed space-y-3">

<p>
Exception handling adalah <strong>mekanisme di mana sebuah alur khusus didefinisikan</strong> ketika sebuah kejadian yang berpotensi mengganggu alur kode program utama terjadi dan berpotensi menimbulkan crash.
</p>

<p>
Exception handling berusaha untuk membuat <strong>jalur alternatif</strong> dengan menangani masalah lebih elegan daripada membiarkan program crash.
</p>

</div>

<div>

```mermaid {scale: 0.75}
flowchart TD
  A([Mulai]) --> B[Jalankan Kode]
  B --> C{Exception\nterjadi?}
  C -- Tidak --> D[Lanjutkan\nAlur Normal]
  D --> E[✅ Hasil Sesuai\nHarapan]
  C -- Ya --> F[Exception\nHandler]
  F --> G[⚠️ Perlakuan\nKhusus]
  G --> H([Selesai])
  E --> H

  style A fill:#374151,stroke:#6b7280,color:#f9fafb
  style C fill:#92400e,stroke:#d97706,color:#fef3c7
  style D fill:#064e3b,stroke:#10b981,color:#d1fae5
  style E fill:#064e3b,stroke:#10b981,color:#d1fae5
  style F fill:#7f1d1d,stroke:#ef4444,color:#fee2e2
  style G fill:#4c1d95,stroke:#8b5cf6,color:#ede9fe
  style H fill:#374151,stroke:#6b7280,color:#f9fafb
```

</div>

</div>
