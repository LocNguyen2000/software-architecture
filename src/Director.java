public class Director{
    private static Builder builder;
    public static void main(String[] args) {
        builder = new HouseBuilder("4 walls", "1 roof", "2 windows");

        House houseWithPool = builder.buildPool().build();
        House house = builder.build();

        System.out.println("House:");
        house.print();

        System.out.println("--------------");

        System.out.println("House With Pool:");
        houseWithPool.print();
    }
}