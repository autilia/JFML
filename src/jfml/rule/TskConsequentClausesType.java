package jfml.rule;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import jfml.knowledgebase.variable.KnowledgeBaseVariable;
import jfml.term.FuzzyTerm;
import jfml.term.TskTerm;


/**
 * <p>Java class for tskConsequentClausesType complex type.
 * 
 * <pre>
 * &lt;complexType name="tskConsequentClausesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tskClause" type="{http://www.ieee1855.org}tskClauseType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * @author sotillo19
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tskConsequentClausesType", propOrder = {
    "tskClause"
})
public class TskConsequentClausesType {

    @XmlElement(required = true)
    protected List<TskClauseType> tskClause;

    /**
     * Gets the value of the tskClause property.
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TskClauseType }
     * 
     * 
     */
    public List<TskClauseType> getTskClause() {
        if (tskClause == null) {
            tskClause = new ArrayList<TskClauseType>();
        }
        return this.tskClause;
    }
    
    /**
     * Adds a TskClauseType to the list of clauses
     * @param c a TskClauseType
     */
    public void addTskClause(TskClauseType c){
    	if (tskClause == null) {
    		tskClause = new ArrayList<TskClauseType>();
        }
    	if(c!=null)
    		tskClause.add(c);
    }
    
    /**
     * Adds a TskClauseType with a {@link KnowledgeBaseVariable } and a {@link FuzzyTerm }
     * @param variable the {@link KnowledgeBaseVariable }
     * @param term the {@link FuzzyTerm }
     */
    public void addTskClause(KnowledgeBaseVariable v, TskTerm t){
    	if (tskClause == null) {
    		tskClause = new ArrayList<TskClauseType>();
        }
    	TskClauseType c = new TskClauseType(v,t);
    	if(c!=null)
    		tskClause.add(c);
    }

}
