using System;


namespace A___Graph
{
  class Program
  {
    static void Main(string[] args)
    {
     
      int size = int.Parse(Console.ReadLine());
      int[,] ans = new int[size + 1, size + 1];
      for (int nth = 1; nth < size + 1; nth++)
      {
        String[] input = Console.ReadLine().Split(' ');
        for (int n = 0, index = 2; n < int.Parse(input[1]); n++, index++)
        {
          ans[int.Parse(input[0]), int.Parse(input[index])] = 1;
        }
      }
      for (int n = 1; n < size + 1; n++)
      {
        for (int nn = 1; nn < size + 1; nn++)
        {
          Console.Write(ans[n, nn] + " ");
        }
        Console.WriteLine();
      }
    }
  }
}
