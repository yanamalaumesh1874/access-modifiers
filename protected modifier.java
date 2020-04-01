 class person
{
	protected String name="umesh";
	protected char sec='m';
	protected int  batch=2018;
	protected int regno=3811000;
	protected String boardingpoint="hostel";
	
	public static void main(String args[]) 
	{
	  person p=new person();
	  System.out.println(p.name);
	  System.out.println(p.sec);
	  System.out.println(p.batch);
	  System.out.println(p.regno);
	  System.out.println(p.boardingpoint);
	}
}
