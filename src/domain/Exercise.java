package domain;

/**
 * There 3 tasks. Every task have own method which call's by user in class TestResult
 * @author User
 */
public class Exercise {
    public static void Task1(int n) {
        System.out.println("Передане число: " + n);
        System.out.println(Integer.toBinaryString(n) + ", " + Integer.toOctalString(n) + ", " + Integer.toHexString(n) + "\n");
    }
    
    public static boolean Task2(char[] word){
    int i1 = 0;
    int i2 = word.length - 1;
    while (i2 > i1) {
        if (word[i1] != word[i2]) {
            return false;
        }
        ++i1;
        --i2;
    }
    return true;
    }
}

