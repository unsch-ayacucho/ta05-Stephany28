/************************************************************************
 * @author Phany
 * 
 * Implemente una clase de nombre Empleado con los siguientes atributos: c�digo,
nombre, �rea laboral, sueldo, horas extras, afiliaci�n a una AFP. Adem�s,
considere atributos de valores comunes para todos los empleados, para los
porcentajes de descuento por afiliaci�n a una AFP (11% del sueldo), por afiliaci�n
al sistema nacional de pensiones (13% del sueldo) y por salud (3% del sueldo).
Considere m�todo de c�lculo para el monto de horas extras (sueldo b�sico/240
* horas extras), monto de los descuentos por AFP, por SNP, por salud, monto
total de descuentos, sueldo total, sueldo neto.
 **************************************************************/
class Empleado {
	//Atributos
	int codigo;
	double sueldo,horasExtra;
	String nombre,areaLaboral;
	
	
	//M�todos
	void Datos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("C�digo: "+codigo);
		System.out.println("�rea Laboral: "+areaLaboral);
		System.out.println("Horas extra: "+horasExtra);
	}
	
	void CalculoDescuentos() {
		System.out.println("Sueldo: "+sueldo);
		double desAFP=(sueldo*11)/100;
		double desSNP=(sueldo*13)/100;
		double salud=(sueldo*3)/100;
		System.out.println("Sus descuentos son:\nAFP-> "+desAFP+
				"\nSNP-> "+desSNP+"\nSalud-> "+salud);
	}
	
	void PagoHorasExtra() {
		double res=sueldo/30;
		double res2=res/8;
		if(horasExtra>0&&horasExtra<3) {
			double res3=(res2*25/100)+res2;
			
		}
		else if(horasExtra>=3) {
			double res3=(res2*35/100)+res2;
			System.out.println("Su pago adicional por horas extra es: "+res3);
		}
		
	}
}
