public class Main {
    public static void main(String[] args) {
        System.out.println("Вас приветствует сотовая компания \"Кидала\"!");
        System.out.println();

        int cash = 99; // сумма на счете
        int check = 2100; // сумма пополнения


//       int bonus = 0; // бонус

//        if (check > 1_000) {
//            bonus = check / 100; // отключил, но тоже вполне работает
//       }


        boolean x = (check > 1000);
        int bonus = x ? (check / 100) : 0; // вдруг этот понравится больше...

        int cash_new = cash + check + bonus; // итоговая сумма

        System.out.println("На вашем счете " + (cash_new) + " рублей");
        System.out.println("Бонус составляет " + (bonus) + " рублей");

    }
}
