
package jatek;

public class Balra extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Balra jöttél";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String masikBtn() {
        return "Dél";
    } 

    @Override
    public String BtnFelirat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String masikIrany() {
        return "";
    }
    
    
}
