---
layout: default
---

# Instruksi Latihan

<div class="grid grid-cols-[50%_45%] gap-6 mt-2">

<div class="text-[0.9rem] leading-normal">

Lanjutkan proyek *Course Registration* minggu 7 (seluruh TODO lama sudah selesai).

Sekarang persistensikan data ke **database** melalui **JDBC**. Implementasikan ketiga *repository* di dalam `repository/jdbc/`.

</div>

<div class="text-[0.8rem] leading-normal bg-gray-100 dark:bg-gray-900 text-gray-800 dark:text-gray-200 p-5 rounded-lg shadow-md border border-gray-300 dark:border-gray-700">

- `JdbcStudentRepository` — `save`, `findById`
- `JdbcCourseRepository` — `save`, `findById`
- `JdbcEnrollmentRepository` — `findActiveByStudentAndCourse`, `countActiveByCourseId`, `save`, `update`

</div>

</div>

<div class="mt-4 text-sm">
<ul class="list-disc pl-5 space-y-1">
<li>Cari komentar <code>TODO</code> beserta <code>HINT</code> pada tiap method.</li>
<li>Jalankan <code>mvn test</code> — 6 test JDBC (H2 in-memory) harus lulus.</li>
</ul>
</div>
