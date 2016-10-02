class TesterForMyString
{
    public static void main(String[] args)
    {
//        MyString ms1=new MyString();
//        System.out.println("empty constructor: "+ms1);
//        char[] u={'H','e','l','l'};
//        MyString ms2=new MyString(u);
//        System.out.println("\nchar array cons: "+ms2);
        MyString ms3=new MyString("HelloBrother");
//        System.out.println("Length: "+ms2.length());
//        System.out.println("Char At: "+ ms3.charAt(5));
//        System.out.println("startsWith String: "+ms3.startsWith(new String("Hell")));
//        
        System.out.println("startsWith MyString: "+ms3.startsWith("H"));
        // System.out.println("endsWith MyString: "+ms3.startsWith(ms2));
//        System.out.println("endsWith String: "+ms3.endsWith("oBrother")); //problem
//        System.out.println("endsWith MyString: "+ms2.endsWith(new MyString("ell["))); //chesk preconditions
       // MyString frr=new MyString("Agtfrr^5&");
//        //  System.out.println(frr.replaceFirst('e','E'));
//        // System.out.println(frr.replaceAll('a','|'));
//        // System.out.println(frr.replaceLast('H','Z'));
        //System.out.println(frr.toLowerCase());
//        System.out.println(frr.toUpperCase());
//        System.out.println(frr.equals(new MyString("HELLOTH!@#$SAFAT")));
//        System.out.println((new MyString("Inspiron")).equalsIgnoreCase(new MyString("InSP!rON")));
//        System.out.println((new MyString("Inspirons")).compareTo(new MyString("Inspiron")));
        //System.out.println("(new MyString(apple)).compareTo(apples));");
        
        System.out.println((new MyString("azz")).compareTo("azza"));
//        System.out.println((new MyString("InSpIRonS")).compareTo("Inspiron"));
        //System.out.println((new MyString("WhoLetTheDogsOut")).substring(5));
//        System.out.println((new MyString("WhoLetTheDogsOut Ho hoho ho ho")).substring(0,4));
//        frr=new MyString("tweeheeheethhhkk");
//        System.out.println(frr.indexOf('h'));
//        System.out.println(frr.lastIndexOf('e'));
////        System.out.println(frr.indexOf('e',3));
//        System.out.println(frr.lastIndexOf('e',0));
//        System.out.println(frr.indexOf(new MyString("th")));
//        //System.out.println(frr.lastIndexOf("ee"));
//        System.out.println(new MyString("Atlanta is ").concat(new MyString("in Georgia, America")));
//        char[] x={'B','a','n','g','l','a','d','e','s','h'};
//        System.out.println(new MyString("Dhaka is in ").concat(x));
//        System.out.println(new MyString("Dell Insipiron ").concat("N5110 Gt525"));
//        
    }
}
class MyString
{
    char[] ca;
    MyString()
    {
        ca=new char[0];    
    }
    MyString (char[] charSeq)
    {
        ca=new char[charSeq.length];
        int c=0;
        while(c<charSeq.length)
        {
            ca[c]=charSeq[c]; c++;
        }
    }
    MyString (String str)
    {
        ca=new char[str.length()];
        int c=0;
        while(c<str.length())
        {
            ca[c]=str.charAt(c); c++;
        }
    }
    int length()
    {
        int c=0; while(true)
        {
            Character ct;+
            try{ct=new Character(ca[c]);}
            catch(Exception e){return c;}
            if(ct instanceof Character)
            {c++;}
        }
    }
    char charAt ( int n )
    {
        
        Integer in =new Integer(n);
        //if(n<0 || n>this.length() || !(in instanceof Integer) 
        if(n<0 || n>ca.length || !(in instanceof Integer) )
        {
            throw new StringIndexOutOfBoundsException("===>MyString index out of range:" +n+ "\n Pls enter valid Integer");
        }
        
        return ca[n]; 
    }
    boolean startsWith (String prefix)
    {
        boolean willReturn=true;
        if(prefix==null) {throw new MyStringException("Error: prefix given is null");}
        int c=0;
        while(c<prefix.length())
        {
            if(ca[c]==prefix.charAt(c))
            {
                willReturn=true;
            }
            else{willReturn=false;break;}
            c++;
        }
        return willReturn;
    }
    
    boolean startsWith (MyString prefix)
    {
        boolean willReturn=true;
        if(prefix==null) {throw new MyStringException("Error: prefix given is null");}
        int c=0;
        while(c<prefix.length())
        {
            if(ca[c]==prefix.charAt(c))
            {
                willReturn=true;
            }
            else{willReturn=false;break;}
            c++;
        }
        return willReturn;
    }
    boolean endsWith (String prefix)
    {
        boolean willReturn=true;
        if(prefix==null) {throw new MyStringException("Error: prefix given is null");}
        int c=0, t=prefix.length()-1,r=this.length()-1;
        while(c<prefix.length())
        {
            if(ca[r]==prefix.charAt(t))
            {
                willReturn=true;
            }
            else{willReturn=false;break;}
            c++;t--;r--;
        }
        return willReturn;
    }
    
