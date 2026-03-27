class AI {
    String name;
    String type;
    AI(String name, String type) {
        this.name = name;
        this.type = type;
    }
    //common behavior
    public void introduce() {
        System.out.println("I am" + name + ", a " + type + " AI model.");
    }
   public void performTask() {
        System.out.println("Performing a general AI task...");
    }
}
class AIAgents extends AI {
    String company;
    public AIAgents(String name, String type, String company) {
        super(name, type);
        this.company = company;
    }
    @Override
    public void introduce() {
        System.out.println("I am " + name + ", a " + type + 
        " AI model developed by " + company + ".");
    }
    @Override
    public void performTask() {
         System.out.println(name + " is performing autonomous AI tasks.");
    }
}
public class Main {
    public static void main(String[] args) {
        AI[] aiAgents = {
            new AI("Gemini", "text"),
            new AIAgents("Chat GPT", "Text", "OpenAI"),
            new AI("Claude", "code")
        };
        for (AI agent: aiAgents) {
            agent.introduce();
            agent.performTask();
        }
    }
}
// I amGemini, a text AI model.
// Performing a general AI task...
// I am Chat GPT, a Text AI model developed by OpenAI.
// Chat GPT is performing autonomous AI tasks.
// I amClaude, a code AI model.
// Performing a general AI task...