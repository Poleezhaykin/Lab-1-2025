package myfirstpackage;

public class MySecondClass {
    private int firstNum;
    private int secondNum;

    public MySecondClass(int first, int second) {
        firstNum = first;
        secondNum = second;
    }

    int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int first) {
        firstNum = first;
    }

    int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int second) {
        secondNum = second;
    }

    public int multiply() {
        return firstNum * secondNum;
    }
}

