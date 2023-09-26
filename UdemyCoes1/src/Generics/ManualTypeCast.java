package Generics;

import Generics.ManualTypeCast;

public class ManualTypeCast {

		private Object obj;

		public ManualTypeCast(Object obj) {
			this.obj = obj;
		}

		public Object getObj() {
			return obj;
		}

		@Override
		public String toString() {
			return "ManualTypeCast [obj=" + obj + "]";
		}
	}
	class App{
		public static void main(String[] args) {
			ManualTypeCast T=new ManualTypeCast("Dibya");
		
			String variable=(String)T.getObj();
			System.out.println(variable
					);
			
		}
	}



