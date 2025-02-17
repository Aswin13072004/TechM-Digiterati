package Week_3_Tasks.Task_2;

public class Employee {
    private int empId;
    private String empName;
    private double sal;
    private int yearsWorked;

    public void setEmplyoyeeDetails(int empId,String empName,double sal, int yearsWorked){
        this.empId=empId;
        this.empName=empName;
        this.sal=sal;
        this.yearsWorked=yearsWorked;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee ID : "+this.empId);
        System.out.println("Employee Name : "+this.empName);
        System.out.println("Salary : "+this.sal);
        System.out.println("Years Worked : "+this.yearsWorked);
    }

    public void getLoanEligibity(){
        double annual_sal = sal*12;
        double loan=0;


            if(annual_sal>=1500000){
                loan=700000;
            }
            else if (annual_sal>=1000000) {
                loan=500000;
            }
            else if (annual_sal>=600000) {
                loan=200000;
            }

            if (yearsWorked<=5) {
                System.out.println("you are not elligible for the loan");
            }
            else if (loan !=0) {
                System.out.println("you are eligible for loan amount of "+loan);
            }
            else{
                System.out.println("you are not eligible for the loan");
            }
        

    }
}
