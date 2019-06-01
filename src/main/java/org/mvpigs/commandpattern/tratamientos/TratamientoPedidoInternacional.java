package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.Pedido;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;


public class TratamientoPedidoInternacional implements TratamientoPedido {

    private Pedido pedidoInternacional;

    public TratamientoPedidoInternacional(Pedido pedido){
        this.pedidoInternacional = pedido;
    }




    @Override
    public boolean tratar() {
        return false;
    }
}
