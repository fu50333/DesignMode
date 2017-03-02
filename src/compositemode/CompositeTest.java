package compositemode;

import org.junit.Test;
/**
 * 
 * @描述  组合模式
 * @使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 * @author 傅文城
 *
 */
public class CompositeTest {
	@Test
	public void test(){
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		
		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!");
	}
}