    boolean endsWith (MyString prefix)
    {
        boolean willReturn=true;
        if(prefix==null) {throw new MyStringException("Error: prefix given is null");}
        int c=0, t=prefix.length()-1,r=this.length()-1;
        while(c<prefix.length())
        {
            if(ca[r]==prefix.charAt(t))
            {
                willReturn=true;
            }
            else{willReturn=false;break;}
            c++;t--;r--;
        }
        return willReturn;
    }
    MyString replaceFirst(char oldChar, char newChar)
    {
        Character o=new Character(oldChar);
        Character n=new Character(newChar);
        
        if(!(o instanceof Character) && !(n instanceof Character))
        {
            throw new MyStringException("Error: Arguments given are not instances of Characters");
        }
        else{
            int c=0; 
            
            while(c<this.length())
            {
                if(oldChar==charAt(c))
                {
                    ca[c]=newChar;break;
                }
                c++;
            }
        }
        return this;
    }
    MyString replaceAll(char oldChar, char newChar)
    {
        Character o=new Character(oldChar);
        Character n=new Character(newChar);
        
        if(!(o instanceof Character) && !(n instanceof Character))
        {
            throw new MyStringException("Error: Arguments given are not instances of Characters");
        }
        else{
            int c=0; 
            
            while(c<this.length())
            {
                if(oldChar==charAt(c))
                {
                    ca[c]=newChar;
                }
                c++;
            }
        }
        return this;
    }
    MyString replaceLast(char oldChar, char newChar)
    {
        Character o=new Character(oldChar);
        Character n=new Character(newChar);
        
        if(!(o instanceof Character) && !(n instanceof Character))
        {
            throw new MyStringException("Error: Arguments given are not instances of Characters");
        }
        else{
            int c=this.length()-1; 
            
            while(c>=0)
            {
                if(oldChar==charAt(c))
                {
                    ca[c]=newChar;break;
                }
                c--;
            }
        }
        return this;
    }
    MyString toLowerCase ( )
    {
        int c=0;
        while(c<this.length())
        {
            if((int)(charAt(c))>=65 && (int)(charAt(c))<=90)
            {
                ca[c]=(char)((int)charAt(c)+32);
            }
            c++;
        }return this;
    }
    MyString toUpperCase ( )
    {
        int c=0;
        while(c<this.length())
        {
            if((int)(charAt(c))>=90 && (int)(charAt(c))<=122)
            {
                ca[c]=(char)((int)charAt(c)-32);
            }
            c++;
        }return this;
    }
    
    
    boolean equals ( MyString rightStr )
    {
        if(rightStr.length()!=this.length() || rightStr==null || !(rightStr instanceof MyString))
            return false;
        else
        {int c=0;
            while(c<rightStr.length())
            {
                if(this.charAt(c)!=rightStr.charAt(c))
                {
                    return false;
                }
                c++;
            }
        }return true;
    }
    
    boolean equalsIgnoreCase ( MyString rightString )
    {
        MyString a=rightString.toUpperCase(),b=this.toUpperCase();
        if(rightString.length()!=this.length() || rightString==null || !(rightString instanceof MyString))
            return false;
        else
        {int c=0;
            while(c<a.length())
            {
                if(b.charAt(c)!=a.charAt(c))
                {
                    return false;
                }
                c++;
            }
        }return true;
    }
    int compareTo ( MyString str )
    {
        if(str==null)
        {
            throw new MyStringException("String   --> str is 'NULL'");
        }
        int a=str.length();//smallest length
        if(this.length()<str.length())  a=this.length();
        int c=0;
        while(c<a)
        {
            if(this.charAt(c)!=str.charAt(c)) 
            {
                if((int)this.charAt(c)>(int)str.charAt(c))
                {return +1;}
                else
                {return -1;}
            }
            c++;
        }
        if(str.length()==this.length()) return 0;
        else if(str.length()>this.length())return -1;else return +1;
        
    }
    int compareTo ( String str )
    {
        String str2=str.toLowerCase();
        MyString this2=this.toLowerCase();
        if(str2==null)
        {
            throw new MyStringException("String   --> str is 'NULL'");
        }
        int a=str.length();//smallest length
        if(this.length()<str.length())  a=this.length();
        int c=0;
        while(c<a)
        {
            if(this2.charAt(c)!=str2.charAt(c)) 
            {
                if((int)this2.charAt(c)>(int)str2.charAt(c))
                {return +1;}
                else
                {return -1;}
            }
            c++;
        }
        if(str.length()==this.length()) return 0;
        else if(str.length()>this.length())return -1;else return +1;
        
    }
    MyString substring (int start) // precondition left
    {
        int oldStart=start; int c=0;
        char[] x=new char[length()-oldStart];
        while(start<this.length())
        {
            x[c]=this.charAt(start);
            c++; start++;
        }
        
        return new MyString(x);
    }
    MyString substring (int start,int end) // precondition left
    {
        int oldStart=start; int c=0;
        char[] x=new char[length()-oldStart];
        while(start<end+1)
        {
            x[c]=this.charAt(start);
            c++; start++;
        }
        
        return new MyString(x);
    }
    int indexOf (char ch)
    {
        Character myCh=new Character(ch);
        if(myCh==null)
        {
            throw new MyStringException("The character sent is null");
        }
        else
        {int c=0;
            while(c<this.length())
            {
                if(ch==this.charAt(c))
                {
                    return c;
                }c++;
            }
            return -1;
        }
    }
    int lastIndexOf (char ch)
    {
        Character myCh=new Character(ch);int goBack=0;
        if(myCh==null)
        {
            throw new MyStringException("The character sent is null");
        }
        else
        { int c=0;
            while(c<this.length())
            {
                if(ch==this.charAt(c))
                {
                    goBack=c;
                }c++;
            }
            if(goBack==0)
                return -1;
            
            else 
                return goBack;
        }
        
    }
    int indexOf ( char ch, int start )
    {
        Character myCh=new Character(ch);
        if(myCh==null || start>=this.length() || start<0)
        {
            throw new MyStringException("The character sent is null or the integer received"+start+"is invalid for the invoking MyString");////
        }
        else
        {int c=start;
            while(c<this.length())
            {
                if(ch==this.charAt(c))
                {
                    return c;
                }c++;
            }
            return -1;
        }
    }
    
