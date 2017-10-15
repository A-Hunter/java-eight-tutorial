package doubleBinaryOperator;

public class Room {

    private int length;
    private int width;

    public Room(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public static Room[] getFloorSizes() {
        Room[] rooms = new Room[6];
        rooms[0] = new Room(10, 12);
        rooms[1] = new Room(11, 13);
        rooms[2] = new Room(12, 14);
        rooms[3] = new Room(13, 15);
        rooms[4] = new Room(14, 16);
        rooms[5] = new Room(15, 17);
//        rooms[6] = new Room(16, 18);
//        rooms[7] = new Room(17, 19);
//        rooms[8] = new Room(18, 20);
//        rooms[9] = new Room(19, 21);
        return rooms;
    }
}
