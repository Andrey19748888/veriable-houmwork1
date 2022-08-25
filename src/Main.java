public class Main {
    public static void main(String[] args) {
        var hoursCommon = 640;
        var workingDay = 8;
        var ammountWorkers = hoursCommon / workingDay;
        System.out.println(" Всего работников в компании " +   ammountWorkers   +   " человек ");
        var newPeople = 94;
        var ammountWorkers2 = ammountWorkers + newPeople;
        System.out.println(" работает работников " + ammountWorkers2);
        var  hoursCommon2 = hoursCommon / ammountWorkers2;
        System.out.println(" Если в компании работает 174 человека, то всего " + hoursCommon2 + " часа работы может быть поделено между сотрудниками  ");


    }
}