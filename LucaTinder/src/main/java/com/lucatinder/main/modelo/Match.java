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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name="match")
@Table(name="maches")
public class Match implements Serializable {

   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name="id_match", unique=true, nullable=false, length=10)
    private int idMatch;
	@JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_perfil_match_1")
    private Perfil perfil;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="id_perfil_match_2")
    private Perfil perfil2;

    /** Default constructor. */
    public Match() {
        super();
    }

    /**
     * Access method for idMatch.
     *
     * @return the current value of idMatch
     */
    public int getIdMatch() {
        return idMatch;
    }

    /**
     * Setter method for idMatch.
     *
     * @param aIdMatch the new value for idMatch
     */
    public void setIdMatch(int aIdMatch) {
        idMatch = aIdMatch;
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
     * Compares the key for this instance with another Match.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Match and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Match)) {
            return false;
        }
        Match that = (Match) other;
        if (this.getIdMatch() != that.getIdMatch()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Match.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Match)) return false;
        return this.equalKeys(other) && ((Match)other).equalKeys(this);
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
        i = getIdMatch();
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
        StringBuffer sb = new StringBuffer("[Match |");
        sb.append(" idMatch=").append(getIdMatch());
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
        ret.put("idMatch", Integer.valueOf(getIdMatch()));
        return ret;
    }

}
