
package Logica;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");    
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordizco");
    }

    @Override
    public void atacatImpacTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque impactar trueno");
    }

    @Override
    public void atacatPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque punio trueno");
    }

    @Override
    public void atacatRayo() {
        System.out.println("Hola soy Pikachu y este es mi ataque atacar con rayo");
    }

    @Override
    public void atacatRayoCarga() {
        System.out.println("Hola soy Pikachu y este es mi ataque rayo carga");
    }
    
}
