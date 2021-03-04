package proyecto1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MateTPE {
	final static int MAX = 20000;
	
	public static void main(String[] args) {
		BufferedReader entrada2 = new BufferedReader(new InputStreamReader(System.in));
		double entrada = 0.0005; 
		double salida =0;
		int deltaT =1, t =1;
		double A = 0.5, H = 0.25, C = 2.0;
		double[] h = new double [MAX];
		h[0] = H;
		try {
			System.out.println("ingrese un delta T");
			deltaT= new Integer (entrada2.readLine());
			System.out.println("ingrese un H[m]");
			H= new Double (entrada2.readLine());
			System.out.println("ingrese un numero de entrada > 0");
			entrada= new Double(entrada2.readLine());
			System.out.println("ingrese un numero de salida > 0");
			salida= new Double(entrada2.readLine());
			System.out.println("ingrese un numero de A > 0");
			A= new Double(entrada2.readLine());
			System.out.println("ingrese un numero de C > 0");
			C= new Double(entrada2.readLine());
			int i = mediarTanque(h, deltaT, t, entrada,salida, A, C);
			mostrar("Tanque a la mitad en (segundos) ", i);
			int ti = llenarTanque(h, deltaT, t, entrada,salida, A, C);
			mostrar("Tanque lleno en (segundos) ", ti);
			int tv = vaciarTanque(h, deltaT, A,salida, C, ti);
			mostrar("Tanque vacío en (segundos) ", tv);
			}
			catch (Exception exc) {
			System.out.println (exc);
			};
		}
	
	public static int llenarTanque(double[] h, int deltaT, int t, double entrada,double salida, double A, double C) {
		int i=0;
		while (t < MAX) {
			h[t] = h[t-1] + (entrada - salida)*(deltaT / A);
			int ht = (int) h[t];
			if (ht == C) {
				i = t;
				t = MAX;
			}
			if (ht> C) {
				System.out.println("se rebalso el tanque");
				i=t;
				t= MAX;
			}
			t++;
		}
		return i;
	}
	
	public static int mediarTanque(double[] h, int deltaT, int t, double entrada,double salida, double A, double C) {
		int i = 0;
		while (t < MAX) {
			h[t] = h[t-1] + (entrada - salida)*(deltaT / A);
			int ht = (int) h[t];
			System.out.println("tiempo"+t);
			System.out.println(ht);
			if (ht == C/2) {
				System.out.println("");
				i = t;
				t = MAX;
			}
			t++;
		}
		return i;
	}
	
	public static int vaciarTanque(double[] h, int deltaT, double A,double salida, double C, int ti) {
		int tv = 0;
		double entrada = 0;
		while (ti < MAX) {
			h[ti] = h[ti-1] + (entrada - salida)*(deltaT / A);
			int ht = (int) h[ti];
			if (ht == 0) {
				tv = ti;
				ti = MAX;
			}
			ti++;
		}
		return tv;
	}
	
	public static void mostrar (String msj, int i) {
		System.out.println(msj+i);
	}
}/* cuando la entrada es mas grande que la salida se llena mucho mas rapido y tarda en vaciarse */
/* Si la salida es muy peque;a nunca va a llegar a vaciarse*/
/* si la salida es mas grande que la entrada nunca va a alcanzar a llenarse*/