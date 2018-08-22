import java.util.Scanner;

public class TreeFreq {
	
	static class Tree {
		int data;
		int freq;
		Tree left;
		Tree right;
		
		Tree(int data) {
			this.data = data;
			left = null;
			right = null;
			freq = 1;
		}
	}
	
	static Tree root = null;
	
	static Tree insert(Tree root, int data) {
		
		if(root == null)
			return new Tree(data);
		
		if(data < root.data)
			root.left = insert(root.left, data);
		else if(data > root.data)
			root.right = insert(root.right, data);
		else
			root.freq = root.freq + 1;
		
		return root;
	}
	
	static void inorder(Tree root) {
		
		if(root != null) {
			inorder(root.left);
			int i = 0;
			while(i < root.freq) {
				System.out.println(root.data);
				i++;
			}
			inorder(root.right);
		}
	}

	static Tree search(Tree root, int x) {
		
		if(root == null || root.data == x)
			return root;
		else if(root.data < x)
			return search(root.right, x);
		else
			return search(root.left, x);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		
		int s = sc.nextInt();
		
		Tree node = search(root,s);
		System.out.println(node.freq);
		
		//inorder(root);
	}

}
