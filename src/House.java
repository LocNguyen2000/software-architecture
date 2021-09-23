public class House{
    // required
    private String walls;
    private String roof;
    private String windows;

    // optional
    private String garage;
    private String pool;

    public House(HouseBuilder builder){
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.windows = builder.windows;
    }

    // getter
    public String getRoof() {
        return this.roof;
    }
    public String getWalls() {
        return this.walls;
    }
    public String getWindows() {
        return this.windows;
    }
    public void print(){
        System.out.println(roof + ", " + windows + ", " + walls + ", " + pool + ", " + garage );
    }
}

