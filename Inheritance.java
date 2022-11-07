class Animal {
    public void Eat() {
        System.out.println("The animal is eating");
    }

    public void Sleep() {
        System.out.println("The animal is sleeping");
    }

    public void Walk() {
        System.out.println("The animal is walking now");
    }
}

class Dog extends Animal {
    public void Bark() {
        System.out.println("The dog is barking, bhow bhow!!");
    }

    // method overriding
    @Override
    public void Eat() {
        super.Eat();
        System.out.println("Dog can eat 24/7");
    }
}

public class Inheritance {
    public static void main(String args[]) {
        // Dog dog = new Dog();
        // dog.Eat();
        // dog.Bark();
        // dog.Eat();
        // dog.Bark();
        Employee partTimeEmployee = new PartTimeEmployee();
        Employee fullTimeEmployee = new FullTimeEmployee();
        partTimeEmployee.CalculateSalary();
        fullTimeEmployee.CalculateSalary();
    }
}

class Employee {
    double basicSalary = 50000;

    public void CalculateSalary() {
        System.out.println("Calculating Employee Salary");
    }
    
}

class PartTimeEmployee extends Employee {
    @Override
    public void CalculateSalary() {
        super.CalculateSalary();
        basicSalary = basicSalary - 10000;
        System.out.println("Salary for part time employee");
        System.out.println("Reduced salary is " + 10000);
        System.out.println("Part time salary is " + basicSalary);
    }

}

class FullTimeEmployee extends Employee {
    @Override
    public void CalculateSalary() {
        super.CalculateSalary();
        System.out.println("Salary for full time employee");
        System.out.println("Salary is not reduced as a full time employee");
        System.out.println("Full time salary is " + basicSalary);
    }
}