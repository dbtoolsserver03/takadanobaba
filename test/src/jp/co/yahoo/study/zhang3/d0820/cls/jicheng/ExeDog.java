package jp.co.yahoo.study.zhang3.d0820.cls.jicheng;

public class ExeDog {

	public static void main(String[] args) {
		
		//funJiCheng();
		
		funDuoTai();
	
		
		
	}

	private static void funDuoTai() {

		// 用父类声明变量，用子类实例化
		Dog dog = new DogMan();
		// 变量调用方法时，实例化时，用的哪个类进行的实例化，就用哪个类的方法
		
		dog.call();
		
		
		
		
	}

	private static void funJiCheng() {
		DogMan dogMan = new DogMan();
		// 因为子类实现了父类方法
		dogMan.call();
		
		System.out.println("----------");
		
		DogWoman dogWoman = new DogWoman();
		// 因为子类实现了父类方法
		dogWoman.call();
		
		System.out.println("----------");
		Dog dog = new Dog();
		dog.call();
		
	}
}
