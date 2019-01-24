using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace E___Oil_Deposits
{
  class Program
  {
    static void Main(string[] args)
    {
      while (true)
      {
        String[] input = Console.ReadLine().Split(' ');
        if (input[0] == "0" && input[1] == "") break;
        input = Console.ReadLine().Split(' ');
        String[,] map = new string[int.Parse(input[0]), int.Parse(input[1])];

      }
    }
  }
}
