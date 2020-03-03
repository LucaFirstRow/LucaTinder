// Generated with g9.

package com.lucatinder.main.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name="intereses")
public class Intereses implements Serializable {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_intereses", unique=true, nullable=false, length=10)
    private int idIntereses;
	
    @ManyToOne
    @JoinColumn(name="id_materia")
    private Materia materia;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_perfil")
    private Perfil perfil;

    /** Default constructor. */
    public Intereses() {
        super();
    }

    /**
     * Access method for idIntereses.
     *
     * @return the current value of idIntereses
     */
    public int getIdIntereses() {
        return idIntereses;
    }

    /**
     * Setter method for idIntereses.
     *
     * @param aIdIntereses the new value for idIntereses
     */
    public void setIdIntereses(int aIdIntereses) {
        idIntereses = aIdIntereses;
    }

    /**
     * Access method for materia.
     *
     * @return the current value of materia
     */
    public Materia getMateria() {
        return materia;
    }

    /**
     * Setter method for materia.
     *
     * @param aMateria the new value for materia
     */
    public void setMateria(Materia aMateria) {
        materia = aMateria;
    }

    /**
     * Access method for perfil.
     *
     * @return the current value of perfil
     */
    public Perfil getPerfil() {
        return perfil;
    }

    /**
     * Setter method for perfil.
     *
     * @param aPerfil the new value for perfil
     */
    public void setPerfil(Perfil aPerfil) {
        perfil = aPerfil;
    }

    /**
     * Compares the key for this instance with another Intereses.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Intereses and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Intereses)) {
            return false;
        }
        Intereses that = (Intereses) other;
        if (this.getIdIntereses() != that.getIdIntereses()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Intereses.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Intereses)) return false;
        return this.equalKeys(other) && ((Intereses)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdIntereses();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Intereses |");
        sb.append(" idIntereses=").append(getIdIntereses());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idIntereses", Integer.valueOf(getIdIntereses()));
        return ret;
    }

}
