class Rabbit01 {

    String shape = "";

    Rabbit01() {
        System.out.println("난 자바가 기본으로 만들어주는 생성자");
    }

    Rabbit01(String value) {
        this.shape = value;
    }


}

public class Code07_11 {

    public static void main(String[] args) {
        Rabbit01 rabbit0 = new Rabbit01();

        Rabbit01 rabbit1 = new Rabbit01("원");
        Rabbit01 rabbit2 = new Rabbit01("삼각형");
        Rabbit01 rabbit3 = new Rabbit01("토끼");

        System.out.printf("토끼1 객체의 모양은 [%s]입니다.\n", rabbit1.shape);
        System.out.printf("토끼2 객체의 모양은 [%s]입니다.\n", rabbit2.shape);
        System.out.printf("토끼3 객체의 모양은 [%s]입니다.\n", rabbit3.shape);
    }
}
