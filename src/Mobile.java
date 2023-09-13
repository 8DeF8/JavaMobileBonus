import com.sun.source.util.SourcePositions;

public class Mobile {
    public static void main(String[] args) {
        int startingBalance = 200;
        int scaleBonus = 100;
        int refill = 2300;
        int bonus;

        if (refill >= 1000) {
            bonus = refill / scaleBonus;
        } else {
            bonus = 0;
        }
        int finalBalance = startingBalance + refill + bonus;
        System.out.println("Вы пополнили счет на " + refill + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш итоговый баланс " + finalBalance + " руб.");
    }
}
