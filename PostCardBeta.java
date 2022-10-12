import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PostCard extends JFrame
{
    public static PostCard frame = new PostCard();
    public static String f = "<html> <font face = Serif size = 6>";
    public static String ff = "</font>";
    public static Integer[] options = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
    public static ImageIcon icon = new ImageIcon("/uploads/book/book_PNG51109.png");
    public static int[] ratings = new int[8];
    public static String[] chars = {"Beowulf", "Grendel", "Hamlet", "Claudius", "Ophelia", "Tim O'Brien", "Jimmy Cross"};
    public PostCard()
    {

        getContentPane().setBackground(Color.magenta.darker().darker().brighter());
        setTitle("Rachel Tjarksen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(800, 500);
        getContentPane().setLayout(null);

    }
    
    public static void makeArray()
    {
        int[][] array = {
                            {5, 5, 5, 5, -2, -5, -5, 5},
                            {1, 3, 1, 2, -2, 1, -5, -1},
                            {-2, -2, 2, -5, 3, 4, -1, -3},
                            {-3, 5, 4, 3, -5, -3, -5, -5},
                            {-4, -2, -5, -5, 5, 5, 5, 5},
                            {-4, -3, 2, -2, 3, 4, -3, 3},
                            {4, -2, 5, 3, 4, 2, 3, 4}
                    
                };
    }    
    


    private void closeIt()
    {

        this.getContentPane().setVisible(false);
        this.dispose();

    }

    
    public static void main(String[] args)
    {
        int[][] array = {
                            {5, 5, 5, 5, -2, -5, -5, 5},
                            {1, 3, 1, 2, -2, 1, -5, -1},
                            {-2, -2, 2, -5, 3, 4, -1, -3},
                            {-3, 5, 4, 3, -5, -3, -5, -5},
                            {-4, -2, -5, -5, 5, 5, 5, 5},
                            {-4, -3, 2, -2, 3, 4, -3, 3},
                            {4, -2, 5, 3, 4, 2, 3, 4}
                    
                        };
                        
        PostCard frame = new PostCard();
        
        boolean redo = true;
        //int n = (Integer)JOptionPane.showInputDialog(null, "Pick a number that is not prime:", "Prime numbers", JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
        
        String bravePrompt = "would you go inside the haunted house on green bay?";
        String[] braveAnswers = {"A) no, that's too scary", "B) only during broad daylight", "C) only if rachel was with me", "D) i live in that haunted house"};
        String ambitiousPrompt = "how many ivies did you apply to?";
        String[] ambitiousAnswers = {"A) none", "B) 1", "C) 2", "D) 3+"};
        String leaderPrompt = "which drum major are you most similar to?";
        String[] leaderAnswers = {"A) will boyle", "B) evan jasica", "C) margaret jemian", "D) katie pierce"};
        String confidentPrompt = "which milk man are you?";
        String[] confidentAnswers = {"A) shweeny todd", "B) kirages", "C) puchovich", "D) dimiter"};
        
        String compationatePrompt = "are you nice to milk men?";
        String[] compationateAnswers = {"A) never, i hate them", "B) if i like him", "C) sorta", "D) yes always"};
        String humblePrompt = "how often to you announce your ACT score?";
        String[] humbleAnswers = {"A) multiple times per day", "B) every week", "C) every so often", "D) never"};
        String selflessPrompt = "how selfless are you?";
        String[] selflessAnswers = {"A) not at all", "B) kind of", "C) a decent amount", "D) extremely"};
        String honestPrompt = "would you cheat on an ILE?";
        String[] honestAnswers = {"A) an in instant", "B) if i had a good opportunity", "C) probably not", "D) never"};
        
        getMC(bravePrompt, braveAnswers, 0);
        getMC(ambitiousPrompt, ambitiousAnswers, 1);
        getMC(leaderPrompt, leaderAnswers, 2);
        getMC(confidentPrompt, confidentAnswers, 3);
        
        getMC(compationatePrompt, compationateAnswers, 4);
        getMC(humblePrompt, humbleAnswers, 5);
        getMC(selflessPrompt, selflessAnswers, 6);
        getMC(honestPrompt, honestAnswers, 7);
        
        character(array);
        getOkay("thanks for playing :)");
        frame.closeIt();
    }
    
    public static void getInfo(String prompt, int n)
    {
        prompt = f + prompt + ff;
        int score = (Integer)JOptionPane.showInputDialog(frame, prompt, "AP Lit Final Project", JOptionPane.QUESTION_MESSAGE, null, options, options[5]);
        ratings[n] = score;
    }
    
    public static void getMC(String prompt, String[] answers, int n)
    {
        prompt = f + prompt + ff;
        String response = (String)JOptionPane.showInputDialog(frame, prompt, "AP Lit Final Project", JOptionPane.QUESTION_MESSAGE, icon, answers, answers[0]);
        String letter = response.substring(0, 1);
        int izzie = 0;
        switch (letter)
        {
            case "A":
                izzie = -5;
                break;
            case "B":
                izzie = -2;
                break;
            case "C":
                izzie = 2;
                break;
            case "D":
                izzie = 4;
                break;
        }
        ratings[n] = izzie;
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
        double closest = 5000;
        int closestIndex = 0;
        double farthest = 0;
        int farthestIndex = 0;
        for (int i = 0; i < ratings.length; i++)
        {
            dot += ratings[i] * ratings[i];
        }
        
        for (int i = 0; i < array.length; i++)
        {
            int temp = 0;
            for (int j = 0; j < ratings.length; j++)
            {
                temp += array[i][j] * ratings[j];
            }
            if (Math.abs(temp - dot) < Math.abs(temp - closest))
            {
                closest = temp;
                closestIndex = i;
            }
            if (Math.abs(temp - dot) > Math.abs(temp - farthest))
            {
                farthest = temp;
                farthestIndex = i;
            }
        }
        getOkay("time for the awards!");
        String cString = "you are the most similar to " + chars[closestIndex] + "!";
        getOkay(cString);
        double cpercent = 1 - ((Math.abs(dot - closest))/(dot));
        cpercent = Math.round(cpercent * 1000.0) / 10.0;
        String c2String = "you have " + cpercent + "% compatability with this character.";
        getOkay(c2String);
        String fString = "you are the least similar to " + chars[farthestIndex] + "!";
        getOkay(fString);
        double fpercent = 1 - ((Math.abs(dot - farthest))/(dot));
        fpercent = Math.round(fpercent * 1000.0) / 10.0;
        String f2String = "you have " + fpercent + "% compatability with this character.";
        getOkay(f2String);
    }

}

