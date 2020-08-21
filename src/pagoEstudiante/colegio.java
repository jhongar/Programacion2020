package pagoEstudiante;

public class colegio {

	 int CAPACIDAD_MAXIMA = 10;
	 int cantidad = 0;
	 float totalPromedio=0;
	 float mayor=0;
	 float diferencia;
	 
	 estudiante[] arrEstudientes = new estudiante[CAPACIDAD_MAXIMA];
	 
	float gefDifAvg ()
	{
		diferencia = totalPromedio - mayor;
		return diferencia;
	}
	
	float promedio()
	{
		for(int i=0; i<cantidad; i++) {
			totalPromedio = arrEstudientes[i].vlrPago + totalPromedio;
		}
		totalPromedio=totalPromedio/cantidad;
		
		return totalPromedio;
	}
	
	float mayorValor()
	{
		for(int i=0; i<cantidad; i++) {
			for(int k=i+1; k<cantidad; k++) {
				if(arrEstudientes[i].vlrPago > arrEstudientes[k].vlrPago) {
					mayor = arrEstudientes[i].vlrPago;
				}
				else {
					mayor = arrEstudientes[k].vlrPago;
				}
			}
		}
		return mayor;
	}
	
	 void getEstudianter(estudiante estudiante) 
	 {
		if(cantidad > CAPACIDAD_MAXIMA - 1) {
			System.out.println("ERROR");
		}
		else {
			arrEstudientes[cantidad] = estudiante;
			cantidad++;
		}
	}
	 
	 
	 float llamadoMetodos()
		{
		 float llamado=0;
			promedio();
			mayorValor();
			//gefDifAvg();
			return llamado;
		}
	 
}
