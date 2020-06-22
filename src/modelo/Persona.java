package modelo;

public class Persona {
	protected String nombre;
	protected String correo;
	protected String ciudad;
	protected int monto;

	
	
	
	public Persona(String nombre, String correo, String ciudad, int monto) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.ciudad = ciudad;
		this.monto = monto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "Nombre= " + nombre + "\n correo= " + correo + "\n ciudad= " + ciudad + "\n monto= " + monto ;
	}
	
	
	
}
