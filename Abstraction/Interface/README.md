## What is an Interface?
public interface PaymentGateway {
    // Abstract methods (contract to follow)
    void processPayment(double amount);
    boolean validateCard();
}
✅ Blueprint for classes
✅ Defines WHAT, not HOW
✅ Cannot instantiate
✅ Multiple inheritance supported

┌──────────────────────────┬──────────────┬─────────────┐
│ Feature                  │ Interface    │ Abstract    │
├──────────────────────────┼──────────────┼─────────────┤
│ Multiple inheritance     │ ✓ YES        │ ✗ NO        │
│ Constructor              │ ✗ NO         │ ✓ YES       │
│ Instance variables       │ ✗ NO         │ ✓ YES       │
│ State management         │ ✗ NO         │ ✓ YES       │
│ Abstract methods         │ ✓ YES        │ ✓ YES       │
│ Concrete methods         │ ✓ YES (Java 8+)│ ✓ YES     │
│ Access modifiers         │ Only public  │ All types   │
│ Purpose                  │ CAN-DO       │ IS-A        │
└──────────────────────────┴──────────────┴─────────────┘

# Interface methods 
public interface MyInterface {
    // ===== JAVA 7 (and before) =====
    void abstractMethod();  // Only abstract methods allowed
    
    // ===== JAVA 8+ (Added) =====
    default void defaultMethod() {
        System.out.println("Default implementation");
    }
    
    static void staticMethod() {
        System.out.println("Static method");
    }
    
    // ===== JAVA 9+ (Added) =====
    private void privateMethod() {
        System.out.println("Private helper");
    }
    
    private static void privateStaticMethod() {
        System.out.println("Private static helper");
    }
}