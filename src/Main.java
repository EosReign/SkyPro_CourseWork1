public class Main {
    private static int arrCount = 10;
    public static void main(String[] args) {
        Employee[] arr = new Employee[arrCount];
        /* проверка
        Employee man1 = new Employee("Мачо Мучачо", 2, 12424);
        arr[0] = man1;
         */

        //printAllEmployersInfo(arr);
        //getAllSalary(arr);
        //printFullNameAllEmployers(arr);
    }
    public static void printAllEmployersInfo(Employee[] arr) {
        for (int i = 0; i < arrCount; i++) {
            System.out.print(arr[i].toString() + " || ");
        }
    }
    public static double getAllSalary(Employee[] arr) {
        double allSalary = 0;
        for (int i = 0; i < arrCount; i++) {
            allSalary = arr[i].getSalaryInfo() + allSalary;
        }
        return allSalary;
    }
    public static double getMinSalary(Employee[] arr) {
        double minSalary = arr[0].getSalaryInfo();
        for (int i = 0; i < arrCount; i++) {
            if (arr[i].getSalaryInfo() < minSalary) {
                minSalary = arr[i].getSalaryInfo();
            }
        }
        return minSalary;
    }
    public static double getMaxSalary(Employee[] arr) {
        double maxSalary = arr[0].getSalaryInfo();
        for (int i = 0; i < arrCount; i++) {
            if (arr[i].getSalaryInfo() > maxSalary) {
                maxSalary = arr[i].getSalaryInfo();
            }
        }
        return maxSalary;
    }
    public static double getMiddleSalary(Employee[] arr) {
        double middleSalary = 0;
        double allSalary = 0;
        for (int i = 0; i < arrCount; i++) {
            allSalary = arr[i].getSalaryInfo() + allSalary;
        }
        middleSalary = allSalary / arrCount;
        return middleSalary;
    }
    public static void printFullNameAllEmployers(Employee[] arr) {
        for (int i = 0; i < arrCount; i++) {
            System.out.print(arr[i].getFullName() + " || ");
        }
    }

}
