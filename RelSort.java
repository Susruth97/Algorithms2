import java.util.*;

public class RelSort {

	static class Tree {
		int data;
		int freq;
		boolean visited;
		Tree left;
		Tree right;
		
		Tree(int data) {
			this.data = data;
			left = null;
			right = null;
			freq = 1;
			visited = false;
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
			while(i < root.freq && root.visited == false) {
				System.out.print(root.data + " ");
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
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int k = 0;
		
		while(k < t) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] a = new int[n];
			int[] b = new int[m];
			
			for(int i = 0; i < n; i++) {
				int data = sc.nextInt();
				a[i] = data;
				root = insert(root, data);
			}
			
			for(int i = 0; i < m; i++)
				b[i] = sc.nextInt();
			
			for(int i = 0; i < m; i++) {
				int s = b[i];
				Tree node = search(root, s);
				//node.visited = true;
				
				for(int j = 0; j < node.freq; j++)
					System.out.print(b[i]+" ");
			}
			
			inorder(root);
			
			System.out.println();
			
			k++;
		}
		

	}

}
