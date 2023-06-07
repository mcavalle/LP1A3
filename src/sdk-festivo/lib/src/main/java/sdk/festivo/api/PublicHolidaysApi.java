package sdk.festivo.api;

    import java.io.IOException;
    import java.net.URI;
    import java.net.http.HttpClient;
    import java.net.http.HttpRequest;
    import java.net.http.HttpResponse;
    import java.util.List;

    import com.fasterxml.jackson.core.type.TypeReference;
    import com.fasterxml.jackson.databind.ObjectMapper;

import sdk.festivo.model.Country;
import sdk.festivo.model.HolidaysResponse;

//?country=US&year=2020&api_key=XXXXXX-XXXX-XXXX-XXXX-XXXXXXXXX
public class PublicHolidaysApi {
    private final String API_URL;
    private String apiKey;
    private HttpClient client;
    private ObjectMapper mapper;

    public PublicHolidaysApi(String apiKey){
        this.apiKey = apiKey;
        this.API_URL = "https://api.getfestivo.com/v2/holidays?api_key=" + this.apiKey;
        this.client = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper();
    }

    public HolidaysResponse listHolidays(String country, String year) throws IOException, InterruptedException{
        URI uri = URI.create(API_URL + "&country=" + country + "&year=" + year);

        HttpRequest request = generateRequest(uri);
        
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            var holidaysResponse = mapper.readValue(response.body(), HolidaysResponse.class);

        return holidaysResponse;
    }

    public List<Country> listCountries() throws IOException, InterruptedException{
        URI uri = URI.create("https://api.getfestivo.com/v2/countries?api_key=" + this.apiKey);

        HttpRequest request = generateRequest(uri);

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            List<Country> countries = mapper.readValue(response.body(), new TypeReference<List<Country>>() {});

            return countries;
    }

    private HttpRequest generateRequest(URI uri){
        return HttpRequest.newBuilder()
        .uri(uri)
        .GET()
        .header("Content-Type", "application/json")
        .build();
    }

}
