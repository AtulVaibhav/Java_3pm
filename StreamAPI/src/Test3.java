//Method Reference

//Non-static fn =>  classObj::fnName
//Static fn => ClassName::fnName
//Contructor => ClassName ::new



@FunctionalInterface
interface Employee{
	//void salaryCalculation();
	//void salary();
	//void greet(String str);
	
	int lenth(String[] str);
}


class EmployeeDetails{
	public void FTESalary(){
		System.out.println(30*1000);
	}
}


class EmployeeData{
	public static void PTESalary(){
		System.out.println(30*500);
	}
}

class Message{
	Message(String msg){
		System.out.println(msg);
	}
}

class StringUtils{
	public static int getLength(String[] str){
		int maxLength = 0;
		for(String obj:str){
			int len = obj.length();
			if(len>maxLength){
				maxLength = len;
			}
		}
		return maxLength;
	}
	
}
public class Test3 {

	public static void main(String[] args) {
	//	EmployeeDetails empDetails = new EmployeeDetails();
		//Employee emp = ()->{}
//		Employee emp =empDetails::FTESalary;
//		emp.salaryCalculation();
		
//		Employee emp = EmployeeData::PTESalary;
//		emp.salary();
		
//		String str = "Good Evening";
//		Employee emp = Message::new;
//		emp.greet(str);
		
		
		String[] str = {"Hello","Encyclopedia","Wikipedia","Internet"};
		Employee emp = StringUtils::getLength;
		System.out.println(emp.lenth(str));

	}

}
