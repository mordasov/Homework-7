public class Main {
    public static void main(String[] args) {

        //Task-1
        int payment = 15000;
        int totalDeposit = 0;
        int month = 1;
        while (totalDeposit <= 2459000) {
            totalDeposit = totalDeposit + payment; // положили  15000

            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalDeposit + " рублей.");
            month++;
        }
        System.out.println();

        //Task-2
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        i--;
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Task-3
        int population = 12_000_000; // население
        int populationIncrease = population / 1000 * 17; // рождаемость
        int populationDecrease = population / 1000 * 8; // смертность
        int year = 2024;
        for (int a = 0; a < 10; a++) {
            population = population + populationIncrease - populationDecrease;
            System.out.println("Год - " + year + ", численность населения составляет " + population);
            year++;
        }
        System.out.println();

        //Task-4 (Вася-1)
        int donation = 15_000;
        float rateMonth = 0.07f;
        int sumDeposit = 0;
        int requiredSum = 12_000_000;
        int numberMonth = 1;

        while (sumDeposit <= requiredSum) {

            sumDeposit = sumDeposit + donation; //внесен еж.мес платеж
            sumDeposit = sumDeposit + (int) (sumDeposit * rateMonth); //начислены %%
            System.out.println("Месяц " + numberMonth + ", Вася накопил " + sumDeposit);
            numberMonth++;
        }
        System.out.println();

        //Task-5 (Вася-2)
        int donation2 = 15_000;
        float rateMonth2 = 0.07f;
        int sumDeposit2 = 0;
        int requiredSum2 = 12_000_000;
        int numberMonth2 = 0;

        System.out.println("Промежуточные суммы накоплений каждого 6-го месяца:");
        while (sumDeposit2 <= requiredSum2) {
            numberMonth2++;
            sumDeposit2 = sumDeposit2 + donation2; //внесен еж.мес платеж
            sumDeposit2 = sumDeposit2 + (int) (sumDeposit2 * rateMonth2); //начислены %%
            if (numberMonth2 % 6 == 0) {
                System.out.println(" -месяц " + numberMonth2 + ", Вася накопил " + sumDeposit2);
            }

        }
        System.out.println("Итого: Вася накопит " + sumDeposit2 + " за " + numberMonth2 + " месяцев.\n");

        //Task-6 (Вася-3)
        int donation3 = 15_000;
        float rateMonth3 = 0.07f;
        int sumDeposit3 = 0;
        int termOfSavingsYears = 9;
        int numberMonth3 = 1;

        System.out.println("Промежуточные суммы накоплений каждого 6-го месяца в течение 9-ти лет:");

        for (; numberMonth3 <= termOfSavingsYears * 12; numberMonth3++) {
            sumDeposit3 = sumDeposit3 + donation3; //внесен еж.мес платеж
            sumDeposit3 = sumDeposit3 + (int) (sumDeposit3 * rateMonth3); //начислены %%
            if (numberMonth3 % 6 == 0) {
                System.out.println(" -месяц " + numberMonth3 + ", Вася накопил " + sumDeposit3);
            }
        }
        System.out.println("Итого: Вася накопит " + sumDeposit3 + " за " + (--numberMonth3) + " месяцев.\n");

        //Task-7
        int firstFridayOfMonth = 5;
        for (; firstFridayOfMonth <= 31; firstFridayOfMonth += 7) {
            System.out.println("Сегодня пятница, " + firstFridayOfMonth + "-ое число." +
                    " Необходимо подготовить отчет.");
        }
        System.out.println();

        //Task-8
        int currentYear = 2024;
        int pastPeriod = currentYear - 200;
        int futurePeriod = currentYear + 100;
        for (; pastPeriod <= futurePeriod; pastPeriod++) {
            if (pastPeriod % 79 == 0) System.out.println(pastPeriod);
        }
    }
}