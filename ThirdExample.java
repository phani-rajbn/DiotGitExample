public class ThirdExample {
    public static void printOddNumber(int i) {
        System.out.println("Odd numbers upto "+i);
        for(int x=1; x < i; x = x + 2)
            System.out.println(x);
    }
}