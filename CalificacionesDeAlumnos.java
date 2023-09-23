
public class CalificacionesDeAlumnos {

	public static void main(String[] args) {
		
	// Variables
		
		String Nombre;
	    int [] Calificaciones = {50,60,70,80,90,100};
	    
	    //Operacion de variables
	    public CalificacionesDeAlumnos (String Nombre, int[]Calificaciones) {
	    	this.Nombre = Nombre;
	    	this.Calificaciones = Calificaciones;
	    	
	    }
	    
	    //Método de cáldulo de promedio
	    
	    public double CalcularPromedio () {
	    	int suma=0;
	    	for (int Calificacion:Calificaciones) {
	    		suma+=Calificacion;
	    	}
	    	return suma;
	    }
	    	
	    // Método para calcular las calificación
	    public char CalificacionFinalMateria () {
	    	
	    	double Promedio;
	    	char CalificacionFinal;
	    	if (Promedio>=91 && Promedio<=100) {
	    		
		    		CalificacionFinal='A';
		    	} else if (Promedio>=81 && Promedio<=90) {
		    		CalificacionFinal='B';
		    	} else if (Promedio>=71 && Promedio<=80) {
		    		CalificacionFinal='C';
		    	} else if (Promedio>=61 && Promedio<=70) {
		    		CalificacionFinal='D';
		    	} else if (Promedio>=51 && Promedio<=60) {
		    		CalificacionFinal='D';
		    	} else if (Promedio<=50) {
		    		CalificacionFinal='F';
		    	}
		    		return CalificacionFinal; 	    	
		    	}
	    
	    
	    // Método para imprimir las calificaciones del alumno
	    
	    public void ImprimirCalificacion () {
	    	System.out.println("Nombre del Estudiante: " + Nombre);
	    	System.out.println("Calificaciones: ");
	    	for (int i=0; i<Calificaciones.length;i++) {
	    		System.out.println("Materia: " + (i+1) + ": " + Calificaciones[i]);
	    	}
	    	
	    	double promedio = CalcularPromedio ();
	    	char ObtenerCalificacionFinal = CalificacionFinalMateria (promedio);
	    	System.out.println("Promedio: " + promedio);
	    	System.out.println("Calificación final: " + CalificacionFinal);
	    	
	    }
	    
	}

}
