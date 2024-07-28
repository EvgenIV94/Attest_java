package Attest_java;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class NotebookStore {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Dell", 8, 256, "Windows", "Black"));
        notebooks.add(new Notebook("HP", 16, 512, "Windows", "Silver"));
        notebooks.add(new Notebook("Apple", 8, 256, "macOS", "Gray"));
        notebooks.add(new Notebook("Lenovo", 12, 1024, "Windows", "Black"));
        notebooks.add(new Notebook("Asus", 8, 512, "Linux", "White"));

        filterNotebooks(notebooks);
    }

    public static void filterNotebooks(Set<Notebook> notebooks) {
        Scanner scanner = new Scanner(System.in);
        FilterCriteria criteria = new FilterCriteria();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ (в GB)");
        System.out.println("2 - Объем ЖД (в GB)");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int criterion = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (criterion) {
            case 1:
                System.out.println("Введите минимальное значение ОЗУ:");
                criteria.setRam(scanner.nextInt());
                break;
            case 2:
                System.out.println("Введите минимальное значение объема ЖД:");
                criteria.setHdd(scanner.nextInt());
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                criteria.setOs(scanner.nextLine());
                break;
            case 4:
                System.out.println("Введите цвет:");
                criteria.setColor(scanner.nextLine());
                break;
            default:
                System.out.println("Некорректный критерий.");
                return;
        }

        Set<Notebook> filteredNotebooks = notebooks.stream()
                .filter(notebook -> criteria.matches(notebook))
                .collect(Collectors.toSet());

        System.out.println("Ноутбуки, соответствующие критериям:");
        filteredNotebooks.forEach(System.out::println);
    }
}
