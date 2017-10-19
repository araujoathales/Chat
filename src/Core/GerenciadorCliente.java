package Core;

import java.util.Map;

public class GerenciadorCliente extends Thread{
    private Map<String, GerenciadorCliente> clientes;
    
    
    
    
    
    
    public GerenciadorCliente(){
        
    }

    public GerenciadorCliente(Map<String, GerenciadorCliente> clientes) {
        this.clientes = clientes;
    }
    
    @Override
    public void run(){
        
    }
}
