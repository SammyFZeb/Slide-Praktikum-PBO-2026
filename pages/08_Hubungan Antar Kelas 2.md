---
layout: default
---

# Hubungan Antar Kelas

<div class="grid grid-cols-[40%_55%] gap-4 items-center">

<div class="text-[0.8rem] leading-normal">

- **Aggregation**: merepresentasikan hubungan **has-a** antara dua class dengan lifespan yang berbeda. Jika 1 class telah mati, dependency tidak akan ikut mati.
- Bertipe *unidirectional association* (hubungan satu arah).
- Pada class diagram, ditandai dengan garis yang memiliki bentuk outline *diamond* (belah ketupat kosong).

</div>
<div class="transform scale-90">

```mermaid
classDiagram
  direction LR
  School o-- Student
  
  class School {
    -id: String
    -name: String
    -students: ArrayList~Student~
    +Student(id: String, name: String)
    +addStudent(newStudent: Student)
  }
  
  class Student {
    -id: String
    -name: String
    +Student(id: String, name: String)
  }
```

</div>
</div>
