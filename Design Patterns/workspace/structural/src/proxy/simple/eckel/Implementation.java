package proxy.simple.eckel;

public class Implementation implements ProxyBase {
  public void f() { 
    System.out.println("Implementation.f()"); 
  }
  public void g() { 
    System.out.println("Implementation.g()"); 
  }
  public void h() { 
    System.out.println("Implementation.h()"); 
  }
}