package rmi.servidor;

import java.rmi.RemoteException;
import java.util.Scanner;

import bancoParejas.cuenta;
import bancoParejas.logic;
import bancoParejas.menu;

import java.lang.Math.*;

import rmi.common.*;

/***********************************************************************************
 * Implementación de clase exportada
 ***********************************************************************************/
public class ServidorImpl implements IServidor {
	
	static Scanner scan = new Scanner (System.in);
	static cuenta [] cuentas = new cuenta[10];
	static cuenta vacio = new cuenta(0,0,0);

	public void displayInsertarTarjeta() {
		System.out.println("\nBienvenido al cajero automático Wells Fargo!!!"
				+ "\nInserte su tarjeta.");
		int noTarjeta = scan.nextInt();
		for (int i = 0; i < 10; i++) {
			System.out.println(cuentas[i].getNoCuenta());
			if (cuentas[i].getNoCuenta() == noTarjeta) {
				System.out.println("[ENCONTRÓ EL NO DE CUENTA.]");
				pedirNIP(noTarjeta);
			}
		}
		System.out.println("Su tarjeta no es válida.");
		displayInsertarTarjeta();
	}
	public void pedirNIP(int noTarjeta) {
		System.out.println("\nDigite su NIP:"
				+ "\n>>>");
		int NIP = scan.nextInt();
		for (int i = 0; i < 10; i++) {
			if (cuentas[i].getNIP() == NIP && cuentas[i].getNoCuenta() == noTarjeta) {
				menuPrincipal(noTarjeta);
			}
		}
	}
	
	public void menuPrincipal(int noTarjeta) {
		System.out.println("\n¿Qué operación desea realizar?"
				+ "\n< 1 > Retirar Efectivo."
				+ "\n< 2 > Deposito."
				+ "\n< 3 > Consultar Saldo Actual.");
		int op = scan.nextInt();
		if (op == 1) {
			//Retirar
			retirarEfectivo(noTarjeta);
		} else if (op == 2) {
			//Deposito
			depositarEfectivo(noTarjeta);
		} else if (op == 3) {
			//Imprimir Saldo
			regresarTotalEfectivo(noTarjeta);
		} else {
			System.out.println("Opción Inválida.");
			menuPrincipal(noTarjeta);
		}
	}
	
	public void vaciarArray() {
		for (int i = 0; i < 10; i++) {
			cuentas[i] = vacio;
			System.out.println(cuentas[i].toString());
		}
	}
	
	public void crearCuenta() {
		cuentas[4] = new cuenta(12345678,1234,5340.2);
	}
	
	public void regresarTotalEfectivo(int noTarjeta) {
		for (int i = 0; i < 10; i++) {
			if (cuentas[i].getNoCuenta() == noTarjeta) {
				double dineroDisponible = cuentas[i].getSaldo();
				System.out.println("Tu saldo es "+dineroDisponible+".");
			}
		}
	}
	
	public void retirarEfectivo(int noTarjeta) {
		regresarTotalEfectivo(noTarjeta);
		System.out.println("\nEscribe la cantidad a Retirar");
		double efe = scan.nextDouble();
		for (int i = 0; i < 10; i++) {
			if (cuentas[i].getNoCuenta() == noTarjeta) {
				if (efe < cuentas[i].getSaldo()) {
					double cursal = cuentas[i].getSaldo();
					double saldo = cursal - efe;
					cuentas[i].setSaldo(saldo);
					System.out.println("Tu saldo es "+saldo+".");
				} else {
					System.out.println("Saldo insuficiente, digite una cantidad menor a su Saldo Actual.");
					retirarEfectivo(noTarjeta);
				}
			}
		}
		
	}
	public void depositarEfectivo(int noTarjeta) {
		regresarTotalEfectivo(noTarjeta);
		System.out.println("\nEscribe la cantidad a Depositar");
		double efe = scan.nextDouble();
		for (int i = 0; i < 10; i++) {
			if (cuentas[i].getNoCuenta() == noTarjeta) {
				double saldo = cuentas[i].getSaldo();
				cuentas[i].setSaldo(saldo+efe);
				System.out.println("Tu saldo es "+saldo+efe+".");
			}
		}
		
	}


}