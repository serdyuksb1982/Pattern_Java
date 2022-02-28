package patterns.singleton.factory;

public class DoughnutFactory {

    public Doughnut getDoughnut(DoughnutTypes type) {
        Doughnut doughnut = null;
        switch (type) {
            case ALMOND:
                doughnut = new AlmondDoughnut();
                break;
            case CHERRY:
                doughnut = new CherryDoughnut();
                break;
            case CHOCOLATE:
                doughnut = new CherryDoughnut();
                break;
            default:
                throw new IllegalArgumentException("Types exception: " + type);
        }
        return doughnut;
    }

}
