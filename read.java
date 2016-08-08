public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="book, Me.";
		String[] s=str.split(" ");
		String[]c=new String[s.length];
		
		for(int i=0;i<s.length;i++)
		{
			int key=0;
			char keychar=' ';
			int n=0;
			{
			char ch[]=s[i].toCharArray();
			int last=ch.length-1;
			while(n==0)
			{
				if(((ch[last]>=65) && (ch[last]<=90)) || ((ch[last]>=97) && (ch[last]<=122)))
				{
					keychar=ch[last];
					n=1;
				}
				else 
				{
					last=last-1;
					
				}
			}	
				     
				if((keychar>=65) && (keychar<=90))
				{
					key=(int)(keychar-64);
				
			}else if((keychar>=97) && (keychar<=122))
			{
				key=(int)(keychar-96);
			}
				for(int j=0;j<last;j++)
				{
					if((ch[j]>=65) && (ch[j]<=90))
					{
						ch[j]=(char) ((int)ch[j]-key);
						if(ch[j]<=64)
						{
							ch[j]=(char)((int)ch[j]+26);
						}	
					}
					if((ch[j]>=97) && (ch[j]<=122))
					{
						ch[j]=(char) ((int)ch[j]-key);
						if(ch[j]<=96)
						{
							ch[j]=(char)((int)ch[j]+26);
						}	
					}
				}
				c[i]=new String(ch);
		}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		

	}

}
