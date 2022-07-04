public class Main {
    public static void main(String[] args) {
        System.out.println("Вас приветствует сотовая компания \"Кидала\"!");
        System.out.println();

        int accountAmount = 400; // сумма на счете
        int replenishment = 6130; // сумма пополнения

        int bonus = (replenishment > 1000) ? (replenishment / 100) : 0; // начисленный бонус
        int cashTotal = accountAmount + replenishment + bonus; // итоговая сумма

        System.out.println("На вашем счете " + (cashTotal) + " рублей");
        System.out.println("Бонус составляет " + (bonus) + " рублей");

    }
}
