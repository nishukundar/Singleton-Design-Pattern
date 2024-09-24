package singletonDesignPattern;

import java.io.Serializable;

final public class SingletonDesignPattern implements Serializable, Cloneable{

//    static SingletonDesignPattern s = new SingletonDesignPattern();//global access object//eager initialization
       static  SingletonDesignPattern s = null;


      private SingletonDesignPattern()throws Exception{//constructor

    }
    //create a Instance Initialize Block IIB to not let to create an object using Reflection
    {
      if(s!=null){
          throw new Exception(" Object is already created ");
      }
    }

  static SingletonDesignPattern getInstance() throws Exception {
          if(s == null){
              s = new SingletonDesignPattern(); //lazy initialization
          }
         return s;
    }

}
