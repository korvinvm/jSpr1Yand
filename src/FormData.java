import java.util.ArrayList;

public class FormData {

    public ArrayList<String> mounts = new ArrayList<>();

     void addMount() {
        mounts.add("Январь");
        mounts.add("Февраль");
        mounts.add("Март");
        mounts.add("Апрель");
        mounts.add("Май");
        mounts.add("Июрь");
        mounts.add("Июль");
        mounts.add("Август");
        mounts.add("Сентябрь");
        mounts.add("Октябрь");
        mounts.add("Ноябрь");
        mounts.add("Декабрь");

    }

    public boolean chekData(String fMount) {
        return mounts.contains(fMount);
    }
    //@Override
    /*public String toSrting(){
    String res = "";
        for (String secMmount : this.mounts) {
            res += secMmount;
        }
    return res;
    }*/
}


