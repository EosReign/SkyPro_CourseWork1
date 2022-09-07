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
    //Hard-mode
    //Ля, я же мог сделать новую ветку, а не делать отдельный проект! чука. Благо я тупой и написал код в этом проекте. Хоть в чем-то плюсики имеются.:Ъ
    /* задание:
    Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
    1. Сотрудника с минимальной зарплатой.
    2. Сотрудника с максимальной зарплатой.
    3. Сумму затрат на зарплату по отделу.
    4. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
    5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    6. Напечатать всех сотрудников отдела (все данные, кроме отдела).
     */
    public static Employee[] getSalaryIndexing(Employee[] arr, int index) {
        index = index / 100;
        for (int i = 0; i < arrCount; i++) {
            double salaryIncrease = 0;
            salaryIncrease = arr[i].getSalaryInfo() + (arr[i].getSalaryInfo() * index);
            arr[i].setSalary(salaryIncrease);
        }
        return arr;
    }
    public static double getMinSalaryOfDepartment(Employee[] arr, int department) {
        //ну тут сложновато делать какие-то манипуляции с мин зарплатой. поставлю невозможную цифру.
        double minSalary = 900000000;
        for (int i = 0; i < arrCount; i++) {
            if (arr[i].getDepartment() == department) {
                if (arr[i].getSalaryInfo() < minSalary) {
                    minSalary = arr[i].getSalaryInfo();
                }
            }
        }
        return minSalary;
    }
    public static double getMaxSalaryOfDepartment(Employee[] arr, int department) {
        double maxSalary = 0;
        for (int i = 0; i < arrCount; i++) {
            if (arr[i].getDepartment() == department) {
                if (arr[i].getSalaryInfo() > maxSalary) {
                    maxSalary = arr[i].getSalaryInfo();
                }
            }
        }
        return maxSalary;
    }
    public static double getAllSalaryOfDepartment(Employee[] arr, int department) {
        double allSalary = 0;
        for (int i = 0; i < arrCount; i++) {
            if (arr[i].getDepartment() == department) {
                allSalary = arr[i].getSalaryInfo() + allSalary;
            }
        }
        return allSalary;
    }
    public static double getMiddleSalaryOfDepartment(Employee[] arr, int department) {
        double countEmployeeOfDepartment = 0;
        for (int i = 0; i < arrCount; i++) {
            if (arr[i].getDepartment() == department) {
                countEmployeeOfDepartment++;
            }
        }
        return getAllSalaryOfDepartment(arr, department) / countEmployeeOfDepartment;
    }
    public static Employee[] getSalaryIndexingOfDepartment(Employee[] arr, int department, int index) {
        index = index / 100;
        for (int i = 0; i < arrCount; i++) {
            double salaryIncrease = 0;
            if (arr[i].getDepartment() == department) {
                salaryIncrease = arr[i].getSalaryInfo() + (arr[i].getSalaryInfo() * index);
                arr[i].setSalary(salaryIncrease);
            }
        }
        return arr;
    }
    public static void printAllEmployersInfoOfDepartment(Employee[] arr, int department) {
        for (int i = 0; i < arrCount; i++) {
            if (arr[i].getDepartment() == department) {
                System.out.print(arr[i].getFullName() + ", " + arr[i].getSalaryInfo() + " || ");
            }
        }
    }
    public static void printAllEmployersBelowSalary(Employee[] arr, double salary) {
        for (int i = 0; i < arrCount; i++) {
            if (arr[i].getSalaryInfo() < salary) {
                System.out.print(arr[i].getId() + ", " + arr[i].getFullName() + ", " + arr[i].getSalaryInfo() + " || ");
            }
        }
    }
    public static void printAllEmployersAboveSalary(Employee[] arr, double salary) {
        for (int i = 0; i < arrCount; i++) {
            if (arr[i].getSalaryInfo() >= salary) {
                System.out.print(arr[i].getId() + ", " + arr[i].getFullName() + ", " + arr[i].getSalaryInfo() + " || ");
            }
        }
    }
}
