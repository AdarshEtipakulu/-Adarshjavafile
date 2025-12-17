class PatternStar
{
    public static void main(String[] args)
    {
        int width = 13;

        for (int i = 1; i <= 3; i++)
        {
            for (int s = 1; s <= width; s++)
            {
                if (s == (8 - i * 2) || s == (8 + i * 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 7; i++)
        {
            System.out.print("*  ");
        }
        System.out.println();

        for (int i = 1; i <= 3; i++)
        {
            for (int s = 1; s <= width; s++)
            {
                if (s == 4 || s == width)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.print("   ");
        for (int i = 1; i <= 5; i++)
        {
            System.out.print("*  ");
        }
    }
}
