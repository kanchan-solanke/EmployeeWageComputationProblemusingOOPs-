public class EmployeewageComputationProblemUC1 {
    public static final int isFullTime = 1;
    private static int empCheck = (int) (Math.floor(Math.random() * 10) % 2);

    public static void computeEmployeewage() {
        if (empCheck == isFullTime)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
    public static void main(String[] args) {
        computeEmployeewage();
    }
}
