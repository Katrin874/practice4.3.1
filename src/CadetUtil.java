public class CadetUtil {
    public static void insert(Cadet[] cadets, Cadet cadet){
        if(cadet.id < 0 || cadet.id >= cadets.length){
            System.out.println("Invalid ID");
            return;
        }
        cadets[cadet.id] = cadet;
    }
    public  static Cadet search(Cadet[] cadets, int id){
        if(id < 0 || id >= cadets.length){
            System.out.println("Invalid ID");
            return null;
        }
        return cadets[id];
    }
    public static Cadet delete(Cadet[] cadets, int id){
        if (id < 0 || id >= cadets.length) {
            System.out.println("Invalid ID");
            return null;
        }
        Cadet cadet = cadets[id];
        cadets[id] = null;
        return cadet;
    }
    public  static void printInfo(Cadet[] cadets, int id){
        Cadet cadet = search(cadets, id);
        if(cadet != null){
            System.out.println("ID: " + cadet.id);
            System.out.println("Name " + cadet.name);
            System.out.println("LastName " + cadet.lastName);
            System.out.println("Speciality " + cadet.specialaty);
        }else {
            System.out.println("Cadet not found");
        }
    }
    public static void printAll (Cadet[] cadets){
        for (Cadet cadet : cadets){
            if(cadet != null){
                printInfo(cadets, cadet.id);
                System.out.println("--------------------------");
            }
        }
    }
}
