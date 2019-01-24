using System;

using System.Collections.Generic;
using System.Linq;


namespace C_Breadth_First_Search
{
  class Program
  {
    static void Main(string[] args)
    {
      int size = int.Parse(Console.ReadLine());
      arraysize = size;
      ansarr = new int[size+1];
      int[,] ans = new int[size + 1, size + 1];
      for (int nth = 1; nth < size + 1; nth++)
      {
        String[] input = Console.ReadLine().Split(' ');
        for (int n = 0, index = 2; n < int.Parse(input[1]); n++, index++)
        {
          ans[int.Parse(input[0]), int.Parse(input[index])] = 1;
        }
      }
    
      bfs(1, ans);
      for(int n = 1; n <= size; n++)
      {
        if (ansarr[n] == 0)
        {
          if(n==1) Console.WriteLine(n + " " + ansarr[n] );
          else Console.WriteLine(n + " -1");
        }
        else
        {
          Console.WriteLine(n + " " + ansarr[n] );
        }
       
        
      }

    }
    public static int arraysize;
    public static int[] ansarr;
    static void bfs(int s, int[,] arr)
    {
      Queue<int> q = new Queue<int>();
      q.Enqueue(s);
      ansarr[s] = 0;
      while (true)
      {
        int num = q.Dequeue();
        for(int n = 1; n <= arraysize ; n++)
        {
          if (arr[num, n] == 0) continue;
          if (ansarr[n]==0&&n!=1  || ansarr[n] > ansarr[num]+1) { 
          ansarr[n] = ansarr[num] + 1;
          }
          else
          {
            continue;
          }
          int[] check = q.ToArray<int>();
          Boolean test = true;
          foreach(int c in check)
          {
            if (c == n) { test = false; break; }
          }
          if(test) q.Enqueue(n);
        }
        if (q.Count == 0) break;
      }
    }
  }
}
