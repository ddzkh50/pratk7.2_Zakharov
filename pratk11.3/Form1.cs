using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace pratk11._3
{
    public partial class Form1 : Form
    {
        bool TF = true;

        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Robot robot = new Robot();
            robot.AddHp((int)numericUpDown1.Value, 0);
            robot.AddHp((int)numericUpDown2.Value, 1);
            robot.AddHp((int)numericUpDown3.Value, 2);
            label1.Text = $"Кол-во жизней робота в начале игры - {robot.GetLife(0)}";
            robot.min(robot.GetLife(0), 0);
            label2.Text = $"Кол-во жизней робота после игры - {robot.GetLife(0)}";

            label4.Text = $"Кол-во жизней робота в начале игры - {robot.GetLife(1)}";
            robot.min(robot.GetLife(1), 1);
            label5.Text = $"Кол-во жизней робота после игры - {robot.GetLife(1)}";

            label6.Text = $"Кол-во жизней робота в начале игры - {robot.GetLife(2)}";
            robot.min(robot.GetLife(2), 2);
            label7.Text = $"Кол-во жизней робота после игры - {robot.GetLife(2)}";

            TF = true;
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void numericUpDown1_ValueChanged(object sender, EventArgs e)
        {

        }

        private void numericUpDown4_ValueChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            //Robot robot = new Robot();
            //if ((int)numericUpDown4.Value == 1)
            //{
            //    robot.ChangeHp(30, 1);
            //    robot.ChangeHp(30, 2);
            //}
            //else if ((int)numericUpDown4.Value == 2)
            //{
            //    robot.ChangeHp(30, 0);
            //    robot.ChangeHp(30, 2);
            //}
            //else if ((int)numericUpDown4.Value == 3)
            //{
            //    robot.ChangeHp(30, 0);
            //    robot.ChangeHp(30, 1);
            //}

            //label1.Text = $"Кол-во жизней робота в начале игры - {robot.GetLife(0)}";
            //label2.Text = $"Кол-во жизней робота после игры - {robot.GetLife(0)}";

            //label4.Text = $"Кол-во жизней робота в начале игры - {robot.GetLife(1)}";
            //label5.Text = $"Кол-во жизней робота после игры - {robot.GetLife(1)}";

            //label6.Text = $"Кол-во жизней робота в начале игры - {robot.GetLife(2)}";
            //label7.Text = $"Кол-во жизней робота после игры - {robot.GetLife(2)}";

            //TF = false;
        }
    }
}
