package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
		
		// task1.1
		Robot robot = new Robot();
		robot.work();
		
		CoffeeRobot coffeeRobot = new CoffeeRobot();
		coffeeRobot.work();
		
		RobotDancer robotDancer = new RobotDancer();
		robotDancer.work();
		
		RobotCooker robotCooker = new RobotCooker();
		robotCooker.work();
		
		System.out.println();
		
		//task1.2
		Robot robotArray[] = {robot, coffeeRobot, robotDancer, robotCooker};
		for(Robot x: robotArray) {
			x.work();
		}
		
		System.out.println();
		
		//task2
		Animal animal = new Animal("Elephant", 40, 5);
		System.out.println("Animal - " + animal.getName() + ", animal speed = " + animal.getSpeed() + ", animal age = " + animal.getAge());
		
		animal.setName("Turtle");
		animal.setSpeed(10);
		animal.setAge(70);
		
		System.out.println("Animal - " + animal.getName() + ", animal speed = " + animal.getSpeed() + ", animal age = " + animal.getAge());
		
		System.out.println();
	}
}
