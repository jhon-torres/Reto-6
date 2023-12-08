package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// Creo 3 objetos Cuenta y lo referencio con cuenta1, cuenta2 y cuenta3
		Cuenta cuenta1 = new Cuenta("03476");
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		Cuenta cuenta3 = new Cuenta("03476");
		// creo 3 objetos Cuenta y lo referencio con cuenta4, cuenta5 y cuenta6
		Cuenta cuenta4 = new Cuenta("0987");
		Cuenta cuenta5 = new Cuenta("0557", "C", 10);
		Cuenta cuenta6 = new Cuenta("0666");

		// Coloco un valor de saldo en la cuenta1
		cuenta1.setSaldo(675);

		// Modifico el tipo de cuenta3
		cuenta3.setTipo("C");

		// modifico los atributos de cuenta4
		cuenta4.setSaldo(10);

		// imprimo cuentas
		System.out.println("---------Valores Iniciales---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();

		System.out.println("---------Valores Modificados---------");
		// modifico el saldo de la cuenta1
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();

		// imprimir cuenta4, cuenta5 y cuenta6
		System.out.println("--------------Mi Estilo--------------");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();

	}

}
