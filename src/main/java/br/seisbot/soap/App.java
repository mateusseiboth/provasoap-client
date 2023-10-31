package br.seisbot.soap;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import br.seisbot.soap.servico.ArrayOftContinent;
import br.seisbot.soap.servico.CountryISOCode;
import br.seisbot.soap.servico.CountryInfoServiceSoapType;
import br.seisbot.soap.servico.FullCountryInfoResponse;
import br.seisbot.soap.servico.ListOfContinentsByName;
import br.seisbot.soap.servico.TContinent;
import br.seisbot.soap.servico.TCountryInfo;
import br.seisbot.soap.servico.TCurrency;
import jakarta.xml.ws.Service;

public class App 
{
    public static void main( String[] args ) throws Exception  {
    	
    	URL urlWSDL = new URL("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL");
        
        QName nameSpace = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoService");
  
        Service serviceSoap = Service.create(urlWSDL, nameSpace);
        
      
        
        CountryInfoServiceSoapType  isoPais = serviceSoap.getPort(CountryInfoServiceSoapType.class);
        TCurrency informacao = isoPais.countryCurrency("BRL");
        
        
        ArrayOftContinent continents = isoPais.listOfContinentsByName();

       List<TContinent> conti = continents.getTContinent();
        
        for (TContinent continent : conti) {
            System.out.println("Continente: " + continent.getSName());
        }
        System.out.println("Moeda do Brazil: " + informacao.getSName());
       
 
    }
}
