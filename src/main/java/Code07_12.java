class Rabbit02 {
    private String shape;
    public int xPos;
    private int yPos;
    public int number;

    void setPosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;

    }
}



public class Code07_12 {

    public static void main(String[] args) {
        Rabbit02 rabbit = new Rabbit02();
        rabbit.setPosition(100,200);

        rabbit.number = 1;
        rabbit.xPos = 0;
    }
}
