package pagoEstudiante;

import java.io.ObjectInputStream.GetField;

public class program {

	public static void main(String[] args) {

		estudiante T1 = new estudiante("Juan", 200);
		estudiante T2 = new estudiante("Jhon", 450);
		estudiante T3 = new estudiante("Carlos", 1000);
		
		colegio C1 = new colegio();
		C1.getEstudianter(T1);
		C1.getEstudianter(T2);
		C1.getEstudianter(T3);
		
		float promedio = C1.promedio();
		//System.out.println("Valor promedio: " + promedio);
		
		float mayorPago = C1.mayorValor();
		//System.out.println("Mayor valor pagado: " + mayorPago);
		
		float diferencia = C1.gefDifAvg();
		System.out.println("La diferencia entre promedio y mayor pago es: " + diferencia );
		
	}

}