    int lastIndexOf (char ch, int start)
    {
        Character myCh=new Character(ch);
        int goBack=-5;
        if(myCh==null)
        {
            throw new MyStringException("The character sent is null");
        }
        else
        { int c=start;
            while(c<this.length())
            {
                if(ch==this.charAt(c))
                {
                    goBack=c;
                }c++;
            }
            if(goBack==-5)
                return -1;
            
            else 
                return goBack;
        }
    }
    
    int indexOf ( MyString str)
    {
        boolean boo=true;
        //Character myCh=new Character(ch);
        if(str==null)
        {
            throw new MyStringException("The MyString sent is null");
        }
        else
        {int c=0;
            while(c<this.length())
            {
                if(str.charAt(0)==this.charAt(c))
                {
                    int c1=1;
                    while(c1<str.length())
                    {
                        int b=c+1;
                        if(this.charAt(b)==str.charAt(c1++))boo=true;
                        else{boo=false;}
                    }
                    if(boo)
                        return c;
                    else{c++; continue;}
                    
                }
                c++;
            }
            return -1;
        }
    }
    /* int lastIndexOf (String str)
     {
     int goBack=-1;
     //Character myCh=new Character(ch);
     if(str==null)
     {
     throw new MyStringException("The String sent is null");
     }
     //else if{length==1}
     else
     {int c=0;
     while(c<(this.length()-(str.length()+1)))
     {
     
     if(str.charAt(0)==this.charAt(c))
     {
     int c1=0;
     // int c1=0;
     int b=c+1;
     while(c1<str.length())
     {
     //c1++;
     // b=c+1;
     if(this.charAt(b++)==str.charAt(c1+1))//boo=true;
     //else{boo=false;}
     goBack=c;
     else{goBack=-1;}
     c1++;
     }
     }
     c++; 
     }
     return goBack;
     }
     }*/
    MyString concat(MyString str)
    {
        if(str==null){throw new MyStringException("the MyString sent is null");}
        else{
            int c=0;int b=0;
            char[] temp=new char[this.length()+str.length()];
            while(c<this.length()+str.length())
            {
                if(c<this.length())
                    temp[c]=ca[c];
                else
                { temp[c]=str.charAt(b);b++; }
                
                c++;
            }
            
            
            return new MyString(temp);
        }
    }
    MyString concat (char[] charSeq)
    {
        int c=0;int b=0;
            char[] temp=new char[this.length()+charSeq.length];
            System.out.println(temp.length);
            while(c<this.length()+charSeq.length)
            {
                if(c<this.length())
                    temp[c]=ca[c];
                else
                { temp[c]=charSeq[b];b++; }
                
                c++;
            }
            
            
            return new MyString(temp);
        //}
        
    }
    MyString concat (String str)
    {
        if(str==null) throw new MyStringException("The String received is null");
        else
        {
            int c=0;int b=0;
            char[] temp=new char[this.length()+str.length()];
            System.out.println(temp.length);
            while(c<this.length()+str.length())
            {
                if(c<this.length())
                    temp[c]=ca[c];
                else
                { temp[c]=str.charAt(b);b++; }
                
                c++;
            }
            
            
            return new MyString(temp);
            
        }
    }
    public String toString()
    {
        int c=0;
        while(c<ca.length)
        {
            System.out.print(ca[c]);c++;
        }
        return "";
    }
}

class MyStringException extends java.lang.StringIndexOutOfBoundsException
{
    String s;
    MyStringException(String newS)
    {
        s=newS;
    }
    public String toString()
    {
        return "MyStringException: "+s;
    }
}