public class Main {
    // 1 вариант. Придерживаемся условия задачи.
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(20);
        System.out.println(miles);

        // 2 вариант. Придерживаемся кода программы
     /*public static void main(String[] args) {
         BonusMilesService service = new BonusMilesService();
         int price = 10_000;
         int miles = service.calculate(price);
         System.out.println(miles);*/
    }
}

