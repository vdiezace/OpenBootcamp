public class Main {
    public static void main(String[] args) {
        sum(2,3,10);

        Car myCar = new Car();
        myCar.addDoor();
        myCar.addDoor();
        myCar.addDoor();
        System.out.println(myCar.numDoor);
    }

    public static int sum(int A, int B, int C){
        int result = A+B+C;
        System.out.println(result);
    return result;
    }
}

class Car {
    public int numDoor = 0;

    public void addDoor(){
        this.numDoor++;
    }
}