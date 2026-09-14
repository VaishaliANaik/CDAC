public class Program {

    public static void main(String[] args) {

        Employee e1 = new Employee("Robert", 1994, "64C-WallStreet");

        Employee e2 = new Employee("Sam", 2000, "68D-WallStreet");

        Employee e3 = new Employee("John", 1999, "26B-WallStreet");

        System.out.println("Name\t\tYear Of Joining\t\tAddress");

        System.out.println(e1.name + "\t\t" +
                           e1.year_of_join + "\t\t" +
                           e1.address);

        System.out.println(e2.name + "\t\t" +
                           e2.year_of_join + "\t\t" +
                           e2.address);

        System.out.println(e3.name + "\t\t" +
                           e3.year_of_join + "\t\t" +
                           e3.address);
    }
}