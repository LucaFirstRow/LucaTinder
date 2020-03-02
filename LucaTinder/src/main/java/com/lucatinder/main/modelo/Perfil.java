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


@Entity(name="perfil")
public class Perfil implements Serializable {

  

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_perfil", unique=true, nullable=false, length=10)
    private int idPerfil;
    @Column(length=45)
    private String nombre;
    @Column(length=10)
    private int genero;
    @Column(length=10)
    private int edad;
    @Column(length=400)
    private String descripcion;
    @Column(name="descripcion_corta", length=150)
    private String descripcionCorta;
    @Column(length=80)
    private String poblacion;
    @Column(length=45)
    private String foto;
    @OneToMany(mappedBy="perfil")
    private Set<Intereses> intereses;
    @OneToMany(mappedBy="perfil")
    private Set<Descartes> descartes;
    @OneToMany(mappedBy="perfil")
    private Set<Contactos> contactos;
    @OneToMany(mappedBy="perfil2")
    private Set<Descartes> descartes2;
    @OneToMany(mappedBy="perfil2")
    private Set<Contactos> contactos2;
    @OneToMany(mappedBy="perfil")
    private Set<Match> match;
    @OneToMany(mappedBy="perfil2")
    private Set<Match> match2;

    /** Default constructor. */
    public Perfil() {
        super();
    }

    /**
     * Access method for idPerfil.
     *
     * @return the current value of idPerfil
     */
    public int getIdPerfil() {
        return idPerfil;
    }

    /**
     * Setter method for idPerfil.
     *
     * @param aIdPerfil the new value for idPerfil
     */
    public void setIdPerfil(int aIdPerfil) {
        idPerfil = aIdPerfil;
    }

    /**
     * Access method for nombre.
     *
     * @return the current value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter method for nombre.
     *
     * @param aNombre the new value for nombre
     */
    public void setNombre(String aNombre) {
        nombre = aNombre;
    }

    /**
     * Access method for genero.
     *
     * @return the current value of genero
     */
    public int getGenero() {
        return genero;
    }

    /**
     * Setter method for genero.
     *
     * @param aGenero the new value for genero
     */
    public void setGenero(int aGenero) {
        genero = aGenero;
    }

    /**
     * Access method for edad.
     *
     * @return the current value of edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter method for edad.
     *
     * @param aEdad the new value for edad
     */
    public void setEdad(int aEdad) {
        edad = aEdad;
    }

    /**
     * Access method for descripcion.
     *
     * @return the current value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter method for descripcion.
     *
     * @param aDescripcion the new value for descripcion
     */
    public void setDescripcion(String aDescripcion) {
        descripcion = aDescripcion;
    }

    /**
     * Access method for descripcionCorta.
     *
     * @return the current value of descripcionCorta
     */
    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    /**
     * Setter method for descripcionCorta.
     *
     * @param aDescripcionCorta the new value for descripcionCorta
     */
    public void setDescripcionCorta(String aDescripcionCorta) {
        descripcionCorta = aDescripcionCorta;
    }

    /**
     * Access method for poblacion.
     *
     * @return the current value of poblacion
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * Setter method for poblacion.
     *
     * @param aPoblacion the new value for poblacion
     */
    public void setPoblacion(String aPoblacion) {
        poblacion = aPoblacion;
    }

    /**
     * Access method for foto.
     *
     * @return the current value of foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Setter method for foto.
     *
     * @param aFoto the new value for foto
     */
    public void setFoto(String aFoto) {
        foto = aFoto;
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
     * Access method for descartes.
     *
     * @return the current value of descartes
     */
    public Set<Descartes> getDescartes() {
        return descartes;
    }

    /**
     * Setter method for descartes.
     *
     * @param aDescartes the new value for descartes
     */
    public void setDescartes(Set<Descartes> aDescartes) {
        descartes = aDescartes;
    }

    /**
     * Access method for contactos.
     *
     * @return the current value of contactos
     */
    public Set<Contactos> getContactos() {
        return contactos;
    }

    /**
     * Setter method for contactos.
     *
     * @param aContactos the new value for contactos
     */
    public void setContactos(Set<Contactos> aContactos) {
        contactos = aContactos;
    }

    /**
     * Access method for descartes2.
     *
     * @return the current value of descartes2
     */
    public Set<Descartes> getDescartes2() {
        return descartes2;
    }

    /**
     * Setter method for descartes2.
     *
     * @param aDescartes2 the new value for descartes2
     */
    public void setDescartes2(Set<Descartes> aDescartes2) {
        descartes2 = aDescartes2;
    }

    /**
     * Access method for contactos2.
     *
     * @return the current value of contactos2
     */
    public Set<Contactos> getContactos2() {
        return contactos2;
    }

    /**
     * Setter method for contactos2.
     *
     * @param aContactos2 the new value for contactos2
     */
    public void setContactos2(Set<Contactos> aContactos2) {
        contactos2 = aContactos2;
    }

    /**
     * Access method for match.
     *
     * @return the current value of match
     */
    public Set<Match> getMatch() {
        return match;
    }

    /**
     * Setter method for match.
     *
     * @param aMatch the new value for match
     */
    public void setMatch(Set<Match> aMatch) {
        match = aMatch;
    }

    /**
     * Access method for match2.
     *
     * @return the current value of match2
     */
    public Set<Match> getMatch2() {
        return match2;
    }

    /**
     * Setter method for match2.
     *
     * @param aMatch2 the new value for match2
     */
    public void setMatch2(Set<Match> aMatch2) {
        match2 = aMatch2;
    }

    /**
     * Compares the key for this instance with another Perfil.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Perfil and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Perfil)) {
            return false;
        }
        Perfil that = (Perfil) other;
        if (this.getIdPerfil() != that.getIdPerfil()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Perfil.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Perfil)) return false;
        return this.equalKeys(other) && ((Perfil)other).equalKeys(this);
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
        i = getIdPerfil();
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
        StringBuffer sb = new StringBuffer("[Perfil |");
        sb.append(" idPerfil=").append(getIdPerfil());
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
        ret.put("idPerfil", Integer.valueOf(getIdPerfil()));
        return ret;
    }

}
