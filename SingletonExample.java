public class SingletonExample {
    String name;
   private volatile static SingletonExample obj;

   private SingletonExample(){
        this.name = "xyz";
   }

   public static SingletonExample getInstance(){
       if(obj==null) {
           synchronized (SingletonExample.class) {
               if (obj == null) {
                   obj = new SingletonExample();
               }
           }
       }
       return obj;
   }
    public void print(){
       System.out.println(obj.name);
    }

}
