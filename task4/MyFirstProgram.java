class MyFirstClass {
    static void main(String[] s) {
        for (int i = 0; i < s.length; i++)
            System.out.println(s[i]);

        MySecondClass o = new MySecondClass(0, 0);

        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.setFirstNum(i);
                o.setSecondNum(j);
                System.out.print(o.multiply());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    private int firstNum;
    private int secondNum;

    MySecondClass(int first, int second) {
        firstNum = first;
        secondNum = second;
    }

    int getFirstNum() {
        return firstNum;
    }

    void setFirstNum(int first) {
        firstNum = first;
    }

    int getSecondNum() {
        return secondNum;
    }

    void setSecondNum(int second) {
        secondNum = second;
    }

    int multiply() {
        return firstNum * secondNum;
    }
}