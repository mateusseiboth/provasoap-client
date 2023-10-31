
package br.seisbot.soap.servico;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfCurrenciesByNameResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCurrency"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfCurrenciesByNameResult"
})
@XmlRootElement(name = "ListOfCurrenciesByNameResponse")
public class ListOfCurrenciesByNameResponse {

    @XmlElement(name = "ListOfCurrenciesByNameResult", required = true)
    protected ArrayOftCurrency listOfCurrenciesByNameResult;

    /**
     * Obtém o valor da propriedade listOfCurrenciesByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public ArrayOftCurrency getListOfCurrenciesByNameResult() {
        return listOfCurrenciesByNameResult;
    }

    /**
     * Define o valor da propriedade listOfCurrenciesByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public void setListOfCurrenciesByNameResult(ArrayOftCurrency value) {
        this.listOfCurrenciesByNameResult = value;
    }

}
