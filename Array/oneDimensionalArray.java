package Array;
// import java.io.*;


public class oneDimensionalArray{
public static void main(String args[]){
// One Dimentional Array
//  Initialize Array   
int a[]=new int[5];
// Make a array with values
String b[]={"sahil","sejal","tranzu"};
//Traversing an array asc 
for(int i=0;i<b.length;i++){
    System.out.println(b[i]);
}
//Traversing an array desc 
for(int j=b.length-1;j>=0;j--){
    System.out.println(b[j]);
}
//For Each loop
for( String x: b){
    System.out.println(x);
}
//Questions
int myArr[]={10,11,9,2,99,100,121,87};
int max=0,min=myArr[0],sum=0,key=9;
//Find Maximum
//method 1
for(int x:myArr){
    if(x>max)
    {
        max=x;
    }
    
}
System.out.println("The max value is "+max);
//method 2
for(int i=0;i<myArr.length;i++){
    if(myArr[i]>max){
        max=myArr[i];
    }
}
System.out.println("The max value is "+max);

//Find Minimum
//method 1
for(int x:myArr){
    if(x<min)
    {
        min=x;
    }
    
}
System.out.println("The min value is "+min);

//method 2
for(int i=0;i<myArr.length;i++){
    if(myArr[i]<min){
        min=myArr[i];
    }
}
System.out.println("The min value is "+min);
//Finding the sum

for(int i=0;i<myArr.length;i++){
    sum+=myArr[i];
}
System.out.println("The sum is "+sum);

//Finding a value 

for(int x: myArr){
    if(x==key)
    {
        System.out.println("Found Key");
    }
}
}
}