package com.baeldung.freemarker.util;

import com.baeldung.freemarker.model.*;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SuM_ on 1/27/17.
 */
public class MainTest {

    public static void main(String[] argc) {

        /*ObjectMapper mapper = new ObjectMapper();

        //For testing
        User user = createDummyUser();

        try {
            //Convert object to JSON string and save into file directly
            mapper.writeValue(new File("user.json"), user);

            //Convert object to JSON string
            String jsonInString = mapper.writeValueAsString(user);
            System.out.println(jsonInString);

            //Convert object to JSON string and pretty print
            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            System.out.println(jsonInString);


        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        ObjectMapper mapper = new ObjectMapper();

        try {

            // Convert JSON string from file to Object
            //User user = mapper.readValue(new File("user.json"), User.class);
            //System.out.println(user);

            // Convert JSON string to Object
            //BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("contract-survey.json"), Charset.forName("UTF-8")));
            //String jsonInString = null;
            String jsonInString = "{\n" +
                    "          \"payload\": {\n" +
                    "            \"_id\": \"BJgY883Bg\",\n" +
                    "            \"referral\": {\n" +
                    "              \"code\": \"9Emp6prBDXZZ\",\n" +
                    "              \"history\": []\n" +
                    "            },\n" +
                    "            \"name\": \"Chris  Caknow shopper\",\n" +
                    "            \"email\": \"chris@caknow.com\",\n" +
                    "            \"phone\": \"6262504302\",\n" +
                    "            \"ct\": 1483658871,\n" +
                    "            \"__v\": 20,\n" +
                    "            \"rate\": {\n" +
                    "              \"salesTax\": 0.09,\n" +
                    "              \"serviceFee\": 0.1\n" +
                    "            },\n" +
                    "            \"geoLoc\": {\n" +
                    "              \"lng\": -118.300032,\n" +
                    "              \"lat\": 33.741723\n" +
                    "            },\n" +
                    "            \"address\": {\n" +
                    "              \"postalCode\": \"90731\",\n" +
                    "              \"state\": \"CA\",\n" +
                    "              \"city\": \"San Pedro\",\n" +
                    "              \"lineOne\": \"241 s la alameda ave\",\n" +
                    "              \"lineTwo\": \"\",\n" +
                    "              \"country\": \"US\"\n" +
                    "            },\n" +
                    "            \"verified\": true,\n" +
                    "            \"stripeAccount\": {\n" +
                    "              \"id\": \"acct_19YkeEGVDui0lmlq\",\n" +
                    "              \"verificationStatus\": \"unverified\",\n" +
                    "              \"chargesEnabled\": true,\n" +
                    "              \"transfersEnabled\": false,\n" +
                    "              \"bankAccounts\": [\n" +
                    "                {\n" +
                    "                  \"isDefault\": true,\n" +
                    "                  \"last4\": \"6789\",\n" +
                    "                  \"routingNumber\": \"110000000\",\n" +
                    "                  \"status\": \"new\",\n" +
                    "                  \"bankName\": \"STRIPE TEST BANK\"\n" +
                    "                }\n" +
                    "              ],\n" +
                    "              \"entityType\": null,\n" +
                    "              \"legalBusinessName\": null,\n" +
                    "              \"legalFirstName\": null,\n" +
                    "              \"legalLastName\": null,\n" +
                    "              \"dateOfBirth\": {\n" +
                    "                \"day\": null,\n" +
                    "                \"month\": null,\n" +
                    "                \"year\": null\n" +
                    "              },\n" +
                    "              \"billingAddress\": {\n" +
                    "                \"city\": null,\n" +
                    "                \"country\": \"US\",\n" +
                    "                \"line1\": null,\n" +
                    "                \"line2\": null,\n" +
                    "                \"postal_code\": null,\n" +
                    "                \"state\": null\n" +
                    "              }\n" +
                    "            }\n" +
                    "          }\n" +
                    "        }";
            Affiliate affiliate = mapper.readValue(jsonInString, Affiliate.class);
            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(affiliate);
            System.out.println(jsonInString);

            System.out.println("----------------------------------------");

            String jsonInString1 = "{\n" +
                    "          \"payload\": {\n" +
                    "            \"metadata\": {\n" +
                    "              \"queryCount\": 1,\n" +
                    "              \"perPageCount\": 25,\n" +
                    "              \"pageCount\": 1,\n" +
                    "              \"page\": 1\n" +
                    "            },\n" +
                    "            \"data\": [\n" +
                    "              {\n" +
                    "                \"_id\": \"BJgY883Bg\",\n" +
                    "                \"referral\": {\n" +
                    "                  \"code\": \"9Emp6prBDXZZ\",\n" +
                    "                  \"history\": []\n" +
                    "                },\n" +
                    "                \"name\": \"Chris  Caknow shopper\",\n" +
                    "                \"email\": \"chris@caknow.com\",\n" +
                    "                \"phone\": \"6262504302\",\n" +
                    "                \"ct\": 1483658871,\n" +
                    "                \"createBy\": 0,\n" +
                    "                \"rate\": {\n" +
                    "                  \"serviceFee\": 0.1\n" +
                    "                },\n" +
                    "                \"address\": {\n" +
                    "                  \"postalCode\": \"90731\",\n" +
                    "                  \"state\": \"CA\",\n" +
                    "                  \"city\": \"San Pedro\"\n" +
                    "                },\n" +
                    "                \"verified\": true\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          }\n" +
                    "        }";
            Affiliates affiliates = mapper.readValue(jsonInString1, Affiliates.class);
            jsonInString1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(affiliates);
            System.out.println(jsonInString1);

            System.out.println("----------------------------------------");

            String jsonInString2 = "{\n" +
                    "          \"payload\": {\n" +
                    "            \"metadata\": {\n" +
                    "              \"queryCount\": 1,\n" +
                    "              \"perPageCount\": 25,\n" +
                    "              \"pageCount\": 1,\n" +
                    "              \"page\": 1\n" +
                    "            },\n" +
                    "            \"data\": [\n" +
                    "              {\n" +
                    "                \"_id\": \"By_UyL2Sg\",\n" +
                    "                \"email\": \"chris@caknow.com\",\n" +
                    "                \"fName\": \"zhen\",\n" +
                    "                \"lName\": \"gong\",\n" +
                    "                \"phone\": \"6262504302\",\n" +
                    "                \"referral\": {\n" +
                    "                  \"code\": \"Y9zDa16101DE\"\n" +
                    "                },\n" +
                    "                \"ct\": 1483657039,\n" +
                    "                \"verified\": true\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          }\n" +
                    "        }";
            Consumers consumers = mapper.readValue(jsonInString2, Consumers.class);
            jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(consumers);
            System.out.println(jsonInString2);

            System.out.println("----------------------------------------");

            String jsonInString3 = "{\n" +
                    "          \"error\": {\n" +
                    "            \"code\": \"StaleDocumentVersion\"\n" +
                    "          }\n" +
                    "        }";
            MyError myError = mapper.readValue(jsonInString3, MyError.class);
            jsonInString3 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myError);
            System.out.println(jsonInString3);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static User createDummyUser(){

        User user = new User();

        user.setName("mkyong");
        user.setAge(33);

        List<String> msg = new ArrayList<>();
        msg.add("hello jackson 1");
        msg.add("hello jackson 2");
        msg.add("hello jackson 3");

        user.setMessages(msg);

        return user;

    }
}
