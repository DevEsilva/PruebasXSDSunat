//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.07.09 a las 11:58:26 PM COT 
//


package org.example.oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SpecificationIDType;


/**
 * 
 *             
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 *                &lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;
 *                &lt;ccts:DictionaryEntryName&gt;Promotional Specification. Details&lt;/ccts:DictionaryEntryName&gt;
 *                &lt;ccts:Definition&gt;A class to describe a promotional event as a set of item locations that share a set of promotional tactics.&lt;/ccts:Definition&gt;
 *                &lt;ccts:ObjectClass&gt;Promotional Specification&lt;/ccts:ObjectClass&gt;
 *             &lt;/ccts:Component&gt;
 * </pre>
 * 
 *          
 * 
 * <p>Clase Java para PromotionalSpecificationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromotionalSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecificationID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PromotionalEventLineItem" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EventTactic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalSpecificationType", propOrder = {
    "specificationID",
    "promotionalEventLineItem",
    "eventTactic"
})
public class PromotionalSpecificationType {

    @XmlElement(name = "SpecificationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SpecificationIDType specificationID;
    @XmlElement(name = "PromotionalEventLineItem", required = true)
    protected List<PromotionalEventLineItemType> promotionalEventLineItem;
    @XmlElement(name = "EventTactic")
    protected List<EventTacticType> eventTactic;

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Promotional Specification. Specification Identifier. Identifier&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;An identifier for this promotional specification.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Promotional Specification&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTerm&gt;Specification Identifier&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;
     *                      &lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                
     * 
     * @return
     *     possible object is
     *     {@link SpecificationIDType }
     *     
     */
    public SpecificationIDType getSpecificationID() {
        return specificationID;
    }

    /**
     * Define el valor de la propiedad specificationID.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationIDType }
     *     
     */
    public void setSpecificationID(SpecificationIDType value) {
        this.specificationID = value;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Promotional Specification. Promotional Event Line Item&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;A line item for a promotional event involving a specific product at a specific location; it describes the expected impacts associated with the event and specifies the promotional price of the item."&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;1..n&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Promotional Specification&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTerm&gt;Promotional Event Line Item&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Promotional Event Line Item&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Promotional Event Line Item&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                Gets the value of the promotionalEventLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalEventLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalEventLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionalEventLineItemType }
     * 
     * 
     */
    public List<PromotionalEventLineItemType> getPromotionalEventLineItem() {
        if (promotionalEventLineItem == null) {
            promotionalEventLineItem = new ArrayList<PromotionalEventLineItemType>();
        }
        return this.promotionalEventLineItem;
    }

    /**
     * 
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     *                      &lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;
     *                      &lt;ccts:DictionaryEntryName&gt;Promotional Specification. Event Tactic&lt;/ccts:DictionaryEntryName&gt;
     *                      &lt;ccts:Definition&gt;An event tactic associated with this promotion.&lt;/ccts:Definition&gt;
     *                      &lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;
     *                      &lt;ccts:ObjectClass&gt;Promotional Specification&lt;/ccts:ObjectClass&gt;
     *                      &lt;ccts:PropertyTerm&gt;Event Tactic&lt;/ccts:PropertyTerm&gt;
     *                      &lt;ccts:AssociatedObjectClass&gt;Event Tactic&lt;/ccts:AssociatedObjectClass&gt;
     *                      &lt;ccts:RepresentationTerm&gt;Event Tactic&lt;/ccts:RepresentationTerm&gt;
     *                   &lt;/ccts:Component&gt;
     * </pre>
     * 
     *                Gets the value of the eventTactic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventTactic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventTactic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTacticType }
     * 
     * 
     */
    public List<EventTacticType> getEventTactic() {
        if (eventTactic == null) {
            eventTactic = new ArrayList<EventTacticType>();
        }
        return this.eventTactic;
    }

}
