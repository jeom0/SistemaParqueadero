package modelo;

public class Vehiculo {
    
    private String id;
    private String placa;
    private String tipovehiculo;
    private String fechaingreso;
    private String horaentrada;
    private String horasalida;
    
    public Vehiculo() {
        
    }
    
    public Vehiculo(String id, String placa, String tipovehiculo, String fechaingreso, String horaentrada, String horasalida) {
        this.id = id;
        this.placa = placa;
        this.tipovehiculo = tipovehiculo;
        this.fechaingreso = fechaingreso;
        this.horaentrada = horaentrada;
        this.horasalida = horasalida;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }
    
    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
    
    public String getHoraentrada() {
        return horaentrada;
    }

    public void setHoraentrada(String horaentrada) {
        this.horaentrada = horaentrada;
    }
    
    public String getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }
    

   
}