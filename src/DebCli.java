///usr/bin/env jbang "$0" "$@" ; exit $?

import enums.Color;
import model.Person;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;


@Command(name = "DebCli", version = "DebCli 1.0", mixinStandardHelpOptions = true)
@SuppressWarnings("all")
public class DebCli implements Runnable {


    @Parameters(paramLabel = "<word>", defaultValue = "Hello, picocli",
            description = "Words to be repeated")
    private String[] words = {"Hello,", "picocli"};

    @Override
    public void run() {

        var x = new Person("Jd", Color.RED);
        System.out.println("Hello, " + x.name + "!" + " Your favorite color is " + x.favoriteColor);
        System.out.println(String.join(" ", words) + "!!");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new DebCli()).execute(args);
        System.exit(exitCode);
    }
}