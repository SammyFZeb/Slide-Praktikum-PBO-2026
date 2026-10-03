# Ilustrasi Propagation: 1. Data Layer

<div class="space-y-4 mt-6">
  <div class="flex items-center gap-4 text-base font-semibold text-gray-300">
    <div class="px-4 py-2 bg-red-900 bg-opacity-50 border border-red-500 rounded shadow-lg shadow-red-900/20">1. Repository (Throw)</div>
    <span>➡️</span>
    <div class="px-4 py-2 bg-gray-800 opacity-50 border border-gray-600 rounded">2. Service (Propagate)</div>
    <span>➡️</span>
    <div class="px-4 py-2 bg-gray-800 opacity-50 border border-gray-600 rounded">3. Controller (Catch)</div>
  </div>
</div>

<div class="mt-8 w-full text-sm">

```java
class UserRepository {
    public User findById(UUID uid) throws Exception {
        User searchedUser = null;
        for (User user: users) {
            if (user.getUid().equals(uid)) {
                searchedUser = user;
                break;
            }
        }

        if (searchedUser == null) {
            // 1. Exception tercipta dan dilempar dari level terbawah
            throw new Exception("User not found");
        }

        return searchedUser;
    }
}
```

</div>

---

# Ilustrasi Propagation: 2. Service Layer

<div class="space-y-4 mt-6">
  <div class="flex items-center gap-4 text-base font-semibold text-gray-300">
    <div class="px-4 py-2 bg-gray-800 opacity-50 border border-gray-600 rounded">1. Repository (Throw)</div>
    <span>➡️</span>
    <div class="px-4 py-2 bg-yellow-900 bg-opacity-50 border border-yellow-500 rounded shadow-lg shadow-yellow-900/20">2. Service (Propagate)</div>
    <span>➡️</span>
    <div class="px-4 py-2 bg-gray-800 opacity-50 border border-gray-600 rounded">3. Controller (Catch)</div>
  </div>
</div>

<div class="mt-8 w-full text-sm">

```java
class UserService {

    // 2. Exception tidak ditangani di sini, melainkan
    // didelegasikan (dipropagasi) ke atas menggunakan 'throws'
    public User findById(UUID id) throws Exception {
        return userRepository.findById(id);
    }
    
}
```

</div>

---

# Ilustrasi Propagation: 3. Controller Layer

<div class="space-y-4 mt-6">
  <div class="flex items-center gap-4 text-base font-semibold text-gray-300">
    <div class="px-4 py-2 bg-gray-800 opacity-50 border border-gray-600 rounded">1. Repository (Throw)</div>
    <span>➡️</span>
    <div class="px-4 py-2 bg-gray-800 opacity-50 border border-gray-600 rounded">2. Service (Propagate)</div>
    <span>➡️</span>
    <div class="px-4 py-2 bg-emerald-900 bg-opacity-50 border border-emerald-500 rounded shadow-lg shadow-emerald-900/20">3. Controller (Catch)</div>
  </div>
</div>

<div class="mt-8 w-full text-sm">

```java
class UserController {

    public Map<String, User> getUserById(UUID id) {
        Map<String, User> dto = new HashMap<>();

        // 3. Exception akhirnya ditangkap dan ditangani,
        // mencegah aplikasi mengalami crash.
        try {
            User user = userService.findById(id);
            dto.put("userData", user);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        return dto;
    }
}
```

</div>
