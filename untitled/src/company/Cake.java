package company;

public class Cake {
    private String cakeName;
    private String cookerName;
    private double amountFlour;
    private double amountEgg;
    private double amountSugar;
    private double amountButter;
    private double amountChocolate;
    private double amountOrangeJuice;
    private double amountMilk;

    private Cake (CakeBuilder builder){
        this.cakeName = builder.cakeName;
        this.cookerName = builder.cookerName;
        this.amountFlour = builder.amountFlour;
        this.amountEgg = builder.amountEgg;
        this.amountSugar = builder.amountSugar;
        this.amountButter = builder.amountButter;
        this.amountChocolate = builder.amountChocolate;
        this.amountOrangeJuice = builder.amountOrangeJuice;
        this.amountMilk = builder.amountMilk;
    }

    public double getAmountFlour() {
        return amountFlour;
    }

    public double getAmountEgg() {
        return amountEgg;
    }

    public double getAmountSugar() {
        return amountSugar;
    }

    public double getAmountButter() {
        return amountButter;
    }

    public double getAmountChocolate() {
        return amountChocolate;
    }

    public double getAmountOrangeJuice() {
        return amountOrangeJuice;
    }

    public double getAmountMilk() {
        return amountMilk;
    }

    private String ThereIsToString(Double amount){
        if(amount != 0){
            return Double.toString(amount);
        }else{
            return "NONE";
        }
    }
    private String cookerToString(String name){
        if(name != null){
            return name;
        }else{
            return "Anonymous";
        }
    }

    @Override
    public String toString() {
        return "~ Cake Recipe (Name: " + this.cakeName + " [By: " + this.cookerToString(this.cookerName) +"] )"+
                "\nFlour: " + this.amountFlour +
                "\nEgg: " + this.amountEgg +
                "\nSugar: " + this.ThereIsToString(this.amountSugar)+
                "\nButter: " + this.ThereIsToString(this.amountButter)+
                "\nChocolate: " + this.ThereIsToString(this.amountChocolate)
         +       "\nOrange Juice: " + this.ThereIsToString(this.amountOrangeJuice)+
                "\nMilk: " + this.ThereIsToString(this.amountMilk)+ "\n";
    }

    //Builder
    public static class CakeBuilder{

        private String cakeName;
        private String cookerName;
        private double amountFlour;
        private double amountEgg;
        private double amountSugar;
        private double amountButter;
        private double amountChocolate;
        private double amountOrangeJuice;
        private double amountMilk;

        public CakeBuilder(String cakeName, double amountFlour, double amountEgg) {
            this.amountFlour = amountFlour;
            this.amountEgg = amountEgg;
            this.cakeName = cakeName;
        }

        public CakeBuilder setCookerName(String cookerName){
            this.cookerName = cookerName;
            return this;
        }

        public CakeBuilder setAmountSugar(double amountSugar) {
            this.amountSugar = amountSugar;
            return this;
        }

        public CakeBuilder setAmountButter(double amountButter) {
            this.amountButter = amountButter;
            return this;
        }

        public CakeBuilder setAmountChocolate(double amountChocolate) {
            this.amountChocolate = amountChocolate;
            return this;
        }

        public CakeBuilder setAmountOrangeJuice(double amountOrangeJuice) {
            this.amountOrangeJuice = amountOrangeJuice;
            return this;
        }

        public CakeBuilder setAmountMilk(double amountMilk) {
            this.amountMilk = amountMilk;
            return this;
        }

        public Cake build(){
            return new Cake(this);
        }
    }
}
