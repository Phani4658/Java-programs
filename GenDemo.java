class MyClass<T extends Comparable<T>>
{
T[] vals;
MyClass(T[] o)
{
vals = o;
}
public T min()
{
T v = vals[0];
for(int i=1; i < vals.length; i++)
if(vals[i].compareTo(v) < 0)
v = vals[i];
return v;
}
public T max()
{
T v = vals[0];
for(int i=1; i < vals.length;i++)
if(vals[i].compareTo(v) > 0)
v = vals[i];
return v;
}
}
class Gendemo
{
public static void main(String args[])throws Exception
{
int i;
Integer a[]={10,2,5,4,6,1};
Character b[]={'v','p','s','a','n','h'};
Double c[]={20.2,45.4,71.6,88.3,54.6,10.4};
MyClass<Integer> iob = new MyClass<Integer>(a);
MyClass<Character> cob = new MyClass<Character>(b);
MyClass<Double>dob = new MyClass<Double>(c);
System.out.print("\n\n\t THE VALUES IN THE INTEGER ARRAY ARE....");
for(i=0;i<a.length;i++)
{
System.out.print(" "+a[i]);
}
System.out.print("\n\n\t THE VALUES IN THE CHARACTER ARRAY ARE....");
for(i=0;i<a.length;i++)
{
System.out.print(" "+b[i]);
}
System.out.print("\n\n\t THE VALUES IN THE DOUBLE ARRAY ARE....");
for(i=0;i<a.length;i++)
{
System.out.print(" "+b[i]);}
System.out.println("\n\n\t MAXIMUM VALUE IN INTEGER ARRAY IS... " + iob.max());
System.out.println("\n\n\t MINIMUM VALUE IN INTEGER ARRAY IS..." + iob.min());
System.out.println("\n\n\t MAXIMUM VALUE IN CHARACTER ARRAY IS..." +
cob.max());
System.out.println("\n\n\t MINIMUM VALUE IN CHARACTER ARRAY IS...." +
cob.min());
System.out.println("\n\n\t MAXIMUM VALUE IN DOUBLE ARRAY IS....." + dob.max());
System.out.println("\n\n\t MINIMUM VALUE IN DOUBLE ARRAY IS...... " + dob.min());
}
}
