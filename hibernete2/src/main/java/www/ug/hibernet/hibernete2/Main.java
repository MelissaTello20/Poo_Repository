package www.ug.hibernet.hibernete2;

import java.util.Date;

public class Main 


{
	
	
	public static void imprimir(String message) {
		
		System.out.println(message);
	}
    public static void main( String[] args ) {
    	
    crear();
	read();
	//update();
	//read();
	//delete();
	
    }
   
    	public static void crear() {
    	MusicoDao daoMusico = new MusicoDao();
    	Musico musico = new Musico(1,"Beethoven","0954","Bonn",new Date(),new Date());
		daoMusico.setup();
		daoMusico.crear(musico);
		Musico musico2 = new Musico(2,"Mozart","0867","Austria",new Date(),new Date());
		daoMusico.crear(musico2);  
		Musico musico3 = new Musico(3,"Georg Friedrich","0789","Viena",new Date(),new Date());
		daoMusico.crear(musico3);   
	  
        
    }
    	
    	
    	public static void read() {
    		MusicoDao daoMusico = new MusicoDao();
    		daoMusico.setup();
    		Musico musico = daoMusico.read(1);
    		
    		imprimir(musico.toString());
  	}
        public static void update() {

    		MusicoDao daoMusico = new MusicoDao();
    		daoMusico.setup();
    		Musico musico = daoMusico.read(21);
    		musico.setNombres("Franz Peter");
    		
    		daoMusico.update(musico);
   	}
    		
    	public static void delete() {
    		MusicoDao daoMusico = new MusicoDao();
    		daoMusico.setup();
    		daoMusico.delete(28);
    	
    	}
    
}
