package Java;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax = 0;
        if( 0 < salary && salary < 1000){
            return 0;
        }else{
            tax = (salary * 3) / 100;
            return tax;
        }
    }

    public double bonus(){
        double bonus = 0;
        int hour = 0;
        if(workHours > 40){
            hour = workHours - 40 ;
            bonus = hour * 30;
            return bonus;
        }else{
            return bonus;
        }
    }

    public double raiseSalary(){
        double raise = 0;
        int atYear = 2021;

        if(atYear - this.hireYear < 10){
            raise = (this.salary *5)/100; 
            return raise;
        }
        else if( atYear - this.hireYear > 9 && atYear - this.hireYear < 20){
            raise = (this.salary * 10)/100;
            return raise;
        }else{
            raise = (this.salary * 15)/100 ;
            return raise;
        }
    }

    public void print(){
        double total = 0;
        total = salary + bonus() + raiseSalary()- tax();
        System.out.println("Name: "+ this.name);
        System.out.println("Salary: "+ this.salary);
        System.out.println("Since: "+ this.hireYear);
        System.out.println("Tax: "+ this.tax());
        System.out.println("Bonus: "+ this.bonus());
        System.out.println("Salary raise: "+ this.raiseSalary());
        System.out.println("Salary with tax and bonus: "+ (salary+bonus()-tax()));
        System.out.println("Total salary: "+ total );
    }
}