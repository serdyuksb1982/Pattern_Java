package patterns.singleton.factory;

public class Main {
    public static void main(String[] args) {
        DoughnutFactory factory = new DoughnutFactory();

        Doughnut almond = factory.getDoughnut(DoughnutTypes.ALMOND);
        Doughnut cherry = factory.getDoughnut(DoughnutTypes.CHERRY);
        Doughnut chocolate = factory.getDoughnut(DoughnutTypes.CHOCOLATE);
        almond.eat();
        cherry.eat();
        chocolate.eat();
    }
}
