package lesson6;

public class Phone {
    private int number;
    private String model;
    private double weight;
    private String name;
    private int callerNumber;

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void getNumber(int callerNumber){
        System.out.println("Номер звонящего " + callerNumber);
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model){
        this.model = model;
        this.number = number;
    }

    public Phone(){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String model, int number, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name, int callerNumber){
        System.out.println("Звонит " + name + " номер " + callerNumber);
    }

    public void sendMessage(int ... number) {
        System.out.println(number);
    }



    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number - " + number +
                ", model - " + model +
                ", weight = " + weight +
                '}';
    }
}