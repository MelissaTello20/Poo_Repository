package www.ug.hibernet.hibernete2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="musicos")
public class Musico {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name ="musico_id")
	private long id ;
	@Column(name = "Nombres")
	private String Nombres;
	private String Identificacion;
	private String LugarNacimiento;
	private Date FechaNacimiento; 
	private Date FechaMuerte;
	
	public Musico() {
	}
	
	public Musico(long id, String nombres, String identificacion, String lugarnacimiento,Date fechanacimiento, Date fechamuerte) {
		
		this.id = id;
		this.Nombres = nombres;
		this.Identificacion = identificacion;
		this.LugarNacimiento = lugarnacimiento;
		this.FechaNacimiento = fechanacimiento;
		this.FechaMuerte = fechamuerte;
		
	}  
	
	public void imprimir() {
		System.out.println(Nombres);
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getIdentificacion() {
		return Identificacion;
	}

	public void setIdentificacion(String identificacion) {
		Identificacion = identificacion;
	}

	public String getLugarNacimiento() {
		return LugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		LugarNacimiento = lugarNacimiento;
	}

	public Date getFechaMuerte() {
		return FechaMuerte;
	}

	public void setFechaMuerte(Date fechaMuerte) {
		FechaMuerte = fechaMuerte;
	}

	@Override
	public String toString() {
		return "Musico [id=" + id + ", Nombres=" + Nombres + ", Identificacion=" + Identificacion + ", LugarNacimiento="
				+ LugarNacimiento + ", FechaNacimiento=" + FechaNacimiento + ", FechaMuerte=" + FechaMuerte + "]";
	}

	

	
	
	
}
