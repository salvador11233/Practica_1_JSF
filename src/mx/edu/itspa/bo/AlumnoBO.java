package mx.edu.itspa.bo;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.edu.itspa.dao.AlumnoDAO;
import mx.edu.itspa.dao.PersonaDAO;
import mx.edu.itspa.dto.Alumno;
import mx.edu.itspa.general.DAOException;

@ManagedBean(name="alumnoBO")
@SessionScoped
public class AlumnoBO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Alumno alumno;
	private AlumnoDAO alumnoDAO;
	private PersonaDAO personaDAO;
	
	public AlumnoBO() {
		alumnoDAO = new AlumnoDAO();
		alumno = new Alumno();
	}
	
	public List<Alumno> getAlumnos(){
		try {
			return alumnoDAO.obtenerTodos();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public String edit(String matricula) {
		try {
			alumno = alumnoDAO.obtener(matricula);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "add";
	}
	
	public String save() {
		try {
			if(alumno.getPersona_id()==0 || alumno.getPersona_id()==null) {
				alumnoDAO.insertar(alumno);
			}else {
				alumnoDAO.modificar(alumno);
			}
			alumno = new Alumno();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "save";
	}
	
	public String eliminar(String matricula) {
		try {
			alumno = alumnoDAO.obtener(matricula);
			alumnoDAO.eliminar(alumno);
			alumno = new Alumno();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		return "delete";
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}	
}