package demo2;

public class Main {
    public static void main(String[] args) {
        Sumable sumable = (a,b) -> {return a+b;};
        System.out.println(sumable.sum(5,6));
    }
}
