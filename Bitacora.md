# proyecto DUCK Diplomado
La primera Implementacion desdemi punto de vista lo implementaba solo con Herencia apliacada a la super clase Duck
esto lo vuelve rigido, ya que todos pueden optar a todos los comportamientos.

mi diseño hubiese sido el siguiente: 
clase Duck {
   public void display();
   public void swing();
}
clas FlyDuck extends Duck{
   @Overwrite
   public void display(){
      systems.out.println("I´m flyDuck");
     };
   @Overwrite
   public void swing();
}
clas BehaviorDuck extends Duck{
   @Overwrite
   public void display(){
      systems.out.println("I´m flyDuck");
     };
   @Overwrite
   public void swing(){
      systems.out.println("I´m BehaviorDuck swinging");
    }
   public void quack(){

     }
}
todo esto me paso en algun proyecto como en la primera lectura de la tarea.

Para implementar correctamente y dar la flexibilidad necesaria vi que es necesario la aplicacion del patron de diseño estrategy
que bueno posteriormente ire perfeccionando ese patron para mis futuros proyectos ya que con este ejemplo pude ver que tan flexible se vuelve 
impresindible practicar y aplicar, como siempre digo la practica hace al maestro.

