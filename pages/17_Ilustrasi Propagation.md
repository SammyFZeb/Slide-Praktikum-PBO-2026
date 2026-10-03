# Ilustrasi Exception Propagation (Data & Service)

<div class="space-y-4 mt-6">
  <div class="flex items-center gap-4 text-sm font-semibold text-gray-300">
    <div class="px-3 py-1 bg-red-900 bg-opacity-50 border border-red-500 rounded">1. Repository (Throw)</div>
    <span>➡️</span>
    <div class="px-3 py-1 bg-yellow-900 bg-opacity-50 border border-yellow-500 rounded">2. Service (Propagate)</div>
    <span>➡️</span>
    <div class="px-3 py-1 bg-gray-700 opacity-50 border border-gray-500 rounded text-gray-500">3. Controller (Catch)</div>
  </div>
</div>

<div class="grid grid-cols-2 gap-6 mt-4">

<div class="w-full text-[0.7rem] leading-snug">

```java
class UserRepository {
    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }
    
    public User findById(UUID uid) throws Exception {
        User searchedUser = null;
        for (User user: users) {
            if (user.getUid().equals(uid)) {
                searchedUser = user;
                break;
            }
        }
        
        if (searchedUser == null) {
            // 1. Exception dilempar dari sini
            throw new Exception("User not found");
        }
        
        return searchedUser;
    }
}
```

</div>
<div class="w-full text-[0.7rem] leading-snug">

```java
class UserService {
    private UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    // 2. Exception dipropagasi (diteruskan) ke atas
    public User findById(UUID id) throws Exception {
        return userRepository.findById(id);
    }
}

class User {
    private UUID uid;
    private String name;

    public UUID getUid() { return uid; }
    public String getName() { return name; }
}
```

</div>
</div>

---

# Ilustrasi Exception Propagation (Controller)

<div class="space-y-4 mt-6">
  <div class="flex items-center gap-4 text-sm font-semibold text-gray-300">
    <div class="px-3 py-1 bg-gray-700 opacity-50 border border-gray-500 rounded text-gray-500">1. Repository (Throw)</div>
    <span>➡️</span>
    <div class="px-3 py-1 bg-gray-700 opacity-50 border border-gray-500 rounded text-gray-500">2. Service (Propagate)</div>
    <span>➡️</span>
    <div class="px-3 py-1 bg-emerald-900 bg-opacity-50 border border-emerald-500 rounded">3. Controller (Catch)</div>
  </div>
</div>

<div class="mt-6 w-full text-[0.8rem] leading-snug">

```java
class UserController {
    private UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    public Map<String, User> getUserById(UUID id) {
        Map<String, User> dto = new HashMap<>();
        
        // 3. Exception ditangkap dan ditangani agar tidak menyebabkan crash
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
