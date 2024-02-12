package in.mkpits.tree;

public class CallingTree {

	public static void main(String[] args) 
	{
		TreeNode restaurant = new TreeNode("**Restaurant**");
		TreeNode starter = new TreeNode("A) Starter");
		TreeNode maincourse = new TreeNode("B) Main Course");
		TreeNode drinks = new TreeNode("C) Drinks");
		
		TreeNode a = new TreeNode("1.Masala Papad");
	    TreeNode b = new TreeNode("2.Roasted Papad");
	    TreeNode c = new TreeNode("3.Paneer Tikka");
	    TreeNode d = new TreeNode("4.Chilly Paneer");
	    
	    TreeNode e = new TreeNode("1.Paneer Tikka Masala");
	    TreeNode f = new TreeNode("2.Dal Taadka");
	    TreeNode g = new TreeNode("3.Palak Paneer");
	    TreeNode h = new TreeNode("4.Veg Kolhapuri");
	    
	    TreeNode i = new TreeNode("1.Red Bull");
	    TreeNode j = new TreeNode("2.Jira Soda");
	    TreeNode k = new TreeNode("3.Soup");
	    TreeNode l = new TreeNode("4.Pepsi");
	    

		starter.addchild(a);
		starter.addchild(b);
		starter.addchild(c);
		starter.addchild(d);

		maincourse.addchild(e);
		maincourse.addchild(f);
		maincourse.addchild(g);
		maincourse.addchild(h);

		drinks.addchild(i);
		drinks.addchild(j);
		drinks.addchild(k);
		drinks.addchild(l);
		
		restaurant.addchild(starter);
		restaurant.addchild(maincourse);
		restaurant.addchild(drinks);
		
		
		System.out.println(restaurant.print(0));


	}

}
