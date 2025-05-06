package FDb.Add;

public class Employee {
    String name;
    int id;
    double salary;
    String address;

    public Employee(String name,int id, double salary,String address){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.address=address;
    }
    public void displayInfo(){
       System.out.println("Employee id:"+id);
       System.out.println("Employee Name:"+name);
       System.out.println("Employee salary:"+salary);
       System.out.println("Employee Adress:"+address);


    }
    public static void main(String[] args) {
        Employee emp1=new Employee("xyz",101,50000.0,"hubli");
        emp1.displayInfo();
    }
    
}
