using System;


namespace B_Depth_First_Search
{
  class Program
  {
    static void Main(string[] args)
    {
      int size = int.Parse(Console.ReadLine());
      arraysize = size;
      inStamp = new int[size + 1];
      outStamp = new int[size + 1];
      int[,] ans = new int[size + 1, size + 1];
      for (int nth = 1; nth < size + 1; nth++)
      {
        String[] input = Console.ReadLine().Split(' ');
        for (int n = 0, index = 2; n < int.Parse(input[1]); n++, index++)
        {
          
          ans[int.Parse(input[0]), int.Parse(input[index])] = 1;
        }
      }


      dfs(1, ans);

      for (int n = 1; n <= arraysize; n++)
      {
        if (inStamp[n] == 0 || outStamp[n] ==0) dfs(n, ans);


      }

      for (int n = 1; n <= arraysize; n++)
      {
       
          Console.WriteLine(n + " " + inStamp[n] + " " + outStamp[n]);
       
       

      }
    }
    public static int arraysize;
    public static int[] inStamp;
    public static int[] outStamp;
    public static int Stamp = 0;
    public static void dfs(int u, int[,] arr)
    {
      inStamp[u] = ++Stamp;
      for (int n = 1; n <= arraysize; n++)
      {
        int v = arr[u, n];
        if (v == 0) continue;
        if (inStamp[n] == 0)
        {
          dfs(n, arr);
        }
      }
      outStamp[u] = ++Stamp;

    }
  }
}
