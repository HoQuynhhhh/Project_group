package neww;
import java.util.*;
class vehicle{
	String numberSign;
	String color;
	String source;
	vehicle(){
		this.numberSign="";
		this.color="";
		this.source="";
	}
	void input() {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter numbersign: ");
		this.numberSign=obj.nextLine();
		System.out.print("Enter color: ");
		this.color=obj.nextLine();
		System.out.print("Enter source: ");
		this.source=obj.nextLine();
	}
	float cash() {
		return 0;
	}
	void output() {
		System.out.print("\nNumbersign: "+this.numberSign+"\nColor: "+this.color+"\nSource: "+this.source);
	}
}
class car extends vehicle{
	String manufacturer;
	float pricewithVat;
	float pricewithoutVat;
	car(){
		this.manufacturer="";
		this.pricewithVat=0;
		this.pricewithoutVat=0;
	}
	void input() {
		Scanner obj=new Scanner(System.in);
		super.input();
		System.out.print("Enter manufacturer: ");
		this.manufacturer=obj.nextLine();
		System.out.print("Enter pricewithoutVat: ");
		this.pricewithoutVat=obj.nextFloat();
	}
	float cash() {
		if(this.pricewithoutVat<=2000) {
			this.pricewithVat=(float)(this.pricewithoutVat+this.pricewithoutVat*0.1);
		}
		else { 
			this.pricewithVat=(float)(this.pricewithoutVat+this.pricewithoutVat*0.15);
		}
	return this.pricewithVat;
	}
	void output() {
		this.cash();
		super.output();
		System.out.print("Manufacturer: "+this.manufacturer+"\npricewithoutVat: "+this.pricewithoutVat+"\nPricewithVat: "+this.pricewithVat);
	}
}
class carList{
	void inputCar(car[] c) {
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<c.length;i++) {
			c[i]=new car();
			System.out.print("===Enter inforation "+(i+1)+"====\n");
			c[i].input();
		}			
	}
	void outputCar(car[] c) {
		for(int i=0;i<c.length;i++) {
			c[i]=new car();
			System.out.print("\n===>Inforation "+(i+1)+" :");
			c[i].output();
		}			
	}
}
public class Class_CarList {
	public static void main(String[] args) {
		car[] c=new car[10];
		carList list=new carList();
		list.inputCar(c);
		list.outputCar(c);

	}

}
