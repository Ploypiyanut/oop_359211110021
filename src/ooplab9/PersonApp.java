package ooplab9;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Piyanut","1234567890119",
                new Address("115 M.3","SuratThani","84110"),
                new Job("private business","30000"));


        System.out.println(person.toString());
        person.getJob().setsalary("500000");

        System.out.println(person.getJob());

    }//main

}//class