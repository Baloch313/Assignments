class first
{
    int a;
    first(int b) {a=b;}
    first(){a=0;}
}
class second
{
    public static void main(String[]args)
    {
        first f = new first(12);
        change(f);
        System.out.println(f.a);
    }
    public static void change(first f)
    {
        f.a = 7;
    }
}