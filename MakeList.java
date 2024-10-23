import java.util.ArrayList;
import java.util.List;

public class MakeList {
    private List<Integer> numbers;
    private int znachenie;
    public MakeList(List<Integer> numbers, int znachenie){
        this.numbers=numbers;
        this.znachenie=znachenie;
    }
    public List<Integer> naitiZnachenia(){
        List<Integer> itog = new ArrayList<>();
        for (int number:numbers) { //приравняли
            if (number>znachenie){ //если число больше заданного
         itog.add(number); //в итог добавляем это число
    }}
        return itog;
    }
    @Override
    public String toString() {
        return "Список чисел, которые больше " +
                znachenie +": " + naitiZnachenia();
    }
}
