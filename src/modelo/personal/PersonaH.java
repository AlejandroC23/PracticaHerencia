/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.personal;

/**
 *
 * @author Alejandro
 */
public class PersonaH {
    private int idPersona;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String usuario;
    private String clave;
    private int telefono;
    private String direccion;
    private String correoElectronico;
    private String sexo;
    private String fechaNacimiento;

    public PersonaH() {
    }

    public PersonaH(int idPersona, String nombres, String apellidos, String cedula, String usuario, String clave, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.usuario = usuario;
        this.clave = clave;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void imprimir(){
        System.out.println("------ DATOS PERSONALES ------\n"+
                "Id: " + getIdPersona()+ "\n" +
                "Usuario: " + getUsuario() + "\n" +
                "Clave: ***************** \n" +
                "Cedula: " + getCedula() + "\n" +
                "Nombres: " + getNombres() + "\n" +
                "Apellidos: " + getApellidos() + "\n" +
                "Teléfono: " + getTelefono() + "\n" +
                "Dirección: " + getDireccion() + "\n" +
                "Sexo: " + getSexo() + "\n" +
                "Fecha de nacimiento: " + getFechaNacimiento() + "\n");
    }
}
