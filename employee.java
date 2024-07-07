public class employee{

    private int age;
    private String name;
    private double salary;

    //constructor 
    public employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge( int age){
        if ( age > 0 ) {
            this.age = age;
        }
        else{
            System.out.println("Age must be positive");
        }
    }

    public void setSalary(double salary){
        if ( salary > 0){
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive");
        }
        }

    

}