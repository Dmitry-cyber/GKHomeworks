package homeworkfive;

public class Employee {
    String firstname, name,phone, position, email;
    int salary, age;

    Employee(String firstname,
             String name,
             String phone,
             String position,
             String email,
             int salary,
             int age) {
        this.firstname = firstname;
        this.name = name;
        this.phone = phone;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    void getFullInfo() {
        System.out.println("firstname: " + firstname + " | name: " + name
                + " | phone: " + phone + " | position: " + position
                + " | email: " + email + " | salary: " + salary + " | age: "
                + age);
    }

    int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "Ivan", "89231231211",
                "Top manager", "ivanov@mail.me", 150000, 45);
        employees[1] = new Employee("Petrov", "Petr", "89231231212", "manager",
                "petrov@mail.me", 50000, 39);
        employees[2] = new Employee("Sidorov", "Sidor", "89231231213",
                "manager", "sidorov@mail.me", 35000, 25);
        employees[3] = new Employee("Vasin", "Vasilii", "89231231214",
                "manager", "vasin@mail.me", 650000, 43);
        employees[4] = new Employee("Semenov", "Semen", "89231231215",
                "manager", "semenov@mail.me", 30000, 23);

        for (Employee e : employees) if (e.getAge() > 40) e.getFullInfo();
    }
}
