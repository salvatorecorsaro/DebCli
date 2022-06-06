///usr/bin/env jbang "$0" "$@" ; exit $?

import model.Song;
import org.fusesource.jansi.AnsiConsole;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;


@Command(name = "DebCli", version = "DebCli 1.0", mixinStandardHelpOptions = true)
public class DebCli implements Runnable {


    @Parameters(paramLabel = "<word>", defaultValue = "Hello, picocli",
            description = "Words to be repeated")
    private String[] words = {"Hello,", "picocli"};

    @Override
    public void run() {
        System.out.println("DebCli 1.0");
        var song = new Song("The Sign", "Ace of Base", "4:03");
        System.out.println(song);
    }

    public static void main(String[] args) {

        AnsiConsole.systemInstall();

        int exitCode = new CommandLine(new DebCli()).execute(args);
        AnsiConsole.systemUninstall();
        System.exit(exitCode);
    }
}