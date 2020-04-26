package lesson8.homeWork;

public class House {
    /*
    3. Создайте класс House. Заполните Ваш новый дом “мебелью”(подсказка: отдельные классы), для примера
    достаточно до 5 вещей. У каждой вещи также должно быть пару характеристик.
    */
    private Table tableInLivingRoom;
    private TvSet tvSetInLivingRoom;
    private Chair chairInLivingRoom;
    private Chair chairInDinnerRoom;
    private Bed bedInBedRoom;

    public House() {
    }

    public House(Table tableInLivingRoom) {
        this.tableInLivingRoom = tableInLivingRoom;
    }

    public House(Table tableInLivingRoom, TvSet tvSetInLivingRoom) {
        this.tableInLivingRoom = tableInLivingRoom;
        this.tvSetInLivingRoom = tvSetInLivingRoom;
    }

    public House(Table tableInLivingRoom, TvSet tvSetInLivingRoom, Chair chairInLivingRoom) {
        this.tableInLivingRoom = tableInLivingRoom;
        this.tvSetInLivingRoom = tvSetInLivingRoom;
        this.chairInLivingRoom = chairInLivingRoom;
    }

    public House(Table tableInLivingRoom, TvSet tvSetInLivingRoom, Chair chairInLivingRoom, Chair chairInDinnerRoom) {
        this(tableInLivingRoom, tvSetInLivingRoom, chairInLivingRoom);
        this.chairInDinnerRoom = chairInDinnerRoom;
    }

    public House(Table tableInLivingRoom, TvSet tvSetInLivingRoom, Chair chairInLivingRoom, Chair chairInDinnerRoom, Bed bedInBedRoom) {
        this(tableInLivingRoom, tvSetInLivingRoom, chairInLivingRoom, chairInDinnerRoom);
        this.bedInBedRoom = bedInBedRoom;
    }

    public Table getTableInLivingRoom() {
        return tableInLivingRoom;
    }

    public void setTableInLivingRoom(Table tableInLivingRoom) {
        this.tableInLivingRoom = tableInLivingRoom;
    }

    public TvSet getTvSetInLivingRoom() {
        return tvSetInLivingRoom;
    }

    public void setTvSetInLivingRoom(TvSet tvSetInLivingRoom) {
        this.tvSetInLivingRoom = tvSetInLivingRoom;
    }

    public Chair getChairInLivingRoom() {
        return chairInLivingRoom;
    }

    public void setChairInLivingRoom(Chair chairInLivingRoom) {
        this.chairInLivingRoom = chairInLivingRoom;
    }

    public Chair getChairInDinnerRoom() {
        return chairInDinnerRoom;
    }

    public void setChairInDinnerRoom(Chair chairInDinnerRoom) {
        this.chairInDinnerRoom = chairInDinnerRoom;
    }

    public Bed getBedInBedRoom() {
        return bedInBedRoom;
    }

    public void setBedInBedRoom(Bed bedInBedRoom) {
        this.bedInBedRoom = bedInBedRoom;
    }

    @Override
    public String toString() {
        return
                "tableInLivingRoom=" + tableInLivingRoom + "\n" +
                        "tvSetInLivingRoom=" + tvSetInLivingRoom + "\n" +
                        "chairInLivingRoom=" + chairInLivingRoom + "\n" +
                        "chairInDinnerRoom=" + chairInDinnerRoom + "\n" +
                        "bedInBedRoom=" + bedInBedRoom;
    }

}
