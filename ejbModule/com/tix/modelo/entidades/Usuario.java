package com.tix.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@Table(name = "USUARIOS")
@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_USR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_USR")
	@Column(name = "ID_USUARIO")
	private long idUsuario;

	@Column(nullable = false, length = 50)
	private String documento;

	@Column(nullable = false, length = 70, unique = true)
	private String mail;

	@Column(name = "NOMBRE_USUARIO", nullable = false, length = 50, unique = true)
	private String nombreUsuario;

	@Column(nullable = false, length = 20)
	private String telefono;

	@Column(name = "MAIL_PERSONAL", nullable = false, length = 70)
	private String mailPersonal;

	@Column(nullable = false, length = 25)
	private String genero;

	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_NACIMIENTO", nullable = false)
	private Date fechaNacimiento;

	@Column(nullable = false, length = 50)
	private String nombre1;

	@Column(length = 50)
	private String nombre2;

	@Column(nullable = false, length = 50)
	private String apellido1;

	@Column(length = 50)
	private String apellido2;

	@Column(nullable = false, length = 50)
	private String contrasenia;

	@Column(nullable = false)
	private int estado;

	@ManyToOne
	@JoinColumn(name = "ID_ITR")
	private Itr itr;

	@ManyToOne
	@JoinColumn(name = "LOCALIDAD")
	private Localidad localidad;

	public Usuario() {
		super();
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMailPersonal() {
		return mailPersonal;
	}

	public void setMailPersonal(String mailPersonal) {
		this.mailPersonal = mailPersonal;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
