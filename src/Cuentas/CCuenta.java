package Cuentas;
/**
 * Realiza operacione del tipo cuentas bancarias
 * @author MiguelRC
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 * Constructor vacío
 */
    public CCuenta()
    {
    }
/**
 * Constructor que inicia la clase con un nombre,ceunta,saldo y tipo
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
       setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**
 * Obtiene el saldo de la cuenta en este momento
 * @return el saldo actual de la cuenta
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Nos permite ingresar una cantidad en nuestra cuenta ,sumando esa cantidad al saldo
 * @param cantidad - saldo a ingresar
 * @throws Exception
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Nos permite retirar una cantidad de nuestra cuenta,restando esa cantidad a nuestro saldo
 * @param cantidad - saldo a retirar
 * @throws Exception
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * Obtiene el nombre de la cuenta 
 * @return el nombre establecido en la cuenta
 */
	private String getNombre() {
		return nombre;
	}
	/**
	 * Establece un nombre para la cuenta
	 * @param nombre - el nombre de la cuenta a establecer
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Obtiene el numero de la cuenta
 * @return el numero y letras  que identifica nuestra cuenta
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * Establece el numero de cuenta
 * @param cuenta - valor a establecer como numero de cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * Obtiene el saldo
 * @return el saldo actual
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * Establece el saldo
 * @param saldo - valor a establecer como saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Obtiene el tipo de interés de nuestra cuenta
 * @return el tipo de interes de la cuenta
 */
	private double getTipoInterés() {
		return tipoInterés;
	}
/**
 * Establece el tipo de interes de la cuenta
 * @param tipoInterés - el valor del interés a establecer
 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
