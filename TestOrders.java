public class TestOrders {
    public static void main(String[] args){

        Item item1 = new Item("mocha",5.50);
        Item item2 = new Item("latte", 4.50);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("cappuccino",3.50);

        Order order1 = new Order();
        Order order2 = new Order();
        
        Order noahOrder = new Order("Noah");
        Order samOrder = new Order("Sam");
        Order jimmyOrder = new Order("Jimmy");


        order1.addItems(item1);
        order1.addItems(item1);
        order1.setReady(false);

        order2.addItems(item2);
        order2.addItems(item1);
        order2.setReady(false);

        noahOrder.addItems(item1);
        noahOrder.addItems(item2);
        noahOrder.addItems(item3);
        noahOrder.setReady(false);

        samOrder.addItems(item4);
        samOrder.addItems(item1);
        samOrder.addItems(item2);
        samOrder.setReady(false);

        jimmyOrder.addItems(item2);
        jimmyOrder.addItems(item4);
        jimmyOrder.setReady(false);

        System.out.println(order1.getStatusMessage());

        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());

        order1.display();
        order2.display();
        noahOrder.display();
        samOrder.display();
        jimmyOrder.display();
    }
}
