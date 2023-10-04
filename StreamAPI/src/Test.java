
//FunctionalInterface :interface having exactly one abstract method: Runnable,Comparable,Callable
//Predicate, Supplier , Consumer, Function



@FunctionalInterface
interface Account{
	void m1();
}

class AccountImpl implements Account{

	@Override
	public void m1() {
		System.out.println("m1() is called");
	}
	
}
public class Test {

	public static void main(String[] args) {
		Account account = new AccountImpl();
		account.m1();

	}

}
