public class EmployeeComputationProgramUC2 {
    private static int empRatePerHour = 20;
    private static int empHrs;
    private static int empWage;
    private static double empCheck = Math.floor(Math.random() * 10) % 2;
    private static double isFullTime = 1;

    public static int computeEmployeewage() {
        if (empCheck == isFullTime)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * empRatePerHour;
       System.out.println("empwge is:"+empWage);
        return empWage;
    }
public static void main(String[] args){
        computeEmployeewage();

}

    public static void setEmpRatePerHour(int empRatePerHour) {
        EmployeeComputationProgramUC2.empRatePerHour = empRatePerHour;
    }
}
