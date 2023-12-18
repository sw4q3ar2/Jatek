
package jatek;

public class Kezdes extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
        return "Kezdés! Jobbra vagy Balra";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Jobbra();
    }

    @Override
    public Helyszin masikIrany() {
        return new Balra();
    }

    @Override
    public String egyikBtn() {
        return "Jobra";
    }

    @Override
    public String masikBtn() {
        return "Balra";
    }

    @Override
    public String BtnFelirat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
