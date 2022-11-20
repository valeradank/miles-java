public class Main {
    public static void main(String[] args) {


        int replenishmentAmount = 2000; // сумма пополнения


        int priceBonus = 10; // сумма бонусный рублей за каждые 100 рублей

        int minimumBonusAmount = 1100; // сумма необходимая для получения бонуса

            int moneyInTheAccount = replenishmentAmount / priceBonus + replenishmentAmount; // деньги на счету клиента
        if (replenishmentAmount > minimumBonusAmount) {
            System.out.println(moneyInTheAccount );
            int bonus = replenishmentAmount / priceBonus;
            System.out.println(bonus);


        }
        else {
            System.out.println("недостаточно средств для бонуса");

        }
    }
}

