package 汽车管理系统;

class Bus extends Vehicle{
private int numOfSeat; //用于存放车座位数的变量
public Bus(String type, String brand, double price, int numOfSeat) {
super(type, brand, price) ;
this. numOfSeat=numOfSeat;
}
}
