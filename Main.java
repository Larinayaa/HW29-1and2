import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,44,7,6,12,89,54,32,11,18,74,9);
        int znachenie= 33;
        MakeList makeList =new MakeList(numbers,znachenie);
        System.out.println(makeList);
    }

}
