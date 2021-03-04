package proyecto1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MateTPE_PARTE2 {
	final static int MAX =200000;

	public static void main(String[] args) {
		BufferedReader entrada2 = new BufferedReader(new InputStreamReader(System.in));
		double K = 0;
		double entrada = 0.0005;
		int deltaT = 1, t = 1;
		double A = 0.5, H = 0.25, C = 2.0;
		double[] h = new double[MAX];
		h[0] = H;
		try {
			System.out.println("ingrese un delta T");
			deltaT= new Integer (entrada2.readLine());
			System.out.println("ingrese un numero de entrada > 0");
			entrada= new Double(entrada2.readLine());
			System.out.println("ingrese un numero de A > 0");
			A= new Double(entrada2.readLine());
			System.out.println("ingrese un numero de H > 0");
			H= new Double(entrada2.readLine());
			System.out.println("ingrese un numero de C > 0");
			C= new Double(entrada2.readLine());
			System.out.println("ingrese un numero k");
			K = new Double(entrada2.readLine());
			int i = mediarTanque(h, deltaT, t, entrada, A, C,K);
			mostrar("Tanque a la mitad en (segundos) ", i);
			int ti = llenarTanque(h, deltaT, t, entrada, A, C, K);
			mostrar("Tanque lleno en (segundos) ", ti);
			int tv = vaciarTanque(h, deltaT, A, C, ti,K);
			mostrar("Tanque vacío en (segundos) ", tv);	
		}
			catch (Exception exc) {
				System.out.println();
			}
	}

	public static double salida_1(double k, int t) {
		double nueva_salida;
		nueva_salida = (k*t);
		return nueva_salida;
	}

	public static int llenarTanque(double[] h, int deltaT, int t, double entrada, double A, double C,double k) {
		int i=0;
		while (t < MAX) {
			h[t] = h[t - 1] + ((entrada - (salida_1(k,t))) * (deltaT / A));
			int ht = (int) h[t];
			if (ht == C) {
				i = t;
				t = MAX;
				}
			t++;
		}
		return i;
	}

	public static int mediarTanque(double[] h, int deltaT, int t, double entrada, double A, double C,double k) {
		int i = 0;
		while (t < MAX) {
			h[t] = h[t - 1] + ((entrada - (salida_1(k,t))) * (deltaT / A));
			int ht = (int) h[t];
			if (ht == C / 2) {
				System.out.println("");
				i = t;
				t = MAX;
			}
			t++;
		}
		return i;
	}

	public static int vaciarTanque(double[] h, int deltaT, double A, double C, int ti, double k) {
		int tv = 0;
		double entrada = 0;
		while (ti < MAX) {
			h[ti] = h[ti - 1] + ((entrada - (salida_1(k,ti))) * (deltaT / A));
			int ht = (int) h[ti];
			if (ht == 0) {
				tv = ti;
				ti = MAX;
			}
			
			ti++;
		}
		return tv;
	}

	public static void mostrar(String msj, int i) {
		System.out.println(msj + i);
	}
}
