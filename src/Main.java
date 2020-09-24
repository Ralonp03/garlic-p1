
	public class Main{



		public static void main(String[] args){
			book sc1 = new book("frido",455);
			sc1.descripcion("Es un libro de aventuras");
			sc1.libro();
			
			
			}

		}
	

	class book{
		
	String name;
	int pages;
	String info;
		
			book(String name, int pages){
			this.name = name;
			this.pages = pages;
				
			}
		
	void descripcion(String info){
		
		this.info = info;
		
	}
	void libro(){
	System.out.println("El libro "+name+" tiene "+pages+" paginas y trata de: \n "+info);	
	}
		
		
		
		
		
		
		
	}