public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static void main(String[] args) {
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());
        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());
        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }

    public VipPerson() {
        this("Unnamed", 0.00, "unnamed@gmail.com");
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unnamed@gmail.com");
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
