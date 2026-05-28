⚡ Encapsulation - Quick Visual
What is it?
Code
┌─────────────────────────────┐
│   ENCAPSULATION             │
├─────────────────────────────┤
│ Hide → Private variables    │
│ Show → Public methods       │
│ Check → Validate data       │
└─────────────────────────────┘
# BAD (No Encapsulation):
public class Person {
    public int age;  // ❌ Public = Danger
}

p.age = -50;  // ❌ Invalid accepted!

Real Example: Bank Account
Java
❌ NO ENCAPSULATION:
account.balance = -999;  // Negative balance!

✅ WITH ENCAPSULATION:
account.setBalance(-999);  // ✗ Rejected (validation)
account.setBalance(5000);  // ✓ Accepted (valid);

Benefits Summary
Code
✅ DATA HIDING      - Can't access sensitive data
✅ VALIDATION       - Invalid data rejected
✅ CONTROL          - Full control over values
✅ SECURITY         - Protects important info
✅ FLEXIBILITY      - Can change internals
✅ MAINTAINABILITY  - Code stays clean

Access Modifiers (At a Glance)
Code
🔴 private   - Only inside class
🟡 default   - Only in same package
🟠 protected - Same package + subclasses
🟢 public    - Everywhere