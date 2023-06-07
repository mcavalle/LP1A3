package sdk.festivo.api;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import sdk.festivo.model.Country;
import sdk.festivo.model.HolidaysResponse;

public class PublicHolidaysApiTest {
    
    @Test
    void criaUmObjetoPublicHolidayApi(){
        var apiKey = "API_KEY";
        var api = new PublicHolidaysApi(apiKey);
        Assertions.assertNotNull(api);
    }

    @Test
    void listaFeriadosDoBR() throws IOException, InterruptedException{
        var apiKey = System.getenv("API_KEY");
        var api = new PublicHolidaysApi(apiKey);
        HolidaysResponse response = api.listHolidays("BR", "2022");

        System.out.println(response);

        Assertions.assertEquals(200, response.getStatus());
        Assertions.assertEquals("BR", response.getQuery().getCountry());
        Assertions.assertEquals("2022", response.getQuery().getYear());

    }

    @Test
    void listarPaises() throws IOException, InterruptedException{
        var apiKey = System.getenv("API_KEY");
        var api = new PublicHolidaysApi(apiKey);
        List<Country> countries = api.listCountries();

        System.out.println(countries);

        Assertions.assertFalse(countries.isEmpty());
    }
}
