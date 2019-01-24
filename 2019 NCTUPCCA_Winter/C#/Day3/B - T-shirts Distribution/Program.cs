using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace B___T_shirts_Distribution
{
  class Program
  {
    public static source[] sr = new source[6];
    public static String[][] man;
    public static String[] man_sort;
    static void Main(string[] args)
    {
      sr[0].Group = "S";
      sr[1].Group = "M";
      sr[2].Group = "L";
      sr[3].Group = "XL";
      sr[4].Group = "XXL";
      sr[5].Group = "XXXL";

      String[] input = Console.ReadLine().Split(' ');
      for (int n = 0; n < input.Length; n++)
        if (input[n]!="0")
          sr[n].size += int.Parse(input[n]);

      man = new String[int.Parse(Console.ReadLine),];
      man_sort = new String[man.Length];
      for (int nth = 0; nth < man.Length; nth++)
      {
        String[] input2 = Console.ReadLine().split(',');
        man[nth] = input2;
      }

      sort(0, 0);
      Boolean test = true;
      for (int n = 0; n < man_sort.Length; n++)
      {
        if (man_sort[n] == null)
        {
          test = false;
          break;
        }
      }
      if (test)
      {
        System.out.println("YES");
        for (int n = 0; n < man.Length; n++)
          System.out.println(man_sort[n]);
      }
      else
        System.out.println("NO");
    }


    public static int size_index(String size)
    {
      for (int n = 0; n < sr.Length; n++)
        if (size==sr[n].Group)
          return n;
      return -1;
    }

    public static void sort(int number, int sizeIndex)
    {

      if (sizeIndex >= man[number].Length)
        return;

      int size = size_index(man[number][sizeIndex]);
      if (sr[size].size <= 0)
      {
        sort(number, sizeIndex + 1);
        return;
      }


      man_sort[number] = sr[size].Group;

      sr[size].size--;

      Boolean test = false;
      for (int n = 0; n < man_sort.Length; n++)
      {
        if (man_sort[n] == null)
        {
          test = true;
          break;
        }
      }
      if (test)
      {
        sort(number + 1, 0);
        sort(number + 1, 1);
      }

    }

  }

  class source
  {
    public String Group;
    public int size;
  }
}
}
