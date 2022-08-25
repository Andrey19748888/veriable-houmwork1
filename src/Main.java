public class Main {
    public static void main(String[] args) {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var diff = boxerWeight2 - boxerWeight1;
        System.out.println("разница в весе боксеров" + diff + " кг");
        var diff2 = boxerWeight2 % boxerWeight1;
        System.out.println("остаток от деления" + diff2);

    }
}