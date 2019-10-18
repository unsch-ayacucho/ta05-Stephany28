import java.util.Scanner;
public class PruebaEstudiante {

	public static void main(String[] args) {
		
		Scanner stdIn= new Scanner(System.in);
		
		Estudiante _n = new Estudiante();

		_n.setNom_Apellido("Melanie Herrera");
		_n.setEspecialidad("Estudiante");
		_n.setCódigo(27193101);
		_n.setNota1(15);
		_n.setNota2(14);
		_n.setNota3(10);
		_n.setNota4(19);
		
		
		System.out.println("Idéntidad: "+_n.getNom_Apellido()+ " \n Ocupación "+_n.getEspecialidad()+
				 "\n Código "+_n.getCódigo()+" \n Notas: "+_n.getNota1()+" ; "+
				_n.getNota2()+" ; "+_n.getNota3()+" ; "+_n.getNota4()+"\n Su promedio es: "+ _n.PromedioEstudiante());
	}

}
