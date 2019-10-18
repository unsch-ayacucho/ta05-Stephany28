/*****************************************************************
 * Estudiante.java
 * @author Lenovo
 *
 * Implemente una clase de nombre Estudiante con los siguientes atributos
privados: código,nombres y apellidos, especialidad, nota1, nota2, nota3, nota4. Considere
un método para calcular el promedio, sin considerar la nota menor.
 *******************************************************************/
public class Estudiante {

	private int código; int nota1;int nota2; int nota3; int nota4;
	private String nom_Apellido;String especialidad;
	int promedio;
		
	//Atributos getter con acceso public
    
	public int getCódigo() {
		return código;
	}

	public int getNota1() {
		return nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public int getNota4() {
		return nota4;
	}

	public String getNom_Apellido() {
		return nom_Apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}
	
	//Setters

	public void setCódigo(int código) {
		this.código = código;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	public void setNota4(int nota4) {
		this.nota4 = nota4;
	}

	public void setNom_Apellido(String nom_Apellido) {
		this.nom_Apellido = nom_Apellido;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
    
    
	int PromedioEstudiante() {
		
		if(nota1<nota2&&nota1<nota3&&nota1<nota4) {
		
			promedio=(nota2+nota3+nota4)/3;
		}
		else if(nota2<nota1&&nota2<nota3&&nota2<nota4) {
			
			promedio=(nota1+nota3+nota4)/3;
		}
		else if(nota3<nota1&&nota3<nota2&&nota3<nota4) {
			
			promedio=(nota1+nota2+nota4)/3;
		}
		else if(nota4<nota1&&nota4<nota2&&nota4<nota3) {
			
			promedio=(nota1+nota2+nota3)/3;
		}
		return promedio;
	}
}
