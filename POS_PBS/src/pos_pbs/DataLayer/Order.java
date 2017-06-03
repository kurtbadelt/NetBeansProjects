/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_pbs.DataLayer;

/**
 *
 * @author kurtbadelt
 */
public class Order extends DataLayer {
    int orderID;
    int ticketID;
    Product [] products;
    Customer customer;
    String outBoundWaybill;
    String outBoundCarrier;
    PackingSlip packingSlip;
    Invoice invoice;
    int statusID;

    public Order(int orderID, int ticketID, Product[] products, Customer customer, String outBoundWaybill, String outBoundCarrier, PackingSlip packingSlip, Invoice invoice, int statusID) {
        this.orderID = orderID;
        this.ticketID = ticketID;
        this.products = products;
        this.customer = customer;
        this.outBoundWaybill = outBoundWaybill;
        this.outBoundCarrier = outBoundCarrier;
        this.packingSlip = packingSlip;
        this.invoice = invoice;
        this.statusID = statusID;
    }
    
    
    
    //voy a tratar de guardar los objetos en la base de datos, si no se puede voy a guardar los indices

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOutBoundCarrier() {
        return outBoundCarrier;
    }

    public void setOutBoundCarrier(String outBoundCarrier) {
        this.outBoundCarrier = outBoundCarrier;
    }

    public String getOutBoundWaybill() {
        return outBoundWaybill;
    }

    public void setOutBoundWaybill(String outBoundWaybill) {
        this.outBoundWaybill = outBoundWaybill;
    }

    public PackingSlip getPackingSlip() {
        return packingSlip;
    }

    public void setPackingSlip(PackingSlip packingSlip) {
        this.packingSlip = packingSlip;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }
    
}
