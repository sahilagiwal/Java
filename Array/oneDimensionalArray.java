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
 // inserting in array at a given index
int iA[]=new int[10];
iA[0]=1;
iA[1]=9;
iA[2]=2;
iA[3]=54;
iA[4]=11;
iA[5]=89;
iA[6]=76;
iA[7]=716;
iA[8]=176;
iA[9]=33333;
int index=6;
int n=6,insertval=69;
for(int x: iA){
    System.out.print(x+", ");
}
System.out.println("");
for(int i=n;i>=index;i--){
 iA[i+1]=iA[i];
    if(i==index){
        iA[i]=insertval;
    }
 

}
for(int x: iA){
    System.out.print(x+", ");
}
System.out.println("");
//insertion takes right shift and deletion takes left shift .

//copying array
int copyingarr[]=new int[iA.length];
for(int i=0;i<iA.length;i++){
    copyingarr[i]=iA[i];
}
System.out.print("Copying Array \n");
for(int x: copyingarr){

    System.out.print(x+", ");
}
//Reverse copying array
int reversecopyarr[]=new int[iA.length];
int j=9;
for(int i=0;i<iA.length;i++){
    
    reversecopyarr[j]=iA[i];
    j--;
    }
    

System.out.print("\n Reverse Copying Array \n");
for(int x: reversecopyarr){

    System.out.print(x+", ");
}

//increasing the size of the array
// create a new array of bigger size can double the .lenght of the orginal array,
//  copy elements of orignal array to bigger array. at the end do bigger=orignal array, 
//  this will point the orignal array to beocme a bigger array and the old value will becomce 
//  garbage collection 

}




}