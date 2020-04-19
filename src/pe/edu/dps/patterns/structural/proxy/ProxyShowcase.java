package pe.edu.dps.patterns.structural.proxy;


import pe.edu.dps.common.Showcase;
import pe.edu.dps.patterns.structural.decorator.AnswerGenerator;

public class ProxyShowcase implements Showcase {

    private final AnswerProxy answerGenerator;
    private final String sampleQuestion = "What's the category for Proxy Pattern?";
    public ProxyShowcase() {
        AnswerGenerator realGenerator = new AnswerGenerator();
        realGenerator.addAnswer(sampleQuestion, "Structural");
        this.answerGenerator = new AnswerProxy(realGenerator);

    }

    @Override
    public void show() {
        System.out.println("Proxy Pattern Showcase");
        System.out.println(sampleQuestion);
        System.out.println(answerGenerator.giveAnswerTo(sampleQuestion));
        System.out.println(String.format("Again, %s", sampleQuestion));
        System.out.println(answerGenerator.giveAnswerTo(sampleQuestion));

    }
}
