public class EmployeeBook {
    private static final int arrCount = 10;
    private Employee[] arr = new Employee[arrCount];
    public void createNewEmployee(String fullName, int department, double salary) {
        Employee employee = new Employee(fullName, department, salary);
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] == null) {
                arr[i] = employee;
                break;
            }
        }
    }
    public void deleteEmployee(int id) {
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    arr[i] = null;
                }
            }
        }
    }
    public void deleteEmployee(String fullName) {
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if ((arr[i].getFullName()).equals(fullName)) {
                    arr[i] = null;
                }
            }
        }
    }
    //Придумать архитектуру. Сделать или два метода, или один, но продумать его.
    //если введенный параметр равен -1, то метод ничего не будет изменять.
    public void changeParametersEmployee(String fullName, int department, double salary) {
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if ((arr[i].getFullName().equals(fullName))) {
                    if (department != -1) {
                        arr[i].setDepartment(department);
                    }
                    if (salary != -1) {
                        arr[i].setSalary(salary);
                    }
                }
            }
        }
    }

    public void printAllEmployersFullNameByDepartment() {
        for (int i = 1; i < 6; i++) {
            printFullNameByDepartment(i);
        }
    }
    public void printFullNameByDepartment(int department) {
        System.out.println("Department " + department +": ");
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == department) {
                    System.out.print(arr[i].getFullName() + ", ");
                }
            }
        }
    }
//-----------------------------------------------------------------
    public void printAllEmployersInfo() {
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                System.out.print(arr[i].toString() + " || ");
            }
        }
    }
    public double getAllSalary() {
        double allSalary = 0;
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                allSalary = arr[i].getSalaryInfo() + allSalary;
            }
        }
        return allSalary;
    }
    public double getMinSalary() {
        double minSalary = Double.MAX_VALUE;
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if (arr[i].getSalaryInfo() < minSalary) {
                    minSalary = arr[i].getSalaryInfo();
                }
            }
        }
        return minSalary;
    }
    public double getMaxSalary() {
        double maxSalary = Double.MIN_VALUE;
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if (arr[i].getSalaryInfo() > maxSalary) {
                    maxSalary = arr[i].getSalaryInfo();
                }
            }
        }
        return maxSalary;
    }
    public double getMiddleSalary() {
        double middleSalary = 0;
        double allSalary = 0;
        int countFullCell = 0;
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                countFullCell++;
                allSalary = arr[i].getSalaryInfo() + allSalary;
            }
        }
        middleSalary = allSalary / countFullCell;
        return middleSalary;
    }
    public void printFullNameAllEmployers() {
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                System.out.print(arr[i].getFullName() + " || ");
            }
        }
    }
    //Hard-mode
    /* задание:
    Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
    1. Сотрудника с минимальной зарплатой.
    2. Сотрудника с максимальной зарплатой.
    3. Сумму затрат на зарплату по отделу.
    4. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
    5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    6. Напечатать всех сотрудников отдела (все данные, кроме отдела).
     */
    public Employee[] getSalaryIndexing(int index) {
        index = index / 100;
        for (int i = 0; i < arrCount; i++) {
            double salaryIncrease = 0;
            if (arr[i] != null) {
                salaryIncrease = arr[i].getSalaryInfo() + (arr[i].getSalaryInfo() * index);
                arr[i].setSalary(salaryIncrease);
            }
        }
        return arr;
    }
    public double getMinSalaryOfDepartment(int department) {
        double minSalary = Double.MAX_VALUE;
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == department) {
                    if (arr[i].getSalaryInfo() < minSalary) {
                        minSalary = arr[i].getSalaryInfo();
                    }
                }
            }
        }
        return minSalary;
    }
    public double getMaxSalaryOfDepartment(int department) {
        double maxSalary = Double.MIN_VALUE;
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == department) {
                    if (arr[i].getSalaryInfo() > maxSalary) {
                        maxSalary = arr[i].getSalaryInfo();
                    }
                }
            }
        }
        return maxSalary;
    }
    public double getAllSalaryOfDepartment(int department) {
        double allSalary = 0;
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == department) {
                    allSalary = arr[i].getSalaryInfo() + allSalary;
                }
            }
        }
        return allSalary;
    }
    public double getMiddleSalaryOfDepartment(int department) {
        double countEmployeeOfDepartment = 0;
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == department) {
                    countEmployeeOfDepartment++;
                }
            }
        }
        return getAllSalaryOfDepartment(department) / countEmployeeOfDepartment;
    }
    public Employee[] getSalaryIndexingOfDepartment(int department, int index) {
        index = index / 100;
        for (int i = 0; i < arrCount; i++) {
            double salaryIncrease = 0;
            if (arr[i] != null) {
                if (arr[i].getDepartment() == department) {
                    salaryIncrease = arr[i].getSalaryInfo() + (arr[i].getSalaryInfo() * index);
                    arr[i].setSalary(salaryIncrease);
                }
            }
        }
        return arr;
    }
    public void printAllEmployersInfoOfDepartment(int department) {
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == department) {
                    System.out.print(arr[i].getFullName() + ", " + arr[i].getSalaryInfo() + " || ");
                }
            }
        }
    }
    public void printAllEmployersBelowSalary(double salary) {
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if (arr[i].getSalaryInfo() < salary) {
                    System.out.print(arr[i].getId() + ", " + arr[i].getFullName() + ", " + arr[i].getSalaryInfo() + " || ");
                }
            }
        }
    }
    public void printAllEmployersAboveSalary(double salary) {
        for (int i = 0; i < arrCount; i++) {
            if (arr[i] != null) {
                if (arr[i].getSalaryInfo() >= salary) {
                    System.out.print(arr[i].getId() + ", " + arr[i].getFullName() + ", " + arr[i].getSalaryInfo() + " || ");
                }
            }
        }
    }
}
