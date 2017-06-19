using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace jt
{
    class Program
    {
        static void Main()
        {
            int submissions = Convert.ToInt32(Console.ReadLine()), i , cases = 0;
            String r;
            Dictionary<String, int> results = new Dictionary<String, int>();

            for(i = 0; i < submissions; i++)
            {
                r = Console.ReadLine();
                if (!results.ContainsKey(r))
                    results.Add(r, 1);
                else
                    results[r]++;
            }

            for(i = 0; i < submissions; i++)
            {
                r = Console.ReadLine();
                if(results.ContainsKey(r) && results[r] > 0)
                {
                    results[r]--;
                    cases++;
                }
            }

            Console.WriteLine(cases);
            Console.Read();
        }
    }
}
