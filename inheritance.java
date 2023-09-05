/**
 *
 * @author @briella.yb
 */
class Hewan{
    public void memburu(){
        System.out.println("menyergap");
    }
}
class buaya extends Hewan{
    public void makan(){
        System.out.println("Makan Ayam");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Hewan input1 = new Hewan();
            buaya input2 = new buaya();
                input2.memburu();
                input2.makan();
    }
}
