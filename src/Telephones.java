public class Telephones {
    public static void main(String[] args) {
        Telephone tel1 = new Telephone();
        Telephone tel2 = new Telephone();

        tel1.brand = "Huawei";
        tel1.model = "P20";
        tel1.color = "Czarny";
        tel1.number = 123654789;

        tel2.brand = "Apple";
        tel2.model = "iPhone Xd";
        tel2.color = "Biały";
        tel2.number = 321456879;

        System.out.println(tel1.brand);
        System.out.println(tel1.model);
        System.out.println(tel1.color);
        System.out.println(tel1.number + "\n");

        System.out.println(tel2.brand);
        System.out.println(tel2.model);
        System.out.println(tel2.color);
        System.out.println(tel2.number);

    }
}
