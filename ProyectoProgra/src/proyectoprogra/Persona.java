/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

/**
 *
 * @author frano
 */
public class Persona {
    
    private String marca, numvehiculo, placa, year, modelo, email, contrasena, nombre, apellido, sexo, nombretarjeta;
    private int edad, numerotarjeta, venctarjeta, codtarjeta, horacurso, dia, tiposuscrip, persuscrip;
    private boolean check1, check2, check3, check4, check5;
    
    
    public void Persona(){
        
    }

    public Persona(String marca, String numvehiculo, String placa, String year, String modelo) {
        this.marca = marca;
        this.numvehiculo = numvehiculo;
        this.placa = placa;
        this.year = year;
        this.modelo = modelo;
    }

    public Persona(String email, String contrasena, String nombre, String apellido, String sexo, int edad) {
        this.email = email;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }

    public Persona(String nombretarjeta, int numerotarjeta, int venctarjeta, int codtarjeta) {
        this.nombretarjeta = nombretarjeta;
        this.numerotarjeta = numerotarjeta;
        this.venctarjeta = venctarjeta;
        this.codtarjeta = codtarjeta;
    }

    public Persona(int dia, boolean check1, boolean check2, boolean check3, boolean check4, boolean check5) {
        this.dia = dia;
        this.check1 = check1;
        this.check2 = check2;
        this.check3 = check3;
        this.check4 = check4;
        this.check5 = check5;
    }

    public Persona(int horacurso, int dia, int tiposuscrip, int persuscrip) {
        this.horacurso = horacurso;
        this.dia = dia;
        this.tiposuscrip = tiposuscrip;
        this.persuscrip = persuscrip;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumvehiculo() {
        return numvehiculo;
    }

    public void setNumvehiculo(String numvehiculo) {
        this.numvehiculo = numvehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombretarjeta() {
        return nombretarjeta;
    }

    public void setNombretarjeta(String nombretarjeta) {
        this.nombretarjeta = nombretarjeta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(int numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public int getVenctarjeta() {
        return venctarjeta;
    }

    public void setVenctarjeta(int venctarjeta) {
        this.venctarjeta = venctarjeta;
    }

    public int getCodtarjeta() {
        return codtarjeta;
    }

    public void setCodtarjeta(int codtarjeta) {
        this.codtarjeta = codtarjeta;
    }

    public int getHoracurso() {
        return horacurso;
    }

    public void setHoracurso(int horacurso) {
        this.horacurso = horacurso;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getTiposuscrip() {
        return tiposuscrip;
    }

    public void setTiposuscrip(int tiposuscrip) {
        this.tiposuscrip = tiposuscrip;
    }

    public int getPersuscrip() {
        return persuscrip;
    }

    public void setPersuscrip(int persuscrip) {
        this.persuscrip = persuscrip;
    }

    public boolean isCheck1() {
        return check1;
    }

    public void setCheck1(boolean check1) {
        this.check1 = check1;
    }

    public boolean isCheck2() {
        return check2;
    }

    public void setCheck2(boolean check2) {
        this.check2 = check2;
    }

    public boolean isCheck3() {
        return check3;
    }

    public void setCheck3(boolean check3) {
        this.check3 = check3;
    }

    public boolean isCheck4() {
        return check4;
    }

    public void setCheck4(boolean check4) {
        this.check4 = check4;
    }

    public boolean isCheck5() {
        return check5;
    }

    public void setCheck5(boolean check5) {
        this.check5 = check5;
    }

 
    
    
    
    
}
