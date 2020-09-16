public class Hallow
{
        public static void main(String[] argv)
        {
                while(true)
                {
                        System.out.println("Hello world");
                        try
                        {
                                Thread.sleep(6000);
                        }
                        catch(Exception ex){}
                }

        }
}
