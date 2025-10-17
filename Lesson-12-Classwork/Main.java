import java.util.HashMap;
import java.util.Map;

class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  boolean collegeCredit(String code) {
    if (code.charAt(5) == 'E' || code.charAt(5) == 'M') {
      //ik it should be.equals( substring(5, 6)) but im lazy
      return true;
    } else {
      return false;

    }
  };

  String getCounsoler(String officialClass) {
    Map<Character, String> consolers = new HashMap<>();

    consolers.put('B', "Berrouet");
    consolers.put('C', "Chu");
    consolers.put('D', "Dinn");
    consolers.put('E', "Eyzengart");
    consolers.put('F', "Flores");
    consolers.put('G', "Gibson");
    consolers.put('L', "Shim Lee");
    consolers.put('M', "Meltzer");
    consolers.put('P', "Paccione");
    consolers.put('S', "Fiore");
    consolers.put('T', "Tsai");
    consolers.put('Z', "Zayes");

    return consolers.get(officialClass.charAt(0));
    /*
     * B-Berrouet
C-Chu
D-Dinn
E-Eyzengart
F-Flores
G-Gibson
L-Shim Lee
M-Meltzer
P-Paccione
S-Fiore
T-Tsai
Z-Zayes
     */
  }

  String imageType(String filename) {
    String extension = filename.substring(filename.indexOf('.') + 1);

    if (extension.equals("jpg") || extension.equals("jpeg")) {
      return "Joint Photographic Experts Group";
    }
    if (extension.equals("png")) {
      return "Portable Network Graphics";
    }
    if (extension.equals("gif")) {
      return "Graphics Interchange Format";
    }
    if (extension.equals("pdf")) {
      return "Portable Document Format";
    }
    return "Unknown";
  }

  void init(){
    print(collegeCredit("MATH-101-E"));
    print(collegeCredit("HIST-E02-A"));
    print(getCounsoler("F33"));
    print(imageType("photograph.mp4"));
    print(imageType("photograph.jpg"));

   

    
  }

 
}