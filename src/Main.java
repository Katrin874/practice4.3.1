public class Main {
    public static void main(String[] args) {
        Cadet[] cadets = new Cadet[32];
        Cadet cadet1 = Cadet.of(0, "Ivan", "Ivanov", SpecialatyTrends.Analytics);
        Cadet cadet2 = Cadet.of(1, "Petr", "Petrov", SpecialatyTrends.Cybersecurity);
        CadetUtil.insert(cadets, cadet1);
        CadetUtil.insert(cadets, cadet2);
        CadetUtil.printInfo(cadets, 0);
        CadetUtil.printInfo(cadets, 1);
        CadetUtil.printAll(cadets);
        CadetUtil.delete(cadets, 1);
        CadetUtil.printAll(cadets);
    }
}