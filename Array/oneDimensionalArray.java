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
//Rotating an array(left/right)
//Left Rotation
int temp=myArr[0];
for( int i=1;i<myArr.length;i++){
    myArr[i-1]=myArr[i];
}
myArr[myArr.length-1]=temp;
for(int x: myArr){
    System.out.print(x+", ");
}
 System.out.println("");


 //Right Rotation
 int myArr2[]={1,2,3,4,5,6};
int newtemp=myArr2[myArr2.length-1];
System.out.println(newtemp);
for( int i=myArr2.length-1;i>0;i--){
    myArr2[i]=myArr2[i-1];
   
}
myArr2[0]=newtemp;
for(int x: myArr2){
    System.out.print(x+", ");
}
 System.out.println("");

}
}