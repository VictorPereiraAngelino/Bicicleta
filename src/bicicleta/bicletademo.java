package bicicleta;

class bicletademo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
    	bicleta bike1 = new bicleta();
    	bicleta bike2 = new bicleta();

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
        
        System.out.println(bike1);
        System.out.println(bike2);
    }
}
