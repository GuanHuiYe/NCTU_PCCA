using System;
using System.Collections.Generic;


namespace D_Connected_Components
{
  public struct map
  {
    public Queue<int> member;
    public int group;
  }
  class Program
  {
    public static map[] MAP;
    static void Main(string[] args)
    {
      String[] input = Console.ReadLine().Split(' ');
      MAP = new map[int.Parse(input[0])];
      for(int n=0;n< int.Parse(input[0]); n++)
      {
        MAP[n].member = new Queue<int>();
      }
      for (int nth = int.Parse(input[1]); nth > 0; nth--)
      {
        String[] SNS = Console.ReadLine().Split(' ');

        MAP[int.Parse(SNS[0])].member.Enqueue(int.Parse(SNS[1]));
        MAP[int.Parse(SNS[1])].member.Enqueue(int.Parse(SNS[0]));
      }
      int number = 1;
      for (int n = 0; n < MAP.Length; n++)
      {
        if (MAP[n].member.Count == 0) continue;
        MAP[n].group = number;
        sort(n, number);
        number++;
      }
      for (int n = 0; n < MAP.Length; n++)
      {
        if (MAP[n].group == 0)
        {
          MAP[n].group = ++number;
        }
      }


      for (int n = int.Parse(Console.ReadLine()); n > 0; n--)
      {
        string[] q = Console.ReadLine().Split(' ');
        if (MAP[int.Parse(q[0])].group == MAP[int.Parse(q[1])].group) Console.WriteLine("yes");
        else Console.WriteLine("no");
      }
    }

    static void sort(int n, int number)
    {
      while (MAP[n].member.Count > 0)
      {
        int m = MAP[n].member.Dequeue();
        MAP[m].group = number;
        sort(m, number);
      }
    }
  }
}
