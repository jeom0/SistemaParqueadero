package modelo;

public class Tarifas {
    private int idtarifas;
    private String tipotarifa;
    private String tipovehiculo;
    
    public Tarifas() {
        
    }

    public Tarifas(int idtarifas, String tipotarifa, String tipovehiculo) {
        this.idtarifas = idtarifas;
        this.tipotarifa = tipotarifa;
        this.tipovehiculo = tipovehiculo;
    }

    public int getIdtarifas() {
        return idtarifas;
    }

    public void setIdtarifas(int idtarifas) {
        this.idtarifas = idtarifas;
    }

    public String getTipotarifa() {
        return tipotarifa;
    }

    public void setTipotarifa(String tipotarifa) {
        this.tipotarifa = tipotarifa;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }
}