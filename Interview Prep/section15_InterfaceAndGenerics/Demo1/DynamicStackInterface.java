package section15_InterfaceAndGenerics;

// multiple inheritance using interface is possible in Java
public interface DynamicStackInterface extends Stack_Interface, DSAInterface {

	public void display();
}
