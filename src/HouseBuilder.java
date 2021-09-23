public class HouseBuilder implements Builder {
    // required
    public String walls;
    public String roof;
    public String windows;

    // optional
    private String garage;
    private String pool;

    public HouseBuilder(String walls, String roof, String windows) {
        this.walls = walls;
        this.roof = roof;
        this.windows = windows;
    }

    @Override
    public HouseBuilder buildGarage() {
        this.garage = "1 garage";
        return this;
    }
    @Override
    public HouseBuilder buildPool() {
        this.garage = "1 pool";
        return this;
    }

    public House build() {
        return new House(this);
    }
}
