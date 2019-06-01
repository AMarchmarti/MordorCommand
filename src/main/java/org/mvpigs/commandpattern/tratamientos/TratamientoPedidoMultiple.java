package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.Pedido;

import java.util.ArrayList;
import java.util.List;

public class TratamientoPedidoMultiple {

    private List<Pedido> listaPedidos = new ArrayList<>();

    public TratamientoPedidoMultiple(List<Pedido> pedidos){
        this.listaPedidos = pedidos;
    }
}
