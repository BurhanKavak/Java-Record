

public class Main {
    public static void main(String[] args) {

        String name = "Burhan";
        String email = "burhan.kvk58@gmail.com";

        PersonRecord person1 = new PersonRecord(name,email);
        PersonRecord person2 = new PersonRecord(name, email);


        PersonOriginal person3 = new PersonOriginal(name,email);
        PersonOriginal person4 = new PersonOriginal(name,email);


        System.out.println("Record Class : " + person1.hashCode() + " " + person2.hashCode());
        System.out.println("Normal Class : " + person3.hashCode() + " " + person4.hashCode());

    }
}