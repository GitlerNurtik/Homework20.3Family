public class Main {
    public static void main(String[] args) {
        Family_1 family1 = new Family_1("Семья Живущая В Квартире", "Савелий", "Елизавета", "Александр", "Дмитрий");
        Family_2 family2 = new Family_2("Семья живущая в гостинице", "Александр", "Анастасия", "Евгений", "Руслан");
        Family_3 family3 = new Family_3("Семья живущая в общежитии", "Матвей", "Соня", "Ярослав", "Иван");
        utilities[] Family1 = new utilities[]{family1};
        for (utilities fam1 : Family1) {
            System.out.println(family1);
            fam1.pay();
        }
        rent[] Family2 = new rent[]{family2};
        rent[] Family3 = new rent[]{family3};
        for (rent fam2 : Family2) {
            System.out.println(family2);
            fam2.pay();
        }
        for (rent fam3:Family3) {
            System.out.println(family3);
            fam3.pay();
        }
    }
}