package lesson6;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(325, "y23wrb", 342.3);
        Phone phone2 = new Phone(925, "giyh7o", 78.589);
        Phone phone3 = new Phone(947, "nksi8e", 245.09);

        System.out.println(phone1);
        phone1.receiveCall("jkaebck");
        phone1.getNumber(7843);
        phone1.receiveCall("bvhdfvj", 98376);
        System.out.println(phone2);
        phone2.receiveCall("nusnk");
        phone2.getNumber(943564);
        phone2.receiveCall("kjffg", 89354);
        System.out.println(phone3);
        phone3.receiveCall("ilbav");
        phone3.getNumber(847934);
        phone3.receiveCall("jxbkle", 78366);

        phone1.sendMessage(6478,473,478);
    }

//    private static void sendMessage(int ... numbers) {
//        System.out.println(numbers);
//    }

}
