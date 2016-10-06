package jfml.rulebase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import jfml.defuzzifier.Defuzzifier;
import jfml.defuzzifier.DefuzzifierContinuous;
import jfml.defuzzifier.DefuzzifierDiscrete;
import jfml.knowledgebase.variable.FuzzyVariableType;
import jfml.knowledgebase.variable.KnowledgeBaseVariable;
import jfml.knowledgebase.variable.TsukamotoVariableType;
import jfml.membershipfunction.SingletonMembershipFunction;
import jfml.rule.ClauseType;
import jfml.rule.ConsequentClausesType;
import jfml.rule.FuzzyRuleType;
import jfml.term.FuzzyTerm;
import jfml.term.FuzzyTermType;

/**
 * <p>Java class for ruleBaseType complex type.
 * 
 * <pre>
 * &lt;complexType name="ruleBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rule" type="{http://www.ieee1855.org}fuzzyRuleType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="activationMethod" type="{http://www.ieee1855.org}activationMethodType" default="MIN" />
 *       &lt;attribute name="andMethod" type="{http://www.ieee1855.org}andMethodType" default="MIN" />
 *       &lt;attribute name="orMethod" type="{http://www.ieee1855.org}orMethodType" default="MAX" />
 *       &lt;attribute name="networkAddress" type="{http://www.ieee1855.org}networkAddressType" default="127.0.0.1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ruleBaseType", propOrder = {
    "rules"
})
public class RuleBaseType extends FuzzySystemRuleBase{

    @XmlElement(required = true, name="rule")
    protected List<FuzzyRuleType> rules;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String name;
    @XmlAttribute(name = "activationMethod")
    protected String activationMethod;
    @XmlAttribute(name = "andMethod")
    protected String andMethod;
    @XmlAttribute(name = "orMethod")
    protected String orMethod;
    @XmlAttribute(name = "networkAddress")
    protected String networkAddress;

   
    /**
    * Default constructor
    */
    public RuleBaseType(){
    	
    }

    /**
     * Constructor using name. Rest elements by default
     * @param name
     * @param type
     */
    public RuleBaseType(String name, int type){
    	super();
    	setName(name);
    	setRuleBaseSystemType(type);
    	setActivationMethod(FuzzySystemRuleBase.defaultActivationMethod);
    	setAndMethod(FuzzySystemRuleBase.defaultAndMethod);
    	setOrMethod(FuzzySystemRuleBase.defaultOrMethod);
    }
    
    /**
     * 
     * @param name
     * @param activation
     * @param and
     * @param or
     */
    public RuleBaseType(String name, String activation, String and, String or, int type){
    	super();
    	setName(name);
    	setActivationMethod(activation);
    	setAndMethod(and);
    	setOrMethod(or);
    	setRuleBaseSystemType(type);
    }
    
    /**
     * Gets the value of the rule property.
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link FuzzyRuleType }
     * 
     * 
     */
    public List<FuzzyRuleType> getRules() {
        if (rules == null) {
            rules = new ArrayList<FuzzyRuleType>();
        }
        return this.rules;
    }
    
    public void addRule(FuzzyRuleType rule){
    	if (rules == null) {
            rules = new ArrayList<FuzzyRuleType>();
        }
    	if(rule!=null)
    		rules.add(rule);
    }

    /**
     * Gets the value of the property name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the property name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the property activationMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationMethod() {
        if (activationMethod == null) {
            return FuzzySystemRuleBase.defaultActivationMethod;
        } else {
            return activationMethod;
        }
    }

    /**
     * Sets the value of the property activationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationMethod(String value) {
        this.activationMethod = value;
    }

    /**
     * Gets the value of the property andMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAndMethod() {
        if (andMethod == null) {
            return "MIN";
        } else {
            return andMethod;
        }
    }

    /**
     * Sets the value of the property andMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAndMethod(String value) {
        this.andMethod = value;
    }

    /**
     * Gets the value of the property orMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrMethod() {
        if (orMethod == null) {
            return "MAX";
        } else {
            return orMethod;
        }
    }

    /**
     * Sets the value of the property orMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrMethod(String value) {
        this.orMethod = value;
    }

    /**
     * Gets the value of the property networkAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkAddress() {
        if (networkAddress == null) {
            return "127.0.0.1";
        } else {
            return networkAddress;
        }
    }

    /**
     * Sets the value of the property networkAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkAddress(String value) {
        this.networkAddress = value;
    }
	
	public void evaluate() {
		//evaluate each rule
		for(FuzzyRuleType r : getRules()){
			//if rule r has not defined and / or method, set the rule base and/or method
			if(!r.isAndMethodDefined())
				r.setAndMethod(getAndMethod());
			
			if(!r.isOrMethodDefined())
				r.setOrMethod(getOrMethod());
			
			float value = Float.NaN;
			//evaluate antecedents
			value = evaluateAntecedents(r);
			
			// Apply weight - the importance of the rule to be used by the inference engine
			value *= r.getWeight();
			
			// Activation rule consequents: Apply evaluation to consequent linguisticTerms
			implyConsequents(r, value);
			
			// sets the evaluation value to the rule r
			r.setEvaluation(value);
		}
	}
	
	private void implyConsequents(FuzzyRuleType r, float ant_evaluation) {
		ConsequentClausesType then = r.getConsequent().getThen();
		ConsequentClausesType _else = r.getConsequent().getElse();
		if(then!=null){
			for(ClauseType c : then.getClause()){				
				if(c!=null && c.getVariable() instanceof FuzzyVariableType)
					activationMamdani((FuzzyVariableType)c.getVariable(),(FuzzyTerm)c.getTerm(),ant_evaluation);
				else if(c!=null && c.getVariable() instanceof TsukamotoVariableType)
					activationTsukamoto((TsukamotoVariableType)c.getVariable(),(FuzzyTerm)c.getTerm(),ant_evaluation);
			}
			
			if(_else!=null){
				for(ClauseType c : _else.getClause()){
					if(c!=null && c.getVariable() instanceof FuzzyVariableType)
						activationMamdani((FuzzyVariableType)c.getVariable(),(FuzzyTerm)c.getTerm(),(1-ant_evaluation));
					else if(c!=null && c.getVariable() instanceof TsukamotoVariableType)
						activationTsukamoto((TsukamotoVariableType)c.getVariable(),(FuzzyTerm)c.getTerm(),(1-ant_evaluation));
				}
			}
		}
	}

	private void activationMamdani(FuzzyVariableType v, FuzzyTerm t, float ant_evaluation) {
		if(v.getDefuzzifier() instanceof DefuzzifierContinuous){
			DefuzzifierContinuous defuzzifier = (DefuzzifierContinuous) v.getDefuzzifier();
			float membership, y, x, aggregated = 0;
			
			// Add membership degree to defuzzifier
			Iterator<Float> it = defuzzifier.iterator();
			while(it.hasNext()){
				x = it.next();
				membership = t.getMembershipValue(x);

				//IMPLICATION (activation process)
				y = activation(ant_evaluation, membership); 

				//ACCUMULATION
				aggregated = v.accumulation(defuzzifier.getValueY(x), y);
				defuzzifier.setPoint(x, aggregated);
			}
			/*x = defuzzifier.getMin();
			double step = defuzzifier.getStepSize();
			int i, length = defuzzifier.getLength();
	
			// Add membership degrees to defuzzifier
			for (i = 0; i < length; i++, x += step) {
				membership = t.getMembershipValue(x);
				
				if(membership==1)
					System.out.println(x);
	
				//IMPLICATION (activation process)
				y = activation(ant_evaluation, membership);
	
				//ACCUMULATION
				aggregated = v.accumulation(defuzzifier.getValue(i), y);
				defuzzifier.setValue(i, aggregated);
			}*/
		}
		/*else{
			DefuzzifierDiscrete defuzzifierDiscrete = (DefuzzifierDiscrete) v.getDefuzzifier();
			float membership, y, x, aggregated = 0;
			
			if(t.getMembershipFunction() instanceof SingletonMembershipFunction == false)
				throw new RuntimeException("MembershipFunction is not Singleton.\n");

			// Add membership degree to defuzzifier
			Iterator<Float> it = defuzzifierDiscrete.iterator();
			while(it.hasNext()){
				x = it.next();
				membership = t.getMembershipValue(x);

				y = activation(ant_evaluation, membership); 

				// Aggregate value
				aggregated = v.accumulation(defuzzifierDiscrete.getDiscreteValue(x), y);
				defuzzifierDiscrete.setPoint(x, aggregated);
			}
		}*/
	}
	
	
	private void activationTsukamoto(TsukamotoVariableType v, FuzzyTerm t, float ant_evaluation) {
		v.addEvaluation(ant_evaluation,t.getFi(ant_evaluation));
	}
	

	private float evaluateAntecedents(FuzzyRuleType r){
		List<ClauseType> clauses = r.getAntecedent().getClauses();
		float[] degrees = new float[clauses.size()];
		for(int i=0;i<clauses.size();i++){
			ClauseType c= clauses.get(i);
			FuzzyTermType t=null;
			FuzzyVariableType v=null;
			if(c!=null && c.getTerm() instanceof FuzzyTermType)
				t = (FuzzyTermType) c.getTerm();
			if(c.getVariable() instanceof FuzzyVariableType)
				v = (FuzzyVariableType) c.getVariable();
				
			if(t!=null && v!=null)
				degrees[i] = c.modifierMembershipDegree(t.getMembershipValue(v.getValue()));
		}
		
		//aggregate degrees (connector operator)
		return r.aggregation(degrees);
	}
	
	@Override
	public void reset() {
		for(FuzzyRuleType r : getRules())
			r.reset();
	}

	@Override
	public String toString() {
		String b= "  *"+ getRuleBaseSystemTypeName() + " - " + getName() + ": OR=" + getOrMethod() + "; AND="+getAndMethod() + "; ACTIVATION=" + getActivationMethod() + "\n";
		int numRule=1;
		for(FuzzyRuleType r : getRules())
			b += "\tRULE "+(numRule++) + ": " +r.toString() +"\n";
			
		return b;
	}
    
}
