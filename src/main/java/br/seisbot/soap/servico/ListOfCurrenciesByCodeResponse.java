
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
 *         &lt;element name="ListOfCurrenciesByCodeResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCurrency"/&gt;
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
    "listOfCurrenciesByCodeResult"
})
@XmlRootElement(name = "ListOfCurrenciesByCodeResponse")
public class ListOfCurrenciesByCodeResponse {

    @XmlElement(name = "ListOfCurrenciesByCodeResult", required = true)
    protected ArrayOftCurrency listOfCurrenciesByCodeResult;

    /**
     * Obtém o valor da propriedade listOfCurrenciesByCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public ArrayOftCurrency getListOfCurrenciesByCodeResult() {
        return listOfCurrenciesByCodeResult;
    }

    /**
     * Define o valor da propriedade listOfCurrenciesByCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public void setListOfCurrenciesByCodeResult(ArrayOftCurrency value) {
        this.listOfCurrenciesByCodeResult = value;
    }

}
