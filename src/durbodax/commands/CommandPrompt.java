package durbodax.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kirk Seddon
 */
public final class CommandPrompt {

    private int currentIndex;
    private final String[] userPrompts;
    private final BufferedReader bufferedReader;
  
    public CommandPrompt(String[] prompts) {
    	System.out.println("flow:14");
        userPrompts = prompts;
        currentIndex = 0;
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    }
    
    public int size() {
    	System.out.println("flow:15");
        return userPrompts.length;
    }
    
    public String getPrompt(int i) {
    	System.out.println("flow:16");
        return userPrompts[i];
    }

    public void reset() {
    	System.out.println("flow:17");
        currentIndex = 0;

    }
    
    public String displayNextPrompt() {

        
        try {
        	System.out.println("flow:18");
            String userInput = "";
            boolean isValid = false;
            boolean firstTry = true;
            do {

                if(!firstTry) {
                	System.out.println("flow:19");
                    System.out.println("Invalid input, please try again.");

                }
                 System.out.print(userPrompts[currentIndex] + ": ");
                 userInput = bufferedReader.readLine();

                 Test test = Test.getTest(userPrompts[currentIndex+1]);
                 switch(test) {

                    case Number: isValid = number.validate(userInput);
                    System.out.println("flow:20");
                    break;
                    case String: isValid = string.validate(userInput); 
                    System.out.println("flow:21");
                    break;
                    case Number1_or_2: isValid = number1_or_2.validate(userInput);
                    System.out.println("flow:22");
                    break;
                    case Number0_2: isValid = number0_2.validate(userInput);
                    System.out.println("flow:23");
                    break;
                    case Number0_3: isValid = number0_3.validate(userInput);
                    System.out.println("flow:24");
                    break;
                    case Number0_4: isValid = number0_4.validate(userInput);
                    System.out.println("flow:25");
                    break;
                    case Number0_6: isValid = number0_6.validate(userInput);
                    System.out.println("flow:26");
                    break;
                    case Number0_7: isValid = number0_7.validate(userInput); 
                    System.out.println("flow:27");
                    break;
                    case Number0_8: isValid = number0_8.validate(userInput);
                    System.out.println("flow:28");
                    break;
                    case Number0_9: isValid = number0_9.validate(userInput); 
                    System.out.println("flow:29");
                    break;
                    case Number1_6: isValid = number1_6.validate(userInput); 
                    System.out.println("flow:30");
                    break;
                    case Number1_7: isValid = number1_7.validate(userInput); 
                    System.out.println("flow:31");
                    break;
                    case Number1_13: isValid = number1_13.validate(userInput);
                    System.out.println("flow:32");
                    break;
                    case Last_Year: isValid = lastyear.validate(userInput); 
                    System.out.println("flow:33");
                    break;
                    case Link_to_Father: isValid = linktofather.validate(userInput);
                    System.out.println("flow:34");
                    break;
                    case Number_0_1_2_9: isValid = number_0_1_2_9.validate(userInput); 
                    System.out.println("flow:35");
                    break;
                    case Hours_Worked: isValid = hoursworked.validate(userInput); 
                    System.out.println("flow:36");
                    break;
                    case Age_Compare:
                    	System.out.println("flow:37");
                        isValid = ageCompare.validate(userInput);
                        if(isValid) {
                        	System.out.println("flow:38");
                            if(!"".equals(userInput.trim())){
                            	System.out.println("flow:39");
                                userInput =  "-a~"+ userInput;
                            }
                        }
                        break;
                    case  Income_Compare:
                    	System.out.println("flow:40");
                    	isValid = incomeCompare.validate(userInput);
                        if(isValid) {
                        	System.out.println("flow:41");
                            if(!"".equals(userInput.trim())){
                            	System.out.println("flow:42");
                                userInput = "-i~"+ userInput;
                            }
                        }
                        break;
                    case  MaritalStatus_Compare:
                    	System.out.println("flow:43");
                        isValid = marital_status.validate(userInput);
                        if(isValid) {
                        	System.out.println("flow:44");
                            if(!"".equals(userInput.trim())){
                            	System.out.println("flow:45");
                            	userInput = "-m~"+ userInput;
                            }
                        }
                        break;

                 }
                 firstTry = false;

            } while(isValid == false) ;

            currentIndex+=2;
            return userInput.trim();

        } catch(IOException e) {
        	System.out.println("flow:46");
             System.out.println(e.getStackTrace());
             System.out.println(e.getMessage());
        }
        
        currentIndex+=2;
        return " ";      
  }

