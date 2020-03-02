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
import javax.persistence.Version;

@Entity(name="contactos")
public class Contactos implements Serializable {

 

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="id_contacto", unique=true, nullable=false, length=10)
    private int idContacto;
    @ManyToOne
    @JoinColumn(name="id_perfil")
    private Perfil perfil;
    @ManyToOne
    @JoinColumn(name="id_perfil_like")
    private Perfil perfil2;

    /** Default constructor. */
    public Contactos() {
        super();
    }

    /**
     * Access method for idContacto.
     *
     * @return the current value of idContacto
     */
    public int getIdContacto() {
        return idContacto;
    }

    /**
     * Setter method for idContacto.
     *
     * @param aIdContacto the new value for idContacto
     */
    public void setIdContacto(int aIdContacto) {
        idContacto = aIdContacto;
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
     * Compares the key for this instance with another Contactos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Contactos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Contactos)) {
            return false;
        }
        Contactos that = (Contactos) other;
        if (this.getIdContacto() != that.getIdContacto()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Contactos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Contactos)) return false;
        return this.equalKeys(other) && ((Contactos)other).equalKeys(this);
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
        i = getIdContacto();
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
        StringBuffer sb = new StringBuffer("[Contactos |");
        sb.append(" idContacto=").append(getIdContacto());
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
        ret.put("idContacto", Integer.valueOf(getIdContacto()));
        return ret;
    }

}
