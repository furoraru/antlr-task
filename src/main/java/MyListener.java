import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyListener extends langBaseListener {
    private final Map<String, Integer> variables;

    public MyListener() {
        variables = new HashMap<>();
    }

    @Override
    public void exitAssign(langParser.AssignContext ctx) {
        String variableName = ctx.ID(0).getText();
        String value = ctx.ID().size() > 1 ?
                ctx.ID(1).getText() : ctx.NUM().getText();
        // let a be b
        if (ctx.ID().size() > 1)
            variables.put(variableName, variables.get(value));
        else
            variables.put(variableName, Integer.parseInt(value));

    }

    @Override
    public void exitAdd(langParser.AddContext ctx) {
        String variableName = ctx.ID().size() > 1 ?
                ctx.ID(1).getText() : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ?
                variables.get(ctx.ID(0).getText()) : Integer.parseInt(ctx.NUM().getText());

        variables.put(variableName, variables.get(variableName) + value);
    }

    @Override
    public void exitSub(langParser.SubContext ctx) {
        String variableName = ctx.ID().size() > 1 ?
                ctx.ID(1).getText() : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ?
                variables.get(ctx.ID(0).getText()) : Integer.parseInt(ctx.NUM().getText());

        variables.put(variableName, variables.get(variableName) - value);
    }

    @Override
    public void exitDiv(langParser.DivContext ctx) {
        String variableName = ctx.ID().size() > 1 ?
                ctx.ID(1).getText() : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ?
                variables.get(ctx.ID(0).getText()) : Integer.parseInt(ctx.NUM().getText());

        variables.put(variableName, variables.get(variableName) / value);
    }

    @Override
    public void exitMod(langParser.ModContext ctx) {
        String variableName = ctx.ID().size() > 1 ?
                ctx.ID(1).getText() : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ?
                variables.get(ctx.ID(0).getText()) : Integer.parseInt(ctx.NUM().getText());

        variables.put(variableName, variables.get(variableName) % value);
    }

    @Override
    public void exitMul(langParser.MulContext ctx) {
        String variableName = ctx.ID().size() > 1 ?
                ctx.ID(1).getText() : ctx.ID(0).getText();
        int value = ctx.ID().size() > 1 ?
                variables.get(ctx.ID(0).getText()) : Integer.parseInt(ctx.NUM().getText());

        variables.put(variableName, variables.get(variableName) * value);
    }

    @Override
    public void exitPrint(langParser.PrintContext ctx) {
        String output = ctx.ID() == null ?
                ctx.NUM().getText() : variables.get(ctx.ID().getText()).toString();
        System.out.println(output);
    }

    public static void main(String[] args) {
        try {
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName("/Users/19006837/IdeaProjects/language2/src/main/resources/test.lang");
            langLexer lexer = new langLexer(input);
            langParser parser = new langParser(new CommonTokenStream(lexer));
            parser.addParseListener(new MyListener());
            parser.program();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}