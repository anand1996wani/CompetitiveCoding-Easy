/*
Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.



Input (To be used only for expected output):
The first line contains T denoting no of test cases . 
Then T test cases follow . Each test case contains a string str which is to be encoded .

Output:
For each test case output in a single line the so encoded string .

Constraints:
1<=T<=100
1<=length of str<=100

Example:
Input
2
aaaabbbccc
abbbcdddd

Output
a4b3c3
a1b3c1d4



*/

class GfG
 {
	String encode(String str)
	{
          //Your code here
          char array[] = new char[str.length()];
          array = str.toCharArray();
          int count = 1;
          char prev = array[0];
          String s = "";
          for(int i = 1;i < array.length;i++){
              if(prev!=array[i]){
                  //System.out.print(prev);
                  //System.out.print(count);
                  s = s + prev + count;
                  count = 1;
                  prev = array[i];
              }
              else{
                  count++;
              }
          }
          s = s + prev + count;
          return s;
	}
	
 }
