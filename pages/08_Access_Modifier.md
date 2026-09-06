---
layout: default
---

# Access modifier di inheritance

<div class="text-left text-base leading-normal space-y-4">

<p>
Access modifier tidak terbatas pada public dan private saja, <b>protected</b> kadangkala digunakan di inheritance, tujuannya agar class turunannya dapat mengakses langsung atribut dan/atau method dari class parentnya tanpa memerlukan getter dan setter. 
</p>

<p>
Meski praktik ini, dianggap melanggar encapsulation.
</p>

| Access Modifier | Class yang Sama | Package yang Sama | Subclass | Class Manapun |
| --- | :---: | :---: | :---: | :---: |
| **public** | ✅ | ✅ | ✅ | ✅ |
| **protected** | ✅ | ✅ | ✅ | ❌ |
| **default** | ✅ | ✅ | ❌ | ❌ |
| **private** | ✅ | ❌ | ❌ | ❌ |

</div>
