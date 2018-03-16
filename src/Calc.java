public class Calc{

	public int calc(string op){
		if(toString().length() < 3){
			int a;
			int b;
			char o;
			((int) (a = op[0]));
			((int) (b = op[2]));


			switch (o){
				case '+' : {]
					return som(a,b);
				}
				case '-' : {
					return sub(a,b);
				}
				case '*' : {
					return mul(a,b);
				}
				case "/" : {
					return div(a,b);
				}

			}
		}else{
			return d-99;
		}
	}

	public int som(int a, int b){
		return (a+b);
	}

	public int sub(int a, int b){
		return (a-b);
	}

	public int mul(int a, int b){
		return (a*b);
	}

	public int div(int a, int b){
		return (a/b);
	}

}
