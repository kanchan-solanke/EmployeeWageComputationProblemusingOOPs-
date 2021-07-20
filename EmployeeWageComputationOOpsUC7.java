public class EmployeewageComputationProblemUC7 {
    public static final int isPartTime=1;
    public static final int isFullTime = 2;
    public static final int empRatePerHour = 20;
    public static final int numOfWorkingDays = 2;
    public static final int maxHrsinMonth = 10;

    public static int computeEmployeewage() {
        int empHrs = 0, totalEmphrs = 0, totalWorkingDays = 0;

        while (totalEmphrs <= maxHrsinMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case isPartTime:
                    empHrs = 4;
                    break;
                case isFullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmphrs += empHrs;
            System.out.println("Day:" + totalWorkingDays + "Emp hr:" + empHrs);
        }
        int totalEmpWage = totalEmphrs * empRatePerHour;
        System.out.println("total employee wage:" + totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args){
        computeEmployeewage();
}
        }

    
