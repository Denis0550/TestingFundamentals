package tdd;

public class CollatzSequence {

    //  The [Collatz Sequence](https://en.wikipedia.org/wiki/Collatz_conjecture) is one of the most
    //  famous unsolved problems in mathematics.
    //  This sequence always starts with a given number `n`, provided as a method parameter.
    //  Once you receive `n` you need to perform the following operations:
    //      - If the number is even, divide it by two (n = n/2)
    //      - If the number is odd, triple it and add one (n = 3n + 1)
    //  These operations will be executed until `n` becomes 1.

    //<b>Hint:</b> Do not use array in this problem, because it is not possible to know the final length of the sequence.
//- Given the number 13, the sequence is: 13, 40, 20, 10, 5, 16, 8, 4, 2, 1;
    public String calculateSequence(int n) {
        String sequence = "";
        sequence = sequence + n;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            sequence = sequence + ", " + n;
        }
        return sequence;
    }

}
