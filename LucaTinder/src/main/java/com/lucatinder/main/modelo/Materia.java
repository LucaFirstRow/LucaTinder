// Generated with g9.

package com.lucatinder.main.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name="materia")
public class Materia implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_materia", unique=true, nullable=false, length=10)
	
    private int idMateria;
	
    @Column(name="descripcion_materia", length=45)
    private String descripcionMateria;
    
    @JsonIgnore
    @OneToMany(mappedBy="materia")
    private Set<Intereses> intereses;

    /** Default constructor. */
    public Materia() {
        super();
    }

    /**
     * Access method for idMateria.
     *
     * @return the current value of idMateria
     */
    public int getIdMateria() {
        return idMateria;
    }

    /**
     * Setter method for idMateria.
     *
     * @param aIdMateria the new value for idMateria
     */
    public void setIdMateria(int aIdMateria) {
        idMateria = aIdMateria;
    }

    /**
     * Access method for descripcionMateria.
     *
     * @return the current value of descripcionMateria
     */
    public String getDescripcionMateria() {
        return descripcionMateria;
    }

    /**
     * Setter method for descripcionMateria.
     *
     * @param aDescripcionMateria the new value for descripcionMateria
     */
    public void setDescripcionMateria(String aDescripcionMateria) {
        descripcionMateria = aDescripcionMateria;
    }

    /**
     * Access method for intereses.
     *
     * @return the current value of intereses
     */
    public Set<Intereses> getIntereses() {
        return intereses;
    }

    /**
     * Setter method for intereses.
     *
     * @param aIntereses the new value for intereses
     */
    public void setIntereses(Set<Intereses> aIntereses) {
        intereses = aIntereses;
    }

    /**
     * Compares the key for this instance with another Materia.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Materia and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Materia)) {
            return false;
        }
        Materia that = (Materia) other;
        if (this.getIdMateria() != that.getIdMateria()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Materia.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Materia)) return false;
        return this.equalKeys(other) && ((Materia)other).equalKeys(this);
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
        i = getIdMateria();
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
		return "Materia [idMateria=" + idMateria + "]";
	}

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idMateria", Integer.valueOf(getIdMateria()));
        return ret;
    }



}
