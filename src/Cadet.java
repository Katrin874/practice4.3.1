public class Cadet {
    int id;
    String name;
    String lastName;
    SpecialatyTrends specialaty;
    public static Cadet of(int id, String name, String lastName, SpecialatyTrends specialaty){
        Cadet cadet = new Cadet();
        cadet.id = id;
        cadet.name = name;
        cadet.lastName = lastName;
        cadet.specialaty = specialaty;
        return cadet;
    }

}
