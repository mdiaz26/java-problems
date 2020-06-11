class Anything {
    public static void main(String[] args) {
        Anything adder = new Anything();
        System.out.println(adder.add(1, 2));
    }

    private int add(int num1, int num2) {
        return num1 + num2;
    } 
}