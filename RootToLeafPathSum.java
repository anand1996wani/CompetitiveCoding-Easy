/*

Given n number each representing value of a node, construct a tree in the following manner:

    Let's say node to be inserted has value x
    If x is less than or equal to value of the current root node then  insert to the left of the current root
    If x is greater than the value of the current root then insert node in the right of this node

The above insertion will make a special tree known as Binary Search Tree.

Now given q queries, each query containing a sum find whether there exist a path from root to leaf with sum equal to the given sum.

Input Format:

First line of input contains an integer n i.e. number of nodes. Second line contains n space separate integers. 
Third line contains an integer q. Followed by q integers.

Output Format:

Print "Yes" if there exist a path equal to sum else print no.

Constraints:

All the numbers are well with in the integer range.

*/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class bTree{
    public int data;
    public bTree left;
    public bTree right;
    public bTree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class TestClass {
    
public static void main(String args[] ) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        bTree root = new bTree(0);
        root.data = scanner.nextInt();
        int k = 1;
        while(k < n){
            bTree node = new bTree(0);
            node.data = scanner.nextInt();
            bTree temp = root;
            //System.out.println(temp.data);
            while(true){
                if(node.data <= temp.data){
                    if(temp.left==null){
                        temp.left = node;
                        break;
                    }else{
                        temp = temp.left;
                    }
                }else{
                    if(temp.right==null){
                        temp.right = node;
                        break;
                    }else{
                        temp = temp.right;
                    }
                }
            }
            k++;
        }
        int q = scanner.nextInt();
        TestClass te = new TestClass();
        for(int i = 0;i < q;i++){
            int temp = scanner.nextInt();
            if(te.rootToLeafSum(root,temp)==true){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    public boolean rootToLeafSum(bTree root,int sum){
        if(root!=null){
            sum = sum - root.data;
            if(sum > 0){
                boolean left = false,right = false;
                if(root.left!=null){
                    left = this.rootToLeafSum(root.left,sum);
                }
                if(root.right!=null){
                    right = this.rootToLeafSum(root.right,sum);
                }
                return left || right;
            }else if(sum==0){ 
                if(root.left==null && root.right==null){
                    return true;
                }else{
                    boolean left = false,right = false;
                    if(root.left!=null){
                        left = this.rootToLeafSum(root.left,sum);
                    }
                    if(root.right!=null){
                        right = this.rootToLeafSum(root.right,sum);
                    }
                    return left || right;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}

