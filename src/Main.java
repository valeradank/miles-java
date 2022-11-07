public class Main {
    public static void main(String[] args) {


        int x = 0; // деньги на счету клиента

        int y = 2000; // сумма пополнения

        System.out.println(x + y);

        int c = 10; // сумма бонусный рублей за каждые 100 рублей

        int v = 1100; // сумма необходимая для получения бонуса
        if (y > v) {
            System.out.println(y / c + y);

        }
}
    }

