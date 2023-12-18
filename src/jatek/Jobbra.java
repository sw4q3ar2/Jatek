
package jatek;

public class Jobbra extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Jobbra jöttél";
    }

    @Override
    public Helyszin egyikIrany() {
       return new Kelet();
    }

    @Override
    public String BtnFelirat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String masikBtn() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String masikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
