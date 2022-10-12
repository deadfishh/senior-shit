import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PostCard extends JFrame
{
    public static PostCard frame = new PostCard();
    public static String f = "<html> <font face = Serif size = 4>";
    public static String ff = "</font>";
    //public static Integer[] options = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
    public static ImageIcon icon = new ImageIcon("/uploads/book/book_PNG51109.png");
    public static int[] ratings = new int[8];
    public static String[] chars = {"Beowulf", "Grendel", "Hamlet", "Claudius", "Ophelia", "Tim O'Brien", "Jimmy Cross", "Victor Frankenstein", "the Creature", "Sethe", "Paul D", "Beloved", "Nick", "Daisy", "Gatsby"};
  
    // making the postcard thing
    public PostCard()
    {
      getContentPane().setBackground(Color.blue.brighter());
      setTitle("AP Lit Character Sun Moon and Rising Signs");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setResizable(false);
      setSize(600, 500);
      getContentPane().setLayout(null);
    }  
    
    // closes the JOptionPane
    private void closeIt()
    {
      this.getContentPane().setVisible(false);
      this.dispose();
    }

    // main ap lit project!!
    public static void aplit()
    {
      System.out.println("\ngood morning!");
      System.out.println("take the above test!");
      System.out.println("it's a little bit glitchy so if you have to take it twice, that's okay.");
        // here is our array
        int[][] array = {
                          {5, 5, 5, 5, -2, -5, -5, 5},
                          {1, 3, 1, 2, -2, 1, -5, -1},
                          {-2, -2, 2, -5, 3, 4, -1, -3},
                          {-3, 5, 4, 3, -5, -3, -5, -5},
                          {-4, -2, -5, -5, 5, 5, 5, 5},
                          {-4, -3, 2, -2, 3, 4, -3, 3},
                          {4, -2, 5, 3, 4, 2, 3, 4},
                          {-4, 5, 2, 5, -4, -5, -5, -5},
                          {-4, 1, -2, -2, 3, 5, 3, 5},
                          {5, 3, 2, -3, 5, 5, 5, -3},
                          {-1, -1, 1, 2, 2, -2, -3, 3},
                          {1, 5, 4, 5, -3, -1, -5, 2},
                          {0, 2, -1, 3, 4, 1, 2, -1},
                          {-4, -3, -5, 3, -5, -2, -5, -5},
                          {-5, 5, 4, -4, 4, 3, -2, -3},
                      };
                        
        PostCard frame = new PostCard();

        // brave
        Prompt brave = new Prompt(0);
        brave.setQuestion("mrs o is subbing.  you...");
        String[] braveAnswerss = {"A) don't do the work but mess around on your laptop", "B) do the assigned work", "C) pull out your phone", "D) ask her how her cataracts surgery went"};
        brave.setAnswers(braveAnswerss);

        // ambitious
        Prompt ambitious = new Prompt(1);
        ambitious.setQuestion("when do you do the most work on ap lit projects?");
        String[] ambitiousAnswerss = {"A) the night before", "B) the moment they're assigned", "C) a day or two before they're due", "D) when we get in-class time to do them"};
      ambitious.setAnswers(ambitiousAnswerss);

        // leader
        Prompt leader = new Prompt(2);
        leader.setQuestion("in a pastoral poem, you are…");
        String[] leaderAnswerss = {"A) the grass", "B) the sheep", "C) the shephard", "D) the poet"};
        leader.setAnswers(leaderAnswerss);

        // confident
        Prompt confident = new Prompt(3);
        confident.setQuestion("how often do you participate in discussions?");
        String[] confidentAnswerss = {"A) once per discussion", "B) as often as i can", "C) i don't ever talk in them", "D) when i have a good idea"};
        confident.setAnswers(confidentAnswerss);

        // compationate
        Prompt compationate = new Prompt(4);
        compationate.setQuestion("if somebody doesn’t have a group for a project, would you invite them to be part of yours?");
        String[] compationateAnswerss = {"A) no, i like my current group", "B) yes, of course", "if it's someone smart that can help me with the work", "D) if it's someone i like"};
        compationate.setAnswers(compationateAnswerss);

        // humble
        Prompt humble = new Prompt(5);
        humble.setQuestion("you got first place in the kahoot.  what do you do?");
        String[] humbleAnswerss = {"A) keep it to myself", "B) announce it to my friends at lunch", "C) tell my family and closest friends", "D) high-five the person next to me"};
        humble.setAnswers(humbleAnswerss);

        // selfless
        Prompt selfless = new Prompt(6);
        selfless.setQuestion("your friend needs helping getting the ap lit essay started.  what would you do?");
        String[] selflessAnswerss = {"A) tell them to ask ecc for help", "B) meet with them after school and brainstorm together", "C) nothing, it's not my problem", "D) help them talk through their ideas for a few minutes in class"};
        selfless.setAnswers(selflessAnswerss);

        // honest
        Prompt honest = new Prompt(7);
        honest.setQuestion("do you cheat on ms. eccleston’s reading quizzes?");
        String[] honestAnswerss = {"A) never", "B) yes, every single one", "C) a few times", "D) only if i didn't read"};
        honest.setAnswers(honestAnswerss);

        // printing each of the questions
        getMC(brave);
        getMC(ambitious);
        getMC(leader);
        getMC(confident);
        getMC(compationate);
        getMC(humble);
        getMC(selfless);
        getMC(honest);
        
        character(array);
        getOkay("thank you to chloe lee for helping with this!");
        getOkay("thanks for playing :)");
        frame.closeIt();
    }
   
    // gets the multiple choice question
    public static void getMC(Prompt p)
    {
        String question = f + p.getQuestion() + ff;
        String response = (String)JOptionPane.showInputDialog(frame, question, "AP Lit Final Project", JOptionPane.QUESTION_MESSAGE, icon, p.getAnswers(), p.getAnswers()[0]);
        String letter = response.substring(0, 1);
        int izzie = 0;
        int num = p.getNum();
        switch (num)
        {
            case 0:
                switch (letter)
                {
                  case "A":
                    izzie = 2;
                    break;
                  case "B":
                    izzie = -5;
                    break;
                  case "C":
                    izzie = 5;
                    break;
                  case "D":
                    izzie = -2;
                    break;
                }
                break;
            case 1:
                switch (letter)
                {
                  case "A":
                    izzie = -5;
                    break;
                  case "B":
                    izzie = 4;
                    break;
                  case "C":
                    izzie =-2;
                    break;
                  case "D":
                    izzie = 1;
                    break;
                }
                break;
            case 2:
                switch (letter)
                {
                  case "A":
                    izzie = -5;
                    break;
                  case "B":
                    izzie = -3;
                    break;
                  case "C":
                    izzie = 3;
                    break;
                  case "D":
                    izzie = 5;
                    break;
                }
                break;
            case 3:
                switch (letter)
                {
                  case "A":
                    izzie = -2;
                    break;
                  case "B":
                    izzie = 5;
                    break;
                  case "C":
                    izzie = -4;
                    break;
                  case "D":
                    izzie = 2;
                    break;
                }
                break;
            case 4:
              switch (letter)
                {
                  case "A":
                    izzie = -4;
                    break;
                  case "B":
                    izzie = 5;
                    break;
                  case "C":
                    izzie = -2;
                    break;
                  case "D":
                    izzie = 2;
                    break;
                }
                break;
            case 5:
              switch (letter)
                {
                  case "A":
                    izzie = 4;
                    break;
                  case "B":
                    izzie = -4;
                    break;
                  case "C":
                    izzie = 2;
                    break;
                  case "D":
                    izzie = -1;
                    break;
                }
                break;
            case 6:
              switch (letter)
                {
                  case "A":
                    izzie = -2;
                    break;
                  case "B":
                    izzie = 5;
                    break;
                  case "C":
                    izzie = -4;
                    break;
                  case "D":
                    izzie = 2;
                    break;
                }
                break;
            case 7:
              switch (letter)
                {
                  case "A":
                    izzie = 5;
                    break;
                  case "B":
                    izzie = -4;
                    break;
                  case "C":
                    izzie = 3;
                    break;
                  case "D":
                    izzie = -2;
                    break;
                }
                break;
        }
        ratings[num] = izzie;
    }
    
    public static void getOkay(String prompt)
    {
        prompt = f + prompt + ff;
        String[] okays = {"OK"};
        int m = JOptionPane.showConfirmDialog(frame, prompt, "AP Lit Final Project", JOptionPane.DEFAULT_OPTION);
    }
    
    public static void character(int[][] array)
    {
        double dot = 0;
        double closest1 = 5000;
        int closest1Index = 0;
        double closest2 = 0;
        int closest2Index = 0;
        double closest3 = 5000;
        int closest3Index = 0;
        double farthest = 0;
        int farthestIndex = 0;
        for (int i = 0; i < ratings.length; i++)
        {
            dot += ratings[i] * ratings[i];
        }
        
        for (int i = 0; i < array.length; i++)
        {
            int temp = 0;
            // makes the dot product
            for (int j = 0; j < ratings.length; j++)
            {
                temp += array[i][j] * ratings[j];
            }
            // sees if this value is closer
            if (Math.abs(temp - dot) < Math.abs(dot - closest1))
            {
                if (closest2 != 5000)
                {
                  closest3 = closest2;
                  closest3Index = closest2Index;
                }
                if (closest1 != 5000)
                {
                  closest2 = closest1;
                  closest2Index = closest1Index;
                }
                closest1 = temp;
                closest1Index = i;
            }
            else if (Math.abs(temp - dot) < Math.abs(dot - closest2))
            {
                if (closest2 != 5000)
                {
                  closest3 = closest2;
                  closest3Index = closest2Index;
                }
                closest2 = temp;
                closest2Index = i;
            }
            else if (Math.abs(temp - dot) < Math.abs(dot - closest3))
            {
                closest3 = temp;
                closest3Index = i;
            }
            // sees if this value is farther
            if (Math.abs(temp - dot) > Math.abs(dot - farthest))
            {
                farthest = temp;
                farthestIndex = i;
            }
        }
        getOkay("time for the awards!");

      
        String c1String = "you are the most similar to " + chars[closest1Index] + "!";
        getOkay(c1String);
        double c1percent = 1 - ((Math.abs(dot - closest1))/(dot));
        c1percent = Math.round(c1percent * 1000.0) / 10.0;
        String c1PercentString = "you have " + c1percent + "% compatability with this character.";
        getOkay(c1PercentString);

      
        String c2String = "you are the second most simliar to " + chars[closest2Index] + "!";
        getOkay(c2String);
        double c2percent = 1 - ((Math.abs(dot - closest2))/(dot));
        c2percent = Math.round(c2percent * 1000.0) / 10.0;
        String c2PercentString = "you have " + c2percent + "% compatability with this character.";
        getOkay(c2PercentString);


        String c3String = "you are the third most similar to " + chars[closest3Index] + "!";
      getOkay(c3String);
      double c3percent = 1 - ((Math.abs(dot - closest3))/(dot));
      c3percent = Math.round(c3percent * 1000.0) / 10.0;
      String c3PercentString = "you have " + c3percent + "% compatability with this character.";
      getOkay(c3PercentString);

      
        String fString = "you are the least similar to " + chars[farthestIndex] + "!";
        getOkay(fString);
        double fpercent = 1 - ((Math.abs(dot - farthest))/(dot));
        fpercent = Math.round(fpercent * 1000.0) / 10.0;
        String f2String = "you have " + fpercent + "% compatability with this character.";
        getOkay(f2String);
    }

}

//rachel can you see this edit?
// yes omfg
