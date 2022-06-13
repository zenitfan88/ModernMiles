public class BonusMilesService {
    // 1 вариант. Придерживаемся условия задачи.
    public int calculate(int cost) {
        int price = 10_000;
        int miles = price / cost;
        return miles;

// 2 вариант. Придерживаемся кода программы
    /*public int calculate(int price) {
        int cost = 20;
        int miles = price / cost;
        return miles;*/
    }
}
