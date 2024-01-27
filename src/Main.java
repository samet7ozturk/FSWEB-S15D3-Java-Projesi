import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Samet", "Ozturk"));
        employees.add(new Employee(1, "Samet", "Ozturk"));
        employees.add(new Employee(2, "Gokay", "Ay"));
        employees.add(new Employee(2, "Gokay", "Ay"));
        employees.add(new Employee(3, "Hamza", "Sahin"));
        employees.add(new Employee(3, "Hamza", "Sahin"));
        employees.add(new Employee(4, "Kaim", "Arvas"));
        employees.add(new Employee(4, "Kaim", "Arvas"));
        employees.add(new Employee(5, "Hamza", "Sahin"));

        List<Employee> removedEmployees = new ArrayList<>();
        Map<Integer, Employee> employeeMap = new HashMap<>();

        Iterator<Employee> item = employees.iterator();
        while (item.hasNext()){
            Employee employee = item.next();
            if (employee == null){
                System.out.println("Null data!");
                continue;
            }
            if (employeeMap.containsKey(employee.getId())){
                removedEmployees.add(employee);
                item.remove();
            }else{
                employeeMap.put(employee.getId(), employee);
            }
        }
        System.out.println(employeeMap);
        System.out.println("*****************");
        System.out.println(removedEmployees);
        System.out.println("*****************");
        System.out.println(item);
    }
}