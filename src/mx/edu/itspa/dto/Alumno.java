package mx.edu.itspa.dto;

public class Alumno extends Persona{
	private String matricula;
    private Integer carrera;
    private Integer semestre;
	private Integer persona_id = 0;
	
    public Alumno(){}
    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the carrera
     */
    public Integer getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(Integer carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the semestre
     */
    public Integer getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
    
    /**
     * @return the id
     */
    public Integer getPersona_id() {
        return persona_id;
    }

    /**
     * @param id the id to set
     */
    public void setPersona_id(Integer persona_id) {
        this.persona_id = persona_id;
    }
}
