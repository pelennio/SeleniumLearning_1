package w3resource;

import java.util.ArrayList;

public class MethodOverridingChildClass extends MethodOverridingParentClass{

 public void myMethod(){
  System.out.println("I am a method from Child Class");
  ArrayList  arrayList=new ArrayList(4);
  arrayList.add(4);
  arrayList.add(55);
  arrayList.add("Olena");
  arrayList.add(999);

  System.out.println(arrayList);

  int listSize = arrayList.size();

  for(int i=0; i<listSize; i++){
   System.out.println("Value of Array List at the index "+i+" is "+arrayList.get(i));
  }
  System.out.println("**************************************************");
  for(Object arrListItem : arrayList){
   System.out.println("Value of Array List at the index "+arrayList.indexOf(arrListItem)+" is "+arrListItem);
  }


 }

 public static void main(String [] args){

 /* When parent class reference refers to the child class object
 * then the method of the child class (overriding method) is called.
 * This we call as runtime polymorphism
 */
  MethodOverridingParentClass obj = new MethodOverridingChildClass();
  // It calls the child class method myMethod()
  obj.myMethod();


 /* When Parent class reference refers to the parent class object
 * then the method of parent class (overriden method) is called.
 */
  MethodOverridingParentClass obj1 = new MethodOverridingParentClass();
  obj1.myMethod();

 }
}