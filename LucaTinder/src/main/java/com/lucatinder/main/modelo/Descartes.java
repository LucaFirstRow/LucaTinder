// Generated with g9.

package com.lucatinder.main.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name="descartes")
public class Descartes implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
   

    @Id
    @Column(name="id_descartes", unique=true, nullable=false, length=10)
    private int idDescartes;
    @ManyToOne
    @JoinColumn(name="id_perfil")
    private Perfil perfil;
    @ManyToOne
    @JoinColumn(name="id_perfil_dislike")
    private Perfil perfil2;

    /** Default constructor. */
    public Descartes() {
        super();
    }

    /**
     * Access method for idDescartes.
     *
     * @return the current value of idDescartes
     */
    public int getIdDescartes() {
        return idDescartes;
    }

    /**
     * Setter method for idDescartes.
     *
     * @param aIdDescartes the new value for idDescartes
     */
    public void setIdDescartes(int aIdDescartes) {
        idDescartes = aIdDescartes;
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
     * Access method for perfil2.
     *
     * @return the current value of perfil2
     */
    public Perfil getPerfil2() {
        return perfil2;
    }

    /**
     * Setter method for perfil2.
     *
     * @param aPerfil2 the new value for perfil2
     */
    public void setPerfil2(Perfil aPerfil2) {
        perfil2 = aPerfil2;
    }

    /**
     * Compares the key for this instance with another Descartes.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Descartes and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Descartes)) {
            return false;
        }
        Descartes that = (Descartes) other;
        if (this.getIdDescartes() != that.getIdDescartes()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Descartes.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Descartes)) return false;
        return this.equalKeys(other) && ((Descartes)other).equalKeys(this);
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
        i = getIdDescartes();
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
        StringBuffer sb = new StringBuffer("[Descartes |");
        sb.append(" idDescartes=").append(getIdDescartes());
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
        ret.put("idDescartes", Integer.valueOf(getIdDescartes()));
        return ret;
    }

}
