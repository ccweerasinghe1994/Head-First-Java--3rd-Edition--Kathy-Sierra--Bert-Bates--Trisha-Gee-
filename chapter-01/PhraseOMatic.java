public class PhraseOMatic{
  public static void main(String [] args){
    String [] wordListOne = {"agnostic", "opinionated",
"voice activated", "haptically driven", "extensible",
"reactive", "agent based", "functional", "AI enabled",
"strongly typed"};

String[] wordListTwo = {"loosely coupled", "six sigma","asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless",
"microservices", "distributed ledger"};

String[] wordListThree = {"framework", "library",
"DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design",
"orientation"};

String [] wordListFour = {"Java", "C#", "Python", "Ruby"};


// find out how many words are in each list
int oneLength = wordListOne.length;
System.out.println("There are " + oneLength + " words in the first list.");
int twoLength = wordListTwo.length;
System.out.println("There are " + twoLength + " words in the second list.");
int threeLength = wordListThree.length;
System.out.println("There are " + threeLength + " words in the third list.");
int fourLength = wordListFour.length;
System.out.println("There are " + fourLength + " words in the fourth list.");

// generate three random numbers

java.util.Random randomGenerator = new java.util.Random();
int rand1 = randomGenerator.nextInt(oneLength);
int rand2 = randomGenerator.nextInt(twoLength);
int rand3 = randomGenerator.nextInt(threeLength);
int rand4 = randomGenerator.nextInt(fourLength);

// now build a phrase

String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] + " " + wordListFour[rand4];
System.out.println("What we need is a " + phrase + ".");



}


}