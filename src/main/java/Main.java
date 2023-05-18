public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Petal petal1 = new Petal();
        petal1.color = "Белый";
        petal1.smell = "Невероятный";
        flower.petal = petal1;

        Bud bud1 = new Bud();
        bud1.color ="Зеленый";
        flower.bud = bud1;
    }
}
