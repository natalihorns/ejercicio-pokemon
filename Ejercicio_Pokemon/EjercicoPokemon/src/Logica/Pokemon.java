
package Logica;

public abstract class Pokemon {//creo la clase abstracta
    protected int numPokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexoPokemon;
    protected int temporadaQueAparece;
    protected String tipo;
    
//creo los metodos abstractos
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
    
    
    
}
