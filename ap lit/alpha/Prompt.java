public class Prompt
  {
    private int num;
    private String question;
    private String[] answers;
    public Prompt(int theNum)
    {
      num = theNum;
      question = "";
    }

    public int getNum()
    {
      return num;
    }

    public void setNum(int theNum)
    {
      num = theNum;
    }

    public void setQuestion(String theQuestion)
    {
      question = theQuestion;
    }

    public String getQuestion()
    {
      return question;
    }

    public void setAnswers(String[] theAnswers)
    {
      answers = theAnswers;
    }

    public String[] getAnswers()
    {
      return answers;
    }
    
  }
