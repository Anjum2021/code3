public class Employee{
    String name;
    int id;
    double salary;
    int age;
    public Employee(String name,int id,double salary,int age){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("Employee name:"+name);
        System.out.println("Employee id:"+id);
        System.out.println("Employee salary:"+salary);
        System.out.println("Employee age:"+age);

    }
    public static void main(String[] args){
        Employee emp1=new Employee("xyz",101,500000.0 ,24);
        emp1.displayInfo();
    }
}