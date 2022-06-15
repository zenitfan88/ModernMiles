public class BonusMilesService {
    public int calculate(int cost) {
        int priceForBonus = 20;
        int miles = cost / priceForBonus;
        return miles;
    }
}
