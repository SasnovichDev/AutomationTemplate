package Main;
/* DO NOT TOUCH LEAVE AS IS!!!!!!!!! */
public class Main {
    public static void main(String[] args) throws Exception {
        String runner = "";
        String cucmumberOptions = "";

        try {
            if (args.length > 0) {
                runner = args[0];
                System.setProperty("env", args[1]);
            } else {
                throw new NumberFormatException();
            }
        } catch (Exception e) {
            throw new Exception("", e);
        }

        for (int i = 2; (args.length >= 2) && (args.length > i); i++) {
            cucmumberOptions = cucmumberOptions.concat(String.format(" " + args[i]));
        }


        // if  cucumber.options args do not exists use the defualt TAG in the runner.
        //else...
        if (args.length > 2) {
            System.setProperty("cucumber.options", cucmumberOptions);
        }
        org.junit.runner.JUnitCore.main(runner);
    }
}
