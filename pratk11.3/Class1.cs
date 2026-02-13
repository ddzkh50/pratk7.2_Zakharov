using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pratk11._3
{
    class Robot
    {
        private int[] hp = new int[3];
        public int GetLife(int a)
        {
            return hp[a];
        }

        public void AddHp(int a, int b)
        {
            hp[b] = a;
        }

        public void ChangeHp(int a, int b)
        {
            hp[b] = hp[b] + a;
        }

        public void min(int a, int b)
        {
            hp[b] = a;
            hp[b] = (int)hp[b] / 2;
        }
    }
}
