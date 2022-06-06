///usr/bin/env jbang "$0" "$@" ; exit $?

import enums.Color;
import model.Person;
import model.Song;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Help.Ansi;
import picocli.CommandLine.Parameters;




@Command(name = "DebCli", version = "DebCli 1.0", mixinStandardHelpOptions = true)
public class DebCli implements Runnable {


    @Parameters(paramLabel = "<word>", defaultValue = "Hello, picocli",
            description = "Words to be repeated")
    private String[] words = {"Hello,", "picocli"};

    @Override
    public void run() {
        System.out.println((char) 27 + "[31m" + "ERROR MESSAGE IN RED");
        String str = Ansi.AUTO.string("@|bold,green,underline Hello, colored world!|@");
        System.out.println(str);
        var x = new Person("Jd", Color.RED);
        System.out.println("Hello, " + x.name + "!" + " Your favorite color is " + x.favoriteColor);
        System.out.println(String.join(" ", words) + "!!");

        var s = new Song("Hello", "picocli", "3:00");
        System.out.println(s);
    }

    public static void main(String[] args) {
        System.out.println((char) 27 + "[31m" + "ERROR MESSAGE IN RED");

        System.out.println((char) 27 + "[31m" + "ERROR MESSAGE IN RED");

        var x = """
                                
                "Hola mundo, yo soy %s"
                                
                                
                """.formatted("Salva");
        System.out.println(x);
        System.out.print(CommandLine.Help.Ansi.AUTO.string("@|cyan Naua CLI |@"));

        String str = Ansi.AUTO.string("@|bold,green,underline Hello, colored world!|@");
        System.out.println(str);
        System.out.println("@|green Hello, colored world!|@");
        int exitCode = new CommandLine(new DebCli()).execute(args);

        System.exit(exitCode);
    }
}