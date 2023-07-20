package calculator;

import lombok.Getter;

/*
I	лат. unus, unum
5	V	лат. quinque
10	X	лат. decem
50	L	лат. quinquaginta
100	C
 */
@Getter
public enum RomanDigits {
    C(100),
    XC(90),
    L(50),
    XL(40),
    X(10),
   IX(9),
    V(5),
    IV(4),
    I(1);


    private final int value;

    private RomanDigits(int value) {
        this.value = value;
    }
}
