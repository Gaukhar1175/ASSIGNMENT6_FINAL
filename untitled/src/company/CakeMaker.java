package company;

public class CakeMaker {
    public static void main(String[] args) {
        Cake chocolateCake = new Cake.CakeBuilder("Chocolate",100,100)
                .setCookerName("Alvaro")
                .setAmountButter(500)
                .setAmountMilk(300)
                .setAmountSugar(250)
                .setAmountChocolate(100)
                .build();
        Cake orangeCake = new Cake.CakeBuilder("Orange", 100,100)
                .setAmountButter(350)
                .setAmountSugar(250)
                .setAmountOrangeJuice(150)
                .build();





        System.out.println(chocolateCake + "\n" + orangeCake + "\n");


    }
}
