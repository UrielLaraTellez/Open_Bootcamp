import com.ejercicio1.SmartWatch;
import com.ejercicio1.SmarthPhone;

public class Main {
    public static void main(String[] args) {
        SmartWatch appleWatch = new SmartWatch(5,1,22);
        SmarthPhone iPhone = new SmarthPhone(15,3,4611293,2);

        System.out.println(appleWatch);
        System.out.println(iPhone);
    }
}
