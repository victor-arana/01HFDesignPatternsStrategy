package com.victorarana.hfdesignpatterns;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuak(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All duck float, even decoys!");
	}
}
