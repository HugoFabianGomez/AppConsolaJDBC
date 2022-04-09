package ejercicio3;

public class instOficinas {
	
	private int cantOficinas;

	public instOficinas(int cantOficinas) {
		super();
		this.cantOficinas = cantOficinas;
	}

	public int getCantOficinas() {
		return cantOficinas;
	}

	public void setCantOficinas(int cantOficinas) {
		this.cantOficinas = cantOficinas;
	}

	@Override
	public String toString() {
		return "instOficinas [cantOficinas=" + cantOficinas + "]";
	}
	
	
}
