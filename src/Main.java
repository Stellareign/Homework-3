public class Main {
    public static void main(String[] args) {
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println(totalWeight);
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println(weightDifference);
        var weightDifference2 = weightBoxer2 % weightBoxer1;
        System.out.println(weightDifference2);
        System.out.println("Задание 8, п.1:");
        var timeFond = 640;
        var peopleDayFond = 8;
        var totalEmployees = timeFond / peopleDayFond;
        System.out.println("Всего работников в компании – " + totalEmployees + " человек.");
        System.out.println("Задание 8, п.2:");
        totalEmployees = totalEmployees + 94;
        timeFond = totalEmployees * 8;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + timeFond + " часов работы может быть поделено между сотрудниками.");
    }
}