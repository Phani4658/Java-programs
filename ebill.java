import java.util.*;
class electricityBill{
	int consumerNo,previousMonthReading,currentMonthReading,meterReading;
	String consumerName,connectionType;
	double amount;
	public void read(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Consumer Number....");
		consumerNo = sc.nextInt();
		System.out.print("Enter Consumer Name....");
		consumerName = sc.next();
		System.out.print("Enter previous month reading...");
		previousMonthReading = sc.nextInt();
		System.out.print("Enter current month reading....");
		currentMonthReading = sc.nextInt();
		System.out.print("Enter connection type(Domestic or Commercial)....");
		connectionType = sc.next();
	}
	public void display(){
		System.out.println("======================================");
		System.out.println("Consumer Number....." + consumerNo);
		System.out.println("Consumer Name....." + consumerName);
		System.out.println("Previous Month reading....." + previousMonthReading);
		System.out.println("Current Month reading....." + currentMonthReading);
		System.out.println("Connection Type....." + connectionType);
		System.out.println("No of units consumed...." + this.meterReading);
		System.out.println("Electricity Bill....." + this.amount);
		System.out.println("=======================================");
	}
	void calculateBill(){
		meterReading = currentMonthReading - previousMonthReading;
		if(connectionType.equals("Domestic")){
			if(meterReading <= 100){
				this.amount = meterReading;
			}
			else if(meterReading <= 200){
				this.amount = 100 + (meterReading -100)*2.50;
			}
			else if(meterReading <=500){
				this.amount = 100 + 100*2.50 + (meterReading-200)*4;
			}
			else if(meterReading > 500){
				this.amount = 100 + 100*2.50 + 300*4 + (meterReading-500)*6;
			}
		}
		else if(connectionType.equals("Commercial")){
			if(meterReading <= 100){
				this.amount = meterReading*2;
			}
			else if(meterReading <= 200){
				this.amount = 200 + (meterReading -100)*4.50;
			}
			else if(meterReading <=500){
				this.amount = 200 + 100*4.50 + (meterReading-200)*6;
			}
			else if(meterReading > 500){
				this.amount = 200 + 100*4.50 + 300*6 + (meterReading-500)*7;
			}
		}
		else{
			System.out.println("Enter valid Connection Type");
		}
	}
}

class ebill{
	public static void main(String args[]){
		electricityBill ebill = new electricityBill();
		ebill.read();
		ebill.calculateBill();
		ebill.display();
	}
}
