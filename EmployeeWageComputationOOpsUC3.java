public class EmployeeComputationProblemUC3 {
    private static double isPartTime=1;
    private static int empHrs;
    private static int wagePerHour =20;
    private static int empWage;
    private static double empCheck= Math.floor(Math.random() * 10) % 3;

    public static int computeEmployeewage() {
        double isFullTime = 2;
        if (empCheck == isPartTime)
            empHrs = 4;
        else if (empCheck == isFullTime)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * wagePerHour;
        System.out.println("empwage is:"+empWage);
        return empWage;
    }
    public static void main(String[] args){

        computeEmployeewage();
    }

    public static void setEmpCheck(double empCheck) {
        EmployeeComputationProblemUC3.empCheck = empCheck;
    }
}
