class AAA{
	protected String name;
	protected int money;
	public AAA(String name, int money){
		this.name=name;
		this.money=money;
	}
	public void show(){
		System.out.println(name+"\t"+money);
	}
}
class BBB extends AAA{
	protected int a,c;
	
	public BBB(String name,int money,int _a){
		super(name,money);
		a=_a;
	}
	public void income(int _c){
		c=_c;
		System.out.println(name+"‚Í"+(money+c)+"‰~‚ÌŠ‹à‚ÆA");
	}
	public void showIncome(){
		System.out.println(a-c+"‚Ì‘Ì—Í‚É‚È‚è‚Ü‚µ‚½");
	}
}
class Test{
	public static void main(String args[]){
		BBB b=new BBB("suzuki",5000,8000);
		b.show();
		b.income(800);
		b.showIncome();
	}
}