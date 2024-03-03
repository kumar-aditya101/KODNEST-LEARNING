import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class WeatherFetcher {

    public static void main(String[] args) {
        // Replace "a9ee6d3cdaffee6a29a9bf0ee3199a9e" with your actual API key from OpenWeatherMap
        String apiKey = "a9ee6d3cdaffee6a29a9bf0ee3199a9e";

        // Get the city name from user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the city name: ");

        try {
            String city = reader.readLine();

            // Construct the URL with parameters
            String endpointUrl = "http://api.openweathermap.org/data/2.5/weather";
            URL url = new URL(endpointUrl + "?q=" + city + "&apiKey=" + apiKey);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            // Check if the request was successful (status code 200)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response from the API
                BufferedReader apiReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = apiReader.readLine()) != null) {
                    response.append(line);
                }

                // Close the BufferedReader
                apiReader.close();

                // Parse the JSON response
                JSONObject jsonResponse = new JSONObject(response.toString());

                // Extract temperature information
                JSONObject main = jsonResponse.getJSONObject("main");
                double temperature = main.getDouble("temp");

                // Print the temperature
                System.out.println("Temperature for " + city + ": " + temperature + " Kelvin");

            } else {
                System.out.println("Error: Unable to fetch weather data. Response Code: " + responseCode);
            }

            // Close the connection
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
