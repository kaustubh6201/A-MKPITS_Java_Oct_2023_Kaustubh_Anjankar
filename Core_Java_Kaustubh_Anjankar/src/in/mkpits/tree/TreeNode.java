package in.mkpits.tree;

import java.util.ArrayList;


public class TreeNode 
{
	String data;
	ArrayList<TreeNode> child ;
	
	public TreeNode(String data)
	{
		this.data = data;
		this.child =new ArrayList<TreeNode>();
		
	}
	
	public void addchild(TreeNode node)
	{
		this.child.add(node);
		
	}

	public String print(int level) {
	String retrn;
	retrn = "  ".repeat(level) + data + "\n";
	for (TreeNode node : this.child) {
		retrn += node.print(level + 1);
	}return retrn;
	
	
   }
}