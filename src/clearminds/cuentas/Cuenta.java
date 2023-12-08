package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;

	// constructores
	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
	}

	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	// getters y setters
	public String getId() {
		return id;
	}

	/*
	 * public void setId(String id) { this.id = id; }
	 */

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// método imprimir formato del taller1
	public void imprimir() {
		System.out.println("**************************");
		System.out.println("Cuenta");
		System.out.println("**************************");
		System.out.println("Número de Cuenta: " + this.id);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Saldo: USD " + this.saldo);
		System.out.println("**************************");
		System.out.println();
	}

	// método imprimir con propio estilo
	public void imprimirConMiEstilo() {
		System.out.println("-------------------------------");
		System.out.println("|           Cuenta");
		System.out.println("-------------------------------");
		System.out.println("| Número de Cuenta: " + this.id);
		System.out.println("| Tipo: " + this.tipo);
		System.out.println("| Saldo: USD " + this.saldo);
		System.out.println("-------------------------------");
	}

}
