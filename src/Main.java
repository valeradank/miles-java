public class Main {
    public static void main(String[] args) {


        int moneyInTheAccount = 0; // деньги на счету клиента

        int replenishmentAmount = 2000; // сумма пополнения


        int priceBonus = 10; // сумма бонусный рублей за каждые 100 рублей

        int minimumBonusAmount = 1100; // сумма необходимая для получения бонуса
        if (replenishmentAmount > minimumBonusAmount) {
            System.out.println(replenishmentAmount / priceBonus + replenishmentAmount);
        } else {
            System.out.println("недостаточно средств для бонуса");

        }
    }
}

