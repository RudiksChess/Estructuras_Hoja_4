
public class Calculadora implements Icalculadora{
	/**
	* Este es un método que realiza la operacion de postfix, ingresa un string y retorna un double como resultado de la operacion
	*
	* @param  input  es una cadena que ingresa con la operación respectiva
	* @return      pila.index(0), que es el resultado de la operación respectiva.
	*/

	@Override
public double resolver(String input, int opcion) {
		
		if (opcion == 1) {
			ARRAYLIST<Integer> pila = new ARRAYLIST<Integer>();
			
			String[] partido =input.split(" ",0);
			
			for(int i=0; i<partido.length;i++) {
				String c=partido[i];
				boolean isNumeric = c.chars().allMatch( Character::isDigit );
				
				if (isNumeric== true) {
					pila.push(Integer.parseInt(c));
				}
				
				else{
					
					int primero= pila.index(pila.size()-1);		
					int segundo= pila.index(pila.size()-2);		
						
				switch (c) {
				case "+":
					pila.pop();
					pila.pop();
					pila.push(segundo+primero);
					break;
				case "-":
					pila.pop();
					pila.pop();
					pila.push(segundo-primero);
					break;
				case "/":
					pila.pop();
					pila.pop();
					pila.push(segundo/primero);
					break;
				case "*":
					pila.pop();
					pila.pop();
					pila.push(segundo*primero);
					break;
				}
				
				
				}
				
				
			}
			return (double) pila.index(0);
	    }
		
		else if(opcion == 2){
			
			VECTOR<Integer> pila = new VECTOR<Integer>();
			
			String[] partido =input.split(" ",0);
			
			for(int i=0; i<partido.length;i++) {
				String c=partido[i];
				boolean isNumeric = c.chars().allMatch( Character::isDigit );
				
				if (isNumeric== true) {
					pila.push(Integer.parseInt(c));
				}
				
				else{
					
					int primero= pila.index(pila.size()-1);		
					int segundo= pila.index(pila.size()-2);		
						
				switch (c) {
				case "+":
					pila.pop();
					pila.pop();
					pila.push(segundo+primero);
					break;
				case "-":
					pila.pop();
					pila.pop();
					pila.push(segundo-primero);
					break;
				case "/":
					pila.pop();
					pila.pop();
					pila.push(segundo/primero);
					break;
				case "*":
					pila.pop();
					pila.pop();
					pila.push(segundo*primero);
					break;
				}
				
				
				}
				
				
			}
			return (double) pila.index(0);
			
			
			}
		
		else if(opcion==3) {
			LISTA<Integer> pila = new LISTA<Integer>("3");
			
			 for(int i=0;i<input.length();i++) 
		        { 
		            char c=input.charAt(i); 
		              
		        
		            if(Character.isDigit(c)) 
		            pila.push(c - '0'); 
		              
		           
		            else
		            { 
		                int val1 = pila.pop(); 
		                int val2 = pila.pop(); 
		                  
		                switch(c) 
		                { 
		                    case '+': 
		                    pila.push(val2+val1); 
		                    break; 
		                      
		                    case '-': 
		                    pila.push(val2- val1); 
		                    break; 
		                      
		                    case '/': 
		                    pila.push(val2/val1); 
		                    break; 
		                      
		                    case '*': 
		                    pila.push(val2*val1); 
		                    break; 
		              } 
		            } 
		        } 
		        return pila.pop();
		        
			
		}
		else if(opcion==4) {
			LISTA<Integer> pila = new LISTA<Integer>("4");
			
			 for(int i=0;i<input.length();i++) 
		        { 
		            char c=input.charAt(i); 
		              
		        
		            if(Character.isDigit(c)) 
		            pila.push(c - '0'); 
		              
		           
		            else
		            { 
		                int val1 = pila.pop(); 
		                int val2 = pila.pop(); 
		                  
		                switch(c) 
		                { 
		                    case '+': 
		                    pila.push(val2+val1); 
		                    break; 
		                      
		                    case '-': 
		                    pila.push(val2- val1); 
		                    break; 
		                      
		                    case '/': 
		                    pila.push(val2/val1); 
		                    break; 
		                      
		                    case '*': 
		                    pila.push(val2*val1); 
		                    break; 
		              } 
		            } 
		        } 
		        return pila.pop();
		}
		
		
		
		
		else {
			return 7;
		}
			
	}
	

}
