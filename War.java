import java.util.*;
public class War
{
public static void main(String args[])
{

int player1globalscore = 0;
int player2globalscore = 0;
Scanner keyboard = new Scanner(System.in);

   int globalpointstogain = 2;
   ArrayList<Integer> player1 = new ArrayList<Integer>();

     player1.add(2);
     player1.add(3);
     player1.add(4);
     player1.add(5);
     player1.add(6);
     player1.add(7);
player1.add(8);
player1.add(9);
player1.add(10);
player1.add(11);
player1.add(12);
player1.add(13);
   player1.add(14);
 ArrayList<Integer> player2 = new ArrayList<Integer>();

     player2.add(2);
     player2.add(3);
     player2.add(4);
     player2.add(5);
     player2.add(6);
     player2.add(7);
player2.add(8);
player2.add(9);
player2.add(10);
player2.add(11);
player2.add(12);
player2.add(13);
   player2.add(14);
for(int cardsUsed = 1;cardsUsed<13;cardsUsed++)
{
int wins = 0;
int draws = 0;
System.out.println("Your card");
int player1card = keyboard.nextInt();
for(int i =0;i<player1.size();i++)
{
if(player1.get(i) == player1card)
{
player1.remove(i);
}

}

System.out.println("CPUs card");
int player2card = keyboard.nextInt();
for(int i =0;i<player2.size();i++)
{
if(player2.get(i) == player2card)
{
player2.remove(i);
}

}
if(player1card > player2card)
{
player1globalscore += globalpointstogain;
globalpointstogain = 2;
}
if(player1card < player2card)
{
player2globalscore += globalpointstogain;
globalpointstogain = 2;
}
if(player1card == player2card)
{
globalpointstogain += 2;
}
   for(int i=0;i<100000;i++)
   {
   ArrayList<Integer> player1temp = new ArrayList<Integer>();
   for(int j = 0;j<player1.size();j++)
   {
   player1temp.add(player1.get(j));
   }
   ArrayList<Integer> player2temp = new ArrayList<Integer>();
      for(int j = 0;j<player2.size();j++)
   {
   player2temp.add(player2.get(j));
   }
   int player1score = player1globalscore;
   int player2score = player2globalscore;
   int pointstogain = globalpointstogain;
for(int j =0;j<13-cardsUsed;j++)
{
int random1 = (int)(Math.random()*(13-cardsUsed-j));
int random2 = (int)(Math.random()*(13-cardsUsed-j));
if(player1temp.get(random1) > player2temp.get(random2))
{
player1score += pointstogain;
pointstogain = 2;
}
if(player1temp.get(random1) < player2temp.get(random2))
{
player2score += pointstogain;
pointstogain = 2;
}
if(player1temp.get(random1) == player2temp.get(random2))
{
pointstogain += 2;
}
player1temp.remove(random1);
player2temp.remove(random2);
   }
if(player1score > player2score)
{
wins++;
}
if(player1score == player2score)
{
draws++;
}

}
System.out.println(wins/100000.0);
}
}

}