package Day3Project;

//Single Inhertitence  [1 parent 1 child]
/*class Animal{                 //class1
	void sound() {
		System.out.println("Animals makes sound");
	}
}
class Cat extends Animal{     //class2
	void meow() {
		System.out.println("Cats do meow");
	}
}

//Multi-level inheritence [1 parent 1 child 1 grandchild]

/*class Kitten extends Cat{   //class3
	void weep() {
		System.out.println("Kitten cries");
	}
}

//Hierarchical Inheritence [1 parent 2 child]
class Puppy extends Animal{   //class4
	void sleep() {
		System.out.println("Puppy Sleeps");
	}
}*/





//Multiple inheritence achieved by interface

/*interface Cam1{
	void capture(); 
		
}
interface Music{
	void playMusic();
}

class Smartphone implements Cam1, Music {
	public void capturePhoto() {
		System.out.println("Photo capturednuaing cam");
	}
	public void playMusic() {
		System.out.println("Playing music");
	}
	
}*/


public class Inhertience {
	public static void main(String[] args) {
		
		//for single inheritence
		
		/*Cat c1 = new Cat();
		c1.sound();
		c1.meow();*/      
		
		
		//for multiple inheritence
		
		/*Kitten k1 = new Kitten();
		k1.sound();
		k1.meow();
		k1.weep();*/  
		
		
		//for hierarchical inheritence
		
		/*Cat c2 = new Cat();
		Puppy p1 = new Puppy();
		c2.sound();
		c2.meow();*/
		
		
		//For multiple inheritence
		
		/*Smartphone s1 = new Smartphone();
		s1.capturePhoto();
		s1.playMusic();*/
		
		
		
		
		
		
	}
}