    PromptTest number = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:46");
                Integer.parseInt(input);
                return true;

            } catch (NumberFormatException e) {
            	System.out.println("flow:47");
                return false;
            }
        }
    };

    PromptTest lastyear = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:48");
                int value = Integer.parseInt(input);

                if((value == 0) ||
                   (value == 10) ||
                   (value == 20) ||
                   (value == 31) ||
                   (value == 32) ||
                   (value == 33) ||
                   (value == 34) ||
                   (value == 35) ||
                   (value == 36) ||
                   (value == 40) ||
                   (value == 50)) {
                	System.out.println("flow:49");
                    return true;

                } else {
                	System.out.println("flow:50");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:51");
                return false;
            }
        }
    };

    PromptTest hoursworked = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:52");
                int value = Integer.parseInt(input);

                if((value == 0) ||
                   (value == 2) ||
                   (value == 3) ||
                   (value == 4) ||
                   (value == 5) ||
                   (value == 6) ||
                   (value == 7) ||
                   (value == 8)) {
                	System.out.println("flow:53");
                    return true;

                } else {
                	System.out.println("flow:54");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:55");
                return false;
            }
        }
    };
    
     PromptTest number_0_1_2_9 = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:56");
                int value = Integer.parseInt(input);

                if((value == 0) ||
                   (value == 1) ||
                   (value == 2) ||
                   (value == 9)) {
                	System.out.println("flow:57");
                    return true;

                } else {
                	System.out.println("flow:58");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:59");
                return false;
            }
        }
    };

    PromptTest linktofather = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:60");
                int value = Integer.parseInt(input);

                if((value == 0) ||
                   (value == 1) ||
                   (value == 2) ||
                   (value == 3) ||
                   (value == 4) ||
                   (value == 7)) {
                	System.out.println("flow:61");
                    return true;

                } else {
                	System.out.println("flow:62");

                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:63");
                return false;
            }
        }
    };

     PromptTest number1_or_2 = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:64");
                int value = Integer.parseInt(input);

                if((value == 1) || (value == 2)) {
                	System.out.println("flow:65");
                    return true;

                } else {
                	System.out.println("flow:66");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:67");
                return false;
            }
        }
    };

    PromptTest number1_6 = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:68");
                int value = Integer.parseInt(input);

                if((1<=value) && (value<=6)) {
                	System.out.println("flow:69");
                    return true;

                } else {
                	System.out.println("flow:70");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:71");
                return false;
            }
        }
    };

    PromptTest number1_7 = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:72");
                int value = Integer.parseInt(input);

                if((1<=value) && (value<=7)) {
                	System.out.println("flow:73");
                    return true;

                } else {
                	System.out.println("flow:74");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:75");
                return false;
            }
        }
    };

    PromptTest number1_13 = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:76");
                int value = Integer.parseInt(input);

                if((1<=value) && (value<=13)) {
                	System.out.println("flow:77");
                    return true;

                } else {
                	System.out.println("flow:78");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:79");
                return false;
            }
        }
    };

    PromptTest number0_2 = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:80");
                int value = Integer.parseInt(input);

                if((0<=value) && (value<=2)) {
                	System.out.println("flow:81");
                    return true;

                } else {
                	System.out.println("flow:82");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:83");
                return false;
            }
        }
    };

    PromptTest number0_3 = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:84");
                int value = Integer.parseInt(input);

                if((0<=value) && (value<=3)) {
                	System.out.println("flow:85");
                    return true;

                } else {
                	System.out.println("flow:86");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:87");
                return false;
            }
        }
    };
    
    PromptTest number0_4 = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:88");
                int value = Integer.parseInt(input);

                if((0<=value) && (value<=4)) {
                	System.out.println("flow:89");
                    return true;

                } else {
                	System.out.println("flow:90");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:91");
                return false;
            }
        }
    };

    PromptTest number0_6 = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:92");
                int value = Integer.parseInt(input);

                if((0<=value) && (value<=6)) {
                	System.out.println("flow:93");
                    return true;

                } else {
                	System.out.println("flow:94");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:95");
                return false;
            }
        }
    };

    PromptTest number0_7 = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:96");
                int value = Integer.parseInt(input);

                if((0<=value) && (value<=7)) {
                	System.out.println("flow:97");
                    return true;

                } else {
                	System.out.println("flow:98");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:99");
                return false;
            }
        }
    };

    PromptTest number0_8 = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:100");
                int value = Integer.parseInt(input);

                if((0<=value) && (value<=8)) {
                	System.out.println("flow:101");
                    return true;

                } else {
                	System.out.println("flow:102");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:103");
                return false;
            }
        }
    };


    PromptTest number0_9 = new PromptTest() {
        public boolean validate(String input) {
            try {
            	System.out.println("flow:104");
                int value = Integer.parseInt(input);

                if((0<=value) && (value<=9)) {
                	System.out.println("flow:105");
                    return true;

                } else {
                	System.out.println("flow:106");
                    return false;
                }

            } catch (NumberFormatException e) {
            	System.out.println("flow:107");
                return false;
            }
        }
    };

    PromptTest string = new PromptTest() {
        public boolean validate(String input) {
        	System.out.println("flow:113"); //lat addition
          return !"".equals(input.trim());
        }
      };

    PromptTest compare = new PromptTest() {
        public boolean validate(String input) {
          if("".equals(input.trim()))
          {
        	  System.out.println("flow:108");
              return true;
          } else {
            String[] values = input.split("-");
            if(values != null && values.length == 2) {
            	System.out.println("flow:109");
                if(values[0].equalsIgnoreCase("Under") || values[0].equalsIgnoreCase("Over")) {
                	System.out.println("flow:110");
                    if(number.validate(values[1])) {
                    	System.out.println("flow:111");
                        return true;
                    }
                }
            }
          }
          return false;
        }
      };

     PromptTest ageCompare = compare;
     PromptTest incomeCompare = compare;
     PromptTest marital_status = number1_6;

      public enum Test {

          Number("number"),
          String("string"),
          Number1_or_2("number1_or_2"),
          Number0_2("number0_2"),
          Number0_3("number0_3"),
          Number0_4("number0_4"),
          Number0_6("number0_6"),
          Number0_7("number0_7"),
          Number0_8("number0_8"),
          Number0_9("number0_9"),
          Number1_6("number1_6"),
          Number1_7("number1_7"),
          Number1_13("number1_13"),
          Link_to_Father("linktofather"),
          Number_0_1_2_9("number_0_1_2_9"),
          Hours_Worked("hoursworked"),
          Last_Year("lastyear"),
          Age_Compare("ageCompare"),
          Income_Compare("incomeCompare"),
          MaritalStatus_Compare("marital_status");

          private static final Map<String, Test> lookup = new HashMap<String, Test>();
          private String testType;

          static {

              for(Test test : EnumSet.allOf(Test.class)) {
            	  System.out.println("flow:112");

                  lookup.put(test.getTestType(), test);

              }

          }

          private Test(String testType) {
        	  System.out.println("flow:114");
              this.testType = testType;

          }

          public String getTestType() {
        	  System.out.println("flow:115");
              return testType;

          }

          public static Test getTest(String testType) {
        	  System.out.println("flow:116");
            return lookup.get(testType);

        }

      }
}