package Model;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] dados = {
                "57,Vendas,8032,Meire Silva,8000.0,57",
                "32,Estoque,4368,Dom Dias,7000.0,32",
                "57,Vendas,3298,Pedro Neto,8500.0,57",
                "57,Vendas,8639,Carol Souza,9000.0,57",
                "18,Marketing,6421,Davi Souto,7500.0,18",
                "32,Estoque,7523,Lara Matos,8000.0,32",
                "18,Marketing,2732,Bob Costa,6500.0,18"
        };
        HashMap<Department, List<Employee>> departmentListHashMap = new HashMap<>();
        for (String dado : dados){
            String[] dadoSplit = dado.split(",");
            Department department = new Department(Integer.parseInt(dadoSplit[0]), dadoSplit[1]);
            Employee employee = department.addEmployee(department, Integer.parseInt(dadoSplit[2]), dadoSplit[3],Double.parseDouble(dadoSplit[4]));

            if (!departmentListHashMap.containsKey(department)) {
                departmentListHashMap.put(department, new ArrayList<>());
            }
            departmentListHashMap.get(department).add(employee);
        }

        List<Map.Entry<Department, List<Employee>>> sortedList = new ArrayList<>(departmentListHashMap.entrySet());
        sortedList.sort(Comparator.comparing(a -> a.getKey().getName()));
        for (Map.Entry<Department,List<Employee>> department : sortedList){
            System.out.println(department.getKey().getName() + ":");
            for (Employee employee : department.getValue()){
                System.out.println(" " + employee.getId() + ": " + employee.getName() + ", $" + employee.getSalary());
            }
        }
    }
}
