import java.util.*;
#added comments for testing CI poll
/** NameAndDate prints my name and the exact date and time. */
public class NameAndDate
{ public static void main(String[] args)
{ System.out.print("Fred Mertz --- ");
// The next statement creates an object:
GregorianCalendar c = new GregorianCalendar();
System.out.println(c.getTime()); // ask c the time and print its reply
System.out.println();
System.out.println("Finished");
}
}
