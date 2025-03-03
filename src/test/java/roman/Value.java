package roman;

// Enum from RomanConverter is not public.
public enum Value {
 M(1000), 
 CM(900), 
 D(500), 
 CD(400), 
 C(100), 
 XC(90), 
 L(50), 
 XL(40), 
 X(10), 
 IX(9), 
 V(5), 
 IV(4), 
 I(1);

 private int value;

 private Value(int value) {
     this.value = value;
 }
 
 public int value() {
     return this.value;
 }
}