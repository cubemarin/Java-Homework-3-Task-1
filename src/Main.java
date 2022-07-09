public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        System.out.println();
        System.out.println("Количество бонусных миль за билет стоимостью 9000:");
        System.out.println(service.calculate(9_000));

        System.out.println();
        System.out.println("Количество бонусных миль за билет стоимостью 20000:");
        System.out.println(service.calculate(20_000));

    }
}
