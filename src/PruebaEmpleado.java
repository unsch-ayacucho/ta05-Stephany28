import java.util.*;
public class PruebaEmpleado {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		Empleado persona = new Empleado();
		
		persona.nombre="Melanie";
		persona.codigo=458;
		persona.areaLaboral="Empresaria";
		persona.sueldo=1500;
		persona.horasExtra=4;
		persona.Datos();
		persona.CalculoDescuentos();
		persona.PagoHorasExtra();

	}

}
