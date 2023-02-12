package cuentas;

/**
 * 
 * @author Mario Martinez
 *
 */
public class CCuenta {

/**
 * A continuación se pueden ver los atributos de la clase CCuenta, que son: nombre, cuenta, saldo y tipoInteres
 * @since 12/02/2023
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor vacío
     */
    public CCuenta()
    {
    }

    /** Constructor con todos los parámetros
     * 
     * @param nom Nombre del propietario de la cuenta
     * @param cue Número de la cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interés a aplicar
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /** Método para obtener el saldo disponible
     * 
     * @return Devuelve el valor del saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar una cantidad en el saldo
     * @param cantidad Dinero a ingresar en la cuenta
     * @throws Exception Saltará la excepción si se introduce una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar una cantidad del saldo de la cuenta
     * @param cantidad Cantidad a retirar del saldo
     * @throws Exception Saltará una excepción si se retira una cantidad negativa o si la cantidad es superior al saldo
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
     * Obtener el nombre del propietario de la cuenta
     * @return Devuelve el nombre del propietario de la cuenta
     */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Método para asignar un nombre como propieario de la cuent
	 * @param nombre Nombre del propietario
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener el número identificar de la cuenta
	 * @return Devuelve el número de la cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Método para asignar un valor al número de la cuenta
	 * @param cuenta Número de la cuenta del cliente, su valor es String
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método para obtener el saldo de la cuenta
	 * @return Devuelve el saldo de la cuenta
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Método para asignar un valor al saldo
	 * @param saldo Introduce el saldo actual
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método para obtener el tipo de interes aplicado
	 * @return Devuelve el tipo de interes que se aplica
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Método para asignar un valor al tipo de interes
	 * @param tipoInteres Porcentaje a aplicar
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}

