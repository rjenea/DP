package dzone;

public class Client {

	public static void main(String[] args) {
      CompressionContext ctx = new CompressionContext(); 
      //we could assume context is already set by preferences 
      ctx.setCompressionStrategy(new ZipCompressionStrategy());     
      ctx.createArchive(null);    
      ctx.setCompressionStrategy(new RarCompressionStrategy());     
      ctx.createArchive(null);    
   }
}
