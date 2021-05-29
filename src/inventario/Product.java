
package inventario;

public class Product {
    //Declaraciones de campo de instancia
	private int itemNumber;		//Declaraciones de campo de instancia
    private String name;		//nombre del producto
    private int qtyInStock;		//cantidad en existencias
    private double price;		//precio del producto
    private boolean active = true; //estado del producto 
    
   //constructor predeterminado que inicializa variables de instancia    
   //los valores numéricos son 0 (cero) y los valores de cadena son "" (null) 
    public Product()
    {
    }//Final del constructor
    
   //constructor que permite la configuración de los valores iniciales para productos
    public Product(int number, String name, int qty, double price)
    { 
      this.itemNumber = number;
      this.name = name;
      this.qtyInStock = qty;
      this.price = price;
    }//Final del constructor

    //devuelve el valor actual de itemNumber 
	public int getItemNumber() {
		return itemNumber;
	}//final del método getItemNumber

	//actualiza el valor de itemNumber 
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}//final del método setItemNumbe

	//devuelve el valor actual del nombre
	public String getName() {
		return name;
	}//final del método getNam

	//actualiza el valor del nombre
	public void setName(String name) {
		this.name = name;
	}//Final del metodo setName

	//devuelve el valor actual de qtyInStock 
	public int getQtyInStock() {
		return qtyInStock;
	}//Final del metodo getQtyInStock

	//actualiza el valor del qtyInStock
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}//Final del metodo setQtyInStock

	//devuelve el valor actual del precio
	public double getPrice() {
		return price;
	}//Final del metodo getPrice

	//Actualiza los valores del precio
	public void setPrice(double price) {
		this.price = price;
	}//Final del metodo setPrice

	//devuelve el valor actual de Activo
	public boolean getActive() {
		return active;
	}//Final del metod getActive

	//Actualiza el valor activo
	public void setActive(boolean active) {
		this.active = active;
	}//Final del metodo setActive
	
	//obtener valor total del inventario para este producto 
    public double getInventoryValue()
    {
      return price * qtyInStock;
    }//Final del metodo getInventoryValue
	
   //sustituir método toString() de la clase Object    
   //para permitir la visualización de cada objeto en la consola
	public String toString()
	{
	     return "\n\nNúmero de elemento                : " + this.itemNumber 
	   			+ "\nNombre                : " + this.name 
	   			+ "\nCantidad en existencia: " + this.qtyInStock 
	   			+ "\nPrecio                : " + this.price
	   			+ "\nValor de existencias  : " + getInventoryValue()
	   			+ "\ndel producto          : " + (this.active?"Activado":"Desactivado");
	}//final del método toString
}
